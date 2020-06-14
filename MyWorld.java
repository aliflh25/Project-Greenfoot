import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    
    private void prepare()
    {
        red red = new red();
        addObject(red,299,554);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new blue(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new coin(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
    }
}
 

