/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: Outline.java
 * Description: The Outline is an abstract class for the game's outline.
 * COMPLETED
 */

import java.awt.*;

public abstract class Outline {

    private int locationX, locationY, id;
    private boolean fill;

    public Outline(int x, int y, int i) {
        locationX = x;
        locationY = y;
        id = i;
        fill=false;
    }
    public boolean getFill()
    {
        return fill;
    }
    public void setFill(boolean t)
    {
        fill=t;
    }

    public int getX() {
        return locationX;
    }

    public int getY() {
        return locationY;
    }

    public int getId() {
        return id;
    }

    public abstract void draw(Graphics g);
} //end class