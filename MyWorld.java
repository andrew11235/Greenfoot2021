import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int stepCounter;
    
    public MyWorld()
    {    
        super(600, 400, 1);
        
        FlowerEater a = new FlowerEater();
        this.addObject(a, 100, 200);
    }
    public void act()
    {
        stepCounter++;
        
        this.addFlower();
    }
    public void addFlower()
    {
        Flower f = new Flower();
        
        if (this.stepCounter % 100 == 0)
        {
            int randX = Greenfoot.getRandomNumber(this.getWidth());
            int randY = Greenfoot.getRandomNumber(this.getHeight());
            this.addObject(f, randX, randY);
        }
    }
    
}
