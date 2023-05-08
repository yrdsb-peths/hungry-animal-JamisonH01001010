import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Apple extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY() + 2; // falling apple
        setLocation(x, y);
        // Or just setLocation(getX(), getY() + 2);
        
        // If apple touches ground, game over
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this); //removes apple from world
        }
    }
}
