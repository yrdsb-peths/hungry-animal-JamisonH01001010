import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    
    // Constructor
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Adds title label to the title screen
        addObject(titleLabel, 300, 75);
        prepare();
    }
    
    // Once "space" is pressed, start the game
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
        Label startLabel = new Label("Press <space> to start", 40);
        addObject(startLabel,300,300);
        Label arrowLabel = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(arrowLabel,300,350);
    }
}
