import processing.core.PApplet;
public class Spaceship extends Floater  
{
    public Spaceship(PApplet applet_)
    {
      super(applet_);
      myCenterX = applet.width/2;
      myCenterY = applet.height/2;
      myColor = 255;
      myPointDirection = -180;
      myVelocityX = 0;
      myVelocityY = 0;
      corners = 4;
      xCorners = new int[corners];
      yCorners = new int[corners];
      xCorners[0] = -6;
      yCorners[0] = -6;
      xCorners[1] = 12;
      yCorners[1] = 0;
      xCorners[2] = -6;
      yCorners[2] = 6;
      xCorners[3] = -3;
      yCorners[3] = 0;
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