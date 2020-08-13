import processing.core.PApplet;
public class Star
{
    private PApplet applet;
    private float x,y;
    
    
    public Star(PApplet applet_)
    {
        applet = applet_;
        x = (float)Math.random()* applet.width;
        y = (float) Math.random()* applet.height;
    }
    
    public void show()
    {
       applet.fill(255);
       applet.ellipse(x , y, 5, 5);
    }
}