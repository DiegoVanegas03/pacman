import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    private static final int OFFSET = 4;
    public Pacman(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/8;
        int myNewWidth = (int)myImage.getWidth()/8;
        myImage.scale(myNewWidth, myNewHeight);
        myImage.mirrorHorizontally(); 
    }
    private String [] images = new String[]{
        "images/pacAbierta.png",
        "images/pacCerrada.png"
    };
    private int currentImage = 0;
    private int delayMouth = 0;
    private int points;
    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getX() == 0){
            setLocation(844,240);
        }
        if(getX() == 853){
            setLocation(10,240);
        }
        moveMouth();
        moveAct();
        eatItems();
        showHud();
        death();
    }
    
    private void moveMouth(){
        delayMouth++;
        if(delayMouth == 50){
            currentImage = (currentImage + 1) %images.length;
            setImage(images[currentImage]);
            GreenfootImage myImage = getImage();
            int myNewHeight = (int)myImage.getHeight()/8;
            int myNewWidth = (int)myImage.getWidth()/8;
            myImage.scale(myNewWidth, myNewHeight);
            myImage.mirrorHorizontally();
            delayMouth = 0;
        }
    }
    
    private void moveAct(){
        if(Greenfoot.isKeyDown("d")){
            moveIfNoCollision(OFFSET,0);
        }
        if(Greenfoot.isKeyDown("a")){
            moveIfNoCollision(-OFFSET,0);
        }
        if(Greenfoot.isKeyDown("w")){
            moveIfNoCollision(0,-OFFSET);
        }
        if(Greenfoot.isKeyDown("s")){
            moveIfNoCollision(0,OFFSET);
        }
    }
    
    private void moveIfNoCollision(int dx, int dy){
        if(this.getOneObjectAtOffset(dx,dy,Muro.class) == null && this.getOneObjectAtOffset(dx,dy,cuadrado.class) == null){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    
    private void eatItems() {
        item item = (item) getOneIntersectingObject(item.class);

        if (item != null) {
            points += item.getScore();
            getWorld().removeObject(item);
        }
    }
    private void death() {
        Enemigos enemigo = (Enemigos) getOneIntersectingObject(Enemigos.class);

        if (enemigo != null) {
            getWorld().removeObject(this);
            //getWorld().showText("Estas Muerto", 426, 240);
        }
    }
    private void showHud() {
        getWorld().showText("Points: " + Integer.toString(points), 800, 30);
    }
}
