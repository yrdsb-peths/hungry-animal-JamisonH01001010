import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    Button b = new Button();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); // false so objects are not bounded to world limit
        
        // Create an elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        // Create an Apple
        createApple();
        
    }
    
    public void act(){
        if(Apple.getGameOver()){
            addObject(b, 300, 300);
            // Label can't be too big or else unable to "click" button
            Label returnToHome = new Label("Return to Home", 25); 
            addObject(returnToHome, 300, 300);
        }
        
        if(Greenfoot.mouseClicked(b)){
            TitleScreen titleWorld = new TitleScreen();
            Greenfoot.setWorld(titleWorld);
        }
    }
    
    // Create a game over label
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    // Increase score and set label to current score value
    public void increaseScore(){
        if(score % 5 == 0){
            level += 1;
        }
        score++;
        scoreLabel.setValue(score);
    }
    
    // Create an apple
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        // Randomize the x component
        int x = Greenfoot.getRandomNumber(600);
        // Always have the apple spawn at the highest point
        int y = 0;
        // Add apple to the world
        addObject(apple, x, y); 
    }
    
    public void setAchievements(){
        Achievements a = new Achievements();
        if(score >= 15){
            a.setNov();
        } 
        if(score >= 20){
            a.setExp();
        }
        if(score >= 25){
            a.setMas();
        }
    }
}
