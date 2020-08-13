import processing.core.PApplet;
import processing.core.PImage;
import java.util.ArrayList;
import java.util.List;
public class AsteroidsGame extends PApplet
{
    Spaceship uss1;
    Star[] stars;
    ArrayList<Asteroids> asteroids;
    ArrayList<Bullet> bullets;
    PImage img;
    public static void main(String[] args)
    {
        PApplet.main(new String[] {"AsteroidsGame"});
    }

    public void settings()
    {
        size(1024,1036); 
    }

    public void setup() 
    {
        uss1 = new Spaceship(this);
        stars = new Star[100];
        for(int i = 0; i < stars.length; i++)
        {
            stars[i]= new Star(this);  
        }
        asteroids = new ArrayList<Asteroids>();
        for(int i = 0; i < 50; i++)
        {
            Asteroids r = new Asteroids(this); 
            asteroids.add(r);
        }
        bullets = new ArrayList<Bullet>();
        //img = loadImage("minecraft.png");
    }

    public void draw() 
    {
        //image(img,0,0);
        background(0);
        uss1.show();
        uss1.move();
        for(int i = 0; i < stars.length; i++)
        {
            stars[i].show();  
        }

        for(int i = 0; i < asteroids.size(); i++)
        {
            asteroids.get(i).show();
            asteroids.get(i).move();
            if (dist((float)uss1.getX(),(float)uss1.getY(),(float)asteroids.get(i).getX(),(float)asteroids.get(i).getY()) < 20)
            {
                asteroids.remove(i);
            }

            for (int j = 0; j < bullets.size(); j++)
            {

                if (dist((float)asteroids.get(i).getX(),(float)asteroids.get(i).getY(),(float)bullets.get(j).getX(),(float)bullets.get(j).getY())< 20)
                {
                    asteroids.remove(i);
                    bullets.remove(j);
                    j--;
                    break;
                }
            }

        }
        for (int i = 0; i < bullets.size(); i++)
        {
            bullets.get(i).show();
            bullets.get(i).move();
        }
        if(keyPressed)
        {
            if (key == 'a')
            {
                uss1.rotate(-8);
            }
            else if (key == 'd')
            {
                uss1.rotate(8);
            }
            else if (key == 'w')
            {
                uss1.accelerate(.10);
            }

        }

    }

    public void keyPressed()
    {
        if (key == 'h')
        {
            uss1.setVelocityX(0);
            uss1.setVelocityY(0);
            uss1.setX((int)(Math.random() * 1000));
            uss1.setY((int)(Math.random() * 800));
        }
        if (key == ' ')
        {
            bullets.add(new Bullet(this, uss1));
        }
    }
}
