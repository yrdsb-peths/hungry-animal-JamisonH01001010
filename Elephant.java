import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    // Constructor
    public Elephant(){
        for(int i = 0; i < idle.length; i++){
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant(){
        setImage(idleIndex);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(3);
        }
        
        eat();
        
        animateElephant();
    }
    
    public void eat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}

