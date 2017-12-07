package ShapeShooterArcade;
/* 
 * File Name: Outline.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: Outline file.
 * Date Created: 11/17/17
 * COMPLETED
*/

import java.awt.*;

public class Outline {
    private int locationX, locationY, id;
    private boolean fill;
    
    public Outline(int x, int y, int i){
        locationX = x;
        locationY = y;
        id = i;
        fill = false;
    }
    public boolean getFill(){
        return fill;
    }
    public boolean setFill(boolean t){
        fill = t;
    }
    public int getX(){
        return locationX;
    }
    public int getY(){
        return locationY;
    }
    public int getId(){
        return id;
    }
    
    public abstract void draw(Graphics g);
    
    //return null;
} //end class