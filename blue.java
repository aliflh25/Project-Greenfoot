import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class blue extends parent
{
    int speed = 3;
   
    public void act() 
    {
        blue a = new blue();
        Actor i = getOneIntersectingObject(blue.class);
        move(speed);
        checkdouble(i);
        end();
    }  
}
   

