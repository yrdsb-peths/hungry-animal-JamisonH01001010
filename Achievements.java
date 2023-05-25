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
    Label titleScreen;
    private static boolean nov = false;
    private static boolean exp = false;
    private static boolean mas = false;
    Arrow a2 = new Arrow();
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
        Arrow.setOrientation(true);
        addObject(a2, 300, 325);
        
        // Add arrow text
        titleScreen = new Label("Title Screen", 25);
        addObject(titleScreen, 300, 305);
    }
    
    public void act(){
        completeAchievements();
        
        // Changing to TitleScreen world
        if(Greenfoot.mouseClicked(a2)){
            TitleScreen titleWorld = new TitleScreen();
            Greenfoot.setWorld(titleWorld);
        }
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
    public static void setNov(boolean a){
        nov = a;
    }
    
    public static void setExp(boolean a){
        exp = a;
    }
    
    public static void setMas(boolean a){
        mas = a;
    }
}
