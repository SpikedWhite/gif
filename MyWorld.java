import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootImage[] images = new GreenfootImage[22];
    
    private int slowness = 5;
    private int gifSpeedCounter = 0;
    private int actCycle = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        for( int i = 0; i < images.length; i++ )
        {
            images[i] = new GreenfootImage("frame_" + i + "_delay-0.1s.gif");
        }
        
        setBackground( images[0] );
    }
    
    /**
    * 
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act()
    {
        setBackground( images[actCycle % images.length] );
        
        if( gifSpeedCounter == slowness)
        {
            actCycle +=1;
            gifSpeedCounter = 0;
        }
        else
        {
            gifSpeedCounter +=1;
        }
    }
    
    /**
     * 
     */
    public void setSlowness(int slow)
    {
        slowness = slow;
    }
}
