import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lebah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lebah extends Actor
{
    /**
     * Act - do whatever the lebah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    keycontrol();
     

public void keycontrol()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+5);
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-5);
        }
        
    }
}

