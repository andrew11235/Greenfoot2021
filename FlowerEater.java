import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class FlowerEater extends Actor
{
    private int score;
    public FlowerEater()
    {
        this.score = 0;
    }
    public void act()
    {
        this.makeMeMove();
        
        if(this.isTouching(Flower.class))
        {
            this.removeTouching(Flower.class);
            score++;
            this.getWorld().showText("Score: " + score, 75, 15);
        }
    }
    public void makeMeMove()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            this.setRotation(270);
            this.move(4);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            this.setRotation(90);
            this.move(4);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            this.setRotation(0);
            this.move(4);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            this.setRotation(180);
            this.move(4);
        }
    }
}
