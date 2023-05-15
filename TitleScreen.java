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
        addObject(titleLabel, getWidth()/2, 200);
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
        addObject(elephant,442,97);
        elephant.setLocation(432,70);
        elephant.setLocation(456,77);
        Label label = new Label("Press <space> to start", 40);
        addObject(label,324,285);
        Label label2 = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(label2,306,229);
        label.setLocation(339,309);
        label2.setLocation(353,207);
        label.setLocation(349,305);
        elephant.setLocation(529,116);
        elephant.setLocation(513,82);
        label2.setLocation(315,224);
        label.setLocation(333,322);
        label.setLocation(456,313);
        label.setLocation(365,314);
        label2.setLocation(450,241);
        label.setLocation(324,118);
    }
}
