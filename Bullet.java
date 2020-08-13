import processing.core.PApplet;
public class Bullet extends Floater
{
    private double dRadians;
    public Bullet(PApplet applet_, Spaceship theShip)
    {
        super(applet_); 
        myCenterX = theShip.getX();
        myCenterY = theShip.getY();
        myPointDirection = theShip.getPointDirection();
        dRadians = myPointDirection * (Math.PI / 180);
        myVelocityX = 10*Math.cos(dRadians) + theShip.getVelocityX();
        myVelocityY = 10*Math.sin(dRadians) + theShip.getVelocityY();
    }

    @Override
    public void show()
    {
        applet.fill(255, 255, 255);
        applet.stroke(255, 255, 255);
        applet.ellipse((int)myCenterX, (int)myCenterY, 10, 10);
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


