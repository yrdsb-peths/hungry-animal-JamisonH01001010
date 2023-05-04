import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    // Constructor
    
    public Elephant(){
        for(int i = 0; i < idle.length; i++){
            idle[i] = newGreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
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

