/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: SquareShooter.java
 * Description: SquareShooter is a subclass of Shooter.
 * COMPLETED
 */

import java.awt.*;
import java.util.ArrayList;

public class SquareShooter extends Shooter {

    boolean activated;

    public SquareShooter(int x, int y, int h, int w, Color c, int id) {
        super(x, y, h, w, c);
        activated = false;
        loadBullets(10, -10, 3, 50, id);
    }

    public void draw(Graphics g){

        g.setColor(getColor());
        g.fillRect(getX(),getY(),getWidth(),getHeight());

        // System.out.println(getX());
        if(getShotBullets() != null) {
            for(int i = 0; i <getShotBullets().size(); i++) {
                getShotBullets().get(i).draw(g);
            }
        }
    }
}  //end class