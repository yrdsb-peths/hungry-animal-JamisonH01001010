import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    // true = arrow face right
    // false = arrow face left
    public static boolean orientation = true;
    public Arrow(){
        GreenfootImage arrow = new GreenfootImage("images/download-removebg-preview.png");
        arrow.scale(100, 100);
        if(orientation == false){
            arrow.mirrorHorizontally();
        }
        setImage(arrow);
    }
    
    //Sets Orientation
    public static void setOrientation(boolean a)
    {
        orientation = a;
    }
    
}
