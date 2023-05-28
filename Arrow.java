import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    // Track arrow orientation
    public static boolean orientation = true;
    
    public Arrow(){
        GreenfootImage arrow = new GreenfootImage("images/download-removebg-preview.png");
        arrow.scale(100, 100);
        // If true, arrow faces right
        // If false, arrow faces left
        if(orientation == false){
            arrow.mirrorHorizontally();
        }
        setImage(arrow);
    }
    
    /**
     * Set the orientation of the arrow
     */
    public static void setOrientation(boolean a)
    {
        orientation = a;
    }
    
}
