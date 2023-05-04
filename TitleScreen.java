import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

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
        label.setLocation(321,315);
        Label label2 = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(label2,306,229);
        label2.setLocation(300,220);
        label2.setLocation(373,225);
        label.setLocation(382,312);
        label2.setLocation(404,218);
        label2.setLocation(410,217);
        label2.setLocation(263,220);
        label.setLocation(286,319);
        label.setLocation(425,316);
    }
}
