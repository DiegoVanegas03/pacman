import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cuadrado extends Actor
{
    public cuadrado(int i){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
        switch(i){
            case 1:
                myImage.mirrorHorizontally();  
                break;
            case 2:
                myImage.rotate​(90);
                break;
                
        }
    }
    /**
     * Act - do whatever the cuadrado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
