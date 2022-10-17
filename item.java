import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class item extends Actor
{
    private int score;   
    item(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}
