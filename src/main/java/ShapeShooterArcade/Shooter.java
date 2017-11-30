package ShapeShooterArcade;
/* 
 * File Name: Shooter.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: Shooter file.
 * Date Created: 11/17/17
*/
import java.util.ArrayList;
import java.awt.*;


public abstract class Shooter {
    
    private int cornerX, cornerY;
    private int height, width;
    private Color color;
    private ArrayList<Bullet> storedBullets;
    private ArrayList<Bullet> shotBullets; 
    
    public Shooter(int x, int y, int h, int w, Color c){
        cornerX = x;
        cornerY = y;
        height = h;
        width = w;
        color = c;
        ArrayList<Bullet> storedBullets;
        ArrayList<Bullet> shotBullets;
    }
} 
//end class