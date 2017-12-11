/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: SquareBullet.java
 * Description: SquareBullet is a subclass of Bullet.
 * COMPLETED
 */

import java.awt.*;

public class SquareBullet extends Bullet{

    public SquareBullet(int x, int y, int r, int i, int xSpeed, int ySpeed, Color c) {
        super(x, y, r, i, xSpeed, ySpeed, c);
    }

    public void draw(Graphics g) {
        int y = getY();
        int x = getX();
        if(getId() == 5)
            g.fillRect(x+10, y, 40, 40);
    }
}  //end class
