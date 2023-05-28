import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    // Create Labels
    Label titleLabel = new Label("The Elephant", 60);
    Label startLabel;
    Label arrowLabel;
    Label achievements;
    
    // Create Arrow
    Arrow a1 = new Arrow();
    
    // Tracking game start
    public static boolean gameStart = false;
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Adds title label to the title screen
        addObject(titleLabel, 300, 75);
        prepare();
        
        // Add arrow
        Arrow.setOrientation(false);
        addObject(a1, 530, 200);
        
        // For if the game is playing again, to keep track of its restart
        Apple.setGameOver(false);
    }
    
    public void act(){
        // // Once "space" is pressed, start the game
        if(Greenfoot.isKeyDown("space")){
            // Change to game world by creating a world object
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            gameStart = true;
        }
        // Changing to achievement world
        if(Greenfoot.mouseClicked(a1)){
            Achievements achWorld = new Achievements();
            Greenfoot.setWorld(achWorld);
        }
    }
    
    /**
     * Return if game has started
     */ 
    public static boolean getGameStart(){
        return gameStart;
    }
    
    /**
     * Set if game has started
     */
    public static void setGameStart(boolean a){
        gameStart = a;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        startLabel = new Label("Press <space> to start", 40);
        addObject(startLabel, 300, 300);
        arrowLabel = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(arrowLabel, 300, 350);
        achievements = new Label("Achievements", 25);
        addObject(achievements, 530, 225);
    }
}
