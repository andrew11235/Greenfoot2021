import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flower extends Actor
{
    public Flower()
    {
        GreenfootImage gfi = new GreenfootImage("NewFlower.jpg");
        gfi.scale(50,50);
        this.setImage(gfi);
    }
    public void act()
    {
        this.turn(5);

        if (this.getRotation() == 0)
        {
            this.getWorld().removeObject(this); 
        }
    }
}