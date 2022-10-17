import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pacman pac1 = new Pacman();
        addObject(pac1,15,240);
        Muro muro1 = new Muro(1);
        addObject(muro1,10,200);
        Muro muro18 = new Muro(1);
        addObject(muro18,846,200);
        Muro muro2 = new Muro(1);
        addObject(muro2,10,280);
        Muro muro19 = new Muro(1);
        addObject(muro19,846,280);
        Muro muro3 = new Muro(2);
        addObject(muro3,55,194);
        Muro muro51 = new Muro(2);
        addObject(muro51,55,284);
        Muro muro80 = new Muro(2);
        addObject(muro80,801,284);
        Muro muro20 = new Muro(2);
        addObject(muro20,801,194);
        Muro muro4 = new Muro(2);
        addObject(muro4,55,165);
        Muro muro52 = new Muro(2);
        addObject(muro52,55,313);
        Muro muro21 = new Muro(2);
        addObject(muro21,801,165);
        Muro muro81 = new Muro(2);
        addObject(muro81,801,313);
        Muro muro5 = new Muro(1);
        addObject(muro5,10,160);
        Muro muro53 = new Muro(1);
        addObject(muro53,10,320);
        Muro muro82 = new Muro(1);
        addObject(muro82,846,320);
        Muro muro22 = new Muro(1);
        addObject(muro22,846,160);
        Muro muro6 = new Muro(2);
        addObject(muro6,6,152);
        Muro muro54 = new Muro(2);
        addObject(muro54,6,325);
        Muro muro83 = new Muro(2);
        addObject(muro83,844,325);
        Muro muro84 = new Muro(2);
        addObject(muro84,844,354);
        Muro muro85 = new Muro(2);
        addObject(muro85,844,383);
        Muro muro86 = new Muro(2);
        addObject(muro86,844,412);
        Muro muro87 = new Muro(2);
        addObject(muro87,844,441);
        Muro muro88 = new Muro(2);
        addObject(muro88,844,470);
        Muro muro55 = new Muro(2);
        addObject(muro55,6,354);
        Muro muro56 = new Muro(2);
        addObject(muro56,6,383);
        Muro muro57 = new Muro(2);
        addObject(muro57,6,412);
        Muro muro58 = new Muro(2);
        addObject(muro58,6,441);
        Muro muro59 = new Muro(2);
        addObject(muro59,6,470);
        Muro muro23 = new Muro(2);
        addObject(muro23,844,152);
        Muro muro7 = new Muro(2);
        addObject(muro7,6,126);
        Muro muro24 = new Muro(2);
        addObject(muro24,844,126);
        Muro muro8 = new Muro(2);
        addObject(muro8,6,97);
        Muro muro25 = new Muro(2);
        addObject(muro25,844,97);
        Muro muro9 = new Muro(2);
        addObject(muro9,6,68);
        Muro muro26 = new Muro(2);
        addObject(muro26,844,68);
        Muro muro10 = new Muro(2);
        addObject(muro10,6,39);
        Muro muro27 = new Muro(2);
        addObject(muro27,844,39);
        Muro muro11 = new Muro(2);
        addObject(muro11,6,10);
        Muro muro28 = new Muro(2);
        addObject(muro28,844,10);
        Muro muro12 = new Muro(1);
        addObject(muro12,10,10);
        Muro muro60 = new Muro(1);
        addObject(muro60,10,471);
        Muro muro13 = new Muro(1);
        addObject(muro13,115,10);
        Muro muro61 = new Muro(1);
        addObject(muro61,115,471);
        Muro muro14 = new Muro(1);
        addObject(muro14,220,10);
        Muro muro62 = new Muro(1);
        addObject(muro62,220,471);
        Muro muro15 = new Muro(1);
        addObject(muro15,325,10);
        Muro muro63 = new Muro(1);
        addObject(muro63,325,471);
        Muro muro16 = new Muro(1);
        addObject(muro16,430,10);
        Muro muro64 = new Muro(1);
        addObject(muro64,430,471);
        Muro muro17 = new Muro(1);
        addObject(muro17,535,10);
        Muro muro65 = new Muro(1);
        addObject(muro65,535,471);
        cuadrado cua1 = new cuadrado(1);
        addObject(cua1,130,90);
        cuadrado cua7 = new cuadrado(1);
        addObject(cua7,130,390);
        cuadrado cua3 = new cuadrado(1);
        addObject(cua3,723,90);
        cuadrado cua9 = new cuadrado(1);
        addObject(cua9,723,390);
        cuadrado cua2 = new cuadrado(1);
        addObject(cua2,280,90);
        cuadrado cua8 = new cuadrado(1);
        addObject(cua8,280,390);
        cuadrado cua4 = new cuadrado(1);
        addObject(cua4,573,90);
        cuadrado cua10 = new cuadrado(1);
        addObject(cua10,573,390);
        cuadrado cua5 = new cuadrado(1);
        addObject(cua5,170,240);
        cuadrado cua6 = new cuadrado(1);
        addObject(cua6,690,240);
        Muro muro29 = new Muro(1);
        addObject(muro29,640,10);
        Muro muro66 = new Muro(1);
        addObject(muro66,640,471);
        Muro muro30 = new Muro(1);
        addObject(muro30,745,10);
        Muro muro67 = new Muro(1);
        addObject(muro67,745,471);
        Muro muro31 = new Muro(1);
        addObject(muro31,850,10);
        Muro muro68 = new Muro(1);
        addObject(muro68,850,471);
        Muro muro32 = new Muro(2);
        addObject(muro32,426,10);
        Muro muro69 = new Muro(2);
        addObject(muro69,426,471);
        Muro muro33 = new Muro(2);
        addObject(muro33,426,39);
        Muro muro70 = new Muro(2);
        addObject(muro70,426,442);
        Muro muro71 = new Muro(2);
        addObject(muro71,426,413);
        Muro muro72 = new Muro(2);
        addObject(muro72,426,384);
        Muro muro34 = new Muro(2);
        addObject(muro34,426,68);
        Muro muro35 = new Muro(2);
        addObject(muro35,426,97);
        Muro muro36 = new Muro(2);
        addObject(muro36,280,240);
        Muro muro37 = new Muro(2);
        addObject(muro37,280,269);
        Muro muro40 = new Muro(2);
        addObject(muro40,280,298);
        Muro muro38 = new Muro(2);
        addObject(muro38,280,211);
        Muro muro39 = new Muro(2);
        addObject(muro39,280,182);
        Muro muro41 = new Muro(1);
        addObject(muro41,324,172);
        Muro muro42 = new Muro(1);
        addObject(muro42,324,310);
        Muro muro43 = new Muro(2);
        addObject(muro43,576,298);
        Muro muro44 = new Muro(2);
        addObject(muro44,576,240);
        Muro muro45 = new Muro(2);
        addObject(muro45,576,269);
        Muro muro46 = new Muro(2);
        addObject(muro46,576,211);
        Muro muro47 = new Muro(2);
        addObject(muro47,576,182);
        Muro muro48 = new Muro(1);
        addObject(muro48,534,172);
        Muro muro49 = new Muro(1);
        addObject(muro49,534,310);
        Muro muro50 = new Muro(1);
        addObject(muro50,429,310);
        
        cereza cer1 = new cereza();
        addObject(cer1,60,420);
        fresa fer1 = new fresa();
        addObject(fer1,60,90);
        
        cereza cer2 = new cereza();
        addObject(cer2,853,240);
        
        manzana man1 = new  manzana();
        addObject(man1,800,420);
        
        fanAzul azul = new fanAzul();
        addObject(azul,350,240);
        
        fanNaranja naranja = new fanNaranja();
        addObject(naranja,426,240);
        
        fanRojo rojo = new fanRojo();
        addObject(rojo,500,240);
        
        
    }
}
