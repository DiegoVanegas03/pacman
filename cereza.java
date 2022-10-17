import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cereza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cereza extends item
{
    cereza(){
        super(10);
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/9;
        int myNewWidth = (int)myImage.getWidth()/9;
        myImage.scale(myNewWidth, myNewHeight); 
    }
    /**
     * Act - do whatever the cereza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
