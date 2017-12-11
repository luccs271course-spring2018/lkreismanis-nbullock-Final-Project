/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: TriangleBullet.java
 * Description: TriangleBullet is a subclass of Bullet.
 * COMPLETED
 */

import java.awt.*;

public class TriangleBullet extends Bullet {

    public TriangleBullet(int x, int y, int r, int i, int xSpeed, int ySpeed, Color c) {
        super(x, y, r, i, xSpeed, ySpeed, c);
        //color = c;
    }

    public void draw(Graphics g) {
        int x = getX();
        int y = getY();

        if(getId() == 1)
            g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+60, y+20, y+60}, 3);  //UP Triangle
        else if(getId() == 2)
            g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+20, y+60, y+20}, 3);  //DOWN Triangle
        else if(getId() == 3)
            g.fillPolygon(new int[] {x+10, x+10, x+50}, new int[] {y+60, y+20, y+40}, 3);  //RIGHT Triangle
        else if(getId() == 4)
            g.fillPolygon(new int[] {x+10, x+50, x+50}, new int[] {y+40, y+20, y+60}, 3);  //LEFT Triangle           
    }
}  //end class