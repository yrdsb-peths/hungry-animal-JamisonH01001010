import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Apple extends Actor
{
    int speed = 1;
    public static boolean gameOver = false;
    public void act()
    {
        int x = getX();
        int y = getY() + speed; // falling apple
        setLocation(x, y);
        // Or just setLocation(getX(), getY() + speed);
        
        // If apple touches ground, game over
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            gameOver = true;
            world.gameOver();
            world.removeObject(this); //removes apple from world
        }        
    }
    
    public static boolean getGameOver(){
        return gameOver;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
