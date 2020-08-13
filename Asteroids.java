import processing.core.PApplet;
public class Asteroids extends Floater
{
    private int rotSpeed;
    public Asteroids(PApplet applet_)
    {
        super(applet_); 
        rotSpeed = (int)(Math.random()* 21) - 10;
        myCenterX = Math.random()* applet.width;
        myCenterY = Math.random()* applet.height;
        myColor = 255;
        myPointDirection = -180;
        myVelocityX = Math.random()* 4 - 2;
        myVelocityY = Math.random()* 4 - 2;
        corners = 6;
        xCorners = new int[corners];
        yCorners = new int[corners];
        xCorners[0] = -11;
        yCorners[0] = -8;
        xCorners[1] = 7;
        yCorners[1] = -10;
        xCorners[2] = 11;
        yCorners[2] = 0;
        xCorners[3] = 6;
        yCorners[3] =10;
        xCorners[4] = -11;
        yCorners[4] = 8;
        xCorners[5] = -15;
        yCorners[5] = 4;
    }
    
    public void move()
    {
        rotate(rotSpeed);
        super.move();  
    }
    
    public void setX(int x)
    {
        myCenterX = x;
    }

    public int getX()
    {
        return (int)myCenterX; 
    }

    public void setY(int y)
    {
        myCenterY = y;
    }

    public int getY()
    {
        return (int)myCenterY;
    }

    public void setVelocityX(double x)
    {
        myVelocityX = x;  
    }

    public double getVelocityX()
    {
        return myVelocityX;  
    }

    public void setVelocityY(double y)
    {
        myVelocityY = y; 
    }

    public double getVelocityY()
    {
        return myVelocityY;  
    }

    public void setPointDirection(int degrees)
    {
        myPointDirection = degrees;
    }

    public double getPointDirection()
    {
        return myPointDirection; 
    }

}


