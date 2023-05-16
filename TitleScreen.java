import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    Label startLabel;
    Label arrowLabel;
    Label achievementArrow;
    Label achievements;
    Arroww arrow = new Arroww();
    public static boolean gameStart = false;
    // Constructor
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Adds title label to the title screen
        addObject(titleLabel, 300, 75);
        prepare();
        
        // Create an arrow
        addObject(arrow, 530, 200);
    }
    
    // Once "space" is pressed, start the game
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            gameStart = true;
        }
    }
    
    public static boolean getGameStart(){
        return gameStart;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
        startLabel = new Label("Press <space> to start", 40);
        addObject(startLabel,300,300);
        arrowLabel = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(arrowLabel,300,350);
        achievementArrow = new Label("\u2192", 80);
        addObject(achievementArrow, 545, 200);
        achievements = new Label("Achievements", 25);
        addObject(achievements, 535, 225);
    }
}
