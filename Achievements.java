import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Achievements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Achievements extends World
{
    Label appleNovice;
    Label appleExpert;
    Label appleMaster;
    private boolean nov = false;
    private boolean exp = false;
    private boolean mas = false;
    public Achievements()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Add achievement descriptions
        appleNovice = new Label("Novice: Eat 15 apples in one run", 30);
        addObject(appleNovice, 271, 100);
        appleExpert = new Label("Expert: Eat 20 apples in one run", 30);
        addObject(appleExpert, 268, 150);
        appleMaster = new Label("Master: Eat 25 apples in one run", 30);
        addObject(appleMaster, 270, 200);
        
        // Add back arrow
        Arrow a = new Arrow();
        a.mirrorHorizontally();
        addObject(a, 300, 350);
    }
    
    public void act(){
        completeAchievements();
    }
    
    public void completeAchievements(){
        if(nov){
            Checkmark c1 = new Checkmark();
            addObject(c1, 500, 100);
        }
        if(exp){
            Checkmark c2 = new Checkmark();
            addObject(c2, 500, 150);
        }
        if(mas){
            Checkmark c3 = new Checkmark();
            addObject(c3, 500, 200);
        }
    }
    public void setNov(){
        nov = true;
    }
    
    public void setExp(){
        exp = true;
    }
    
    public void setMas(){
        mas = true;
    }
}
