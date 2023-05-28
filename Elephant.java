import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    // Sound
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    
    // Idle animations
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] idleRight = new GreenfootImage[8];
    
    // Track elephant facing direction
    String facing = "right";
    
    // Timer
    SimpleTimer animationTimer = new SimpleTimer();
    
    int imageIndex = 0;
    
    public Elephant(){
        // Loop through images 0 - 7
        for(int i = 0; i < idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        // Loop backwards through images 7 - 0
        for(int i = 0; i < idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);
        }
        
        // Mark start of animation
        animationTimer.mark();
        
        // Inital elephant image
        setImage(idleRight[0]);
    }
    
    public void animateElephant(){
        // 0.1s delay
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        
        // Depending on elephant's facing direction, implement coressponding animation
        // Modulus part: To not cause array out of bounds error
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    
    public void act()
    {
        // Move left if left arrow key is pressed
        // Right if right arrow key is pressed
        // Only move if user pressed space to start game
        if(TitleScreen.getGameStart()){
            if(Greenfoot.isKeyDown("left")){
                move(-5);
                facing = "left";
            } else if(Greenfoot.isKeyDown("right")){
                move(5);
                facing = "right";
            }
        }
        
        eat();
        
        animateElephant();
    }
    
    public void eat(){
        // When the elephant touches the apple
        if(isTouching(Apple.class)){
            // Remove the touched apple
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            // Create a new apple
            world.createApple();
            // Increase the score
            world.increaseScore();
            // Play a sound effect
            elephantSound.play();
            // Assign achievements
            world.setAchievements();
        }
    }
}

