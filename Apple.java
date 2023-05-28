import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Apple extends Actor
{
    // Track speed
    int speed = 1;
    
    // Track game over
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
            world.setAchievements();
            TitleScreen.setGameStart(false);
        }        
    }
    
    /**
     * Return if game is over
     */
    public static boolean getGameOver(){
        return gameOver;
    }
    
    /**
     * Set if game is over
     */
    public static void setGameOver(boolean a){
        gameOver = a;
    }
    
    /**
     * Set how fast the apple falls
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
