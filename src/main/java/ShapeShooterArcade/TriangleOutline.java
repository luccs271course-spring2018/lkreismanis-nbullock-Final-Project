/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: TriangleOutline.java
 * Description: TriangleOutline is a subclass of Outline.
 * COMPLETED
 */

import java.awt.*;

public class TriangleOutline extends Outline {


    public TriangleOutline(int x, int y, int i) {
        super(x, y, i);
    }

    public void draw(Graphics g) {
        int x = getX();
        int y = getY();
        int id = getId();

        boolean fill = getFill();

        if(!fill) {
            if(id == 1)
                g.drawPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+60, y+20, y+60}, 3);  //UP Triangle
            else if(id == 2)
                g.drawPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+20, y+60, y+20}, 3);  //DOWN Triangle
            else if(id == 3)
                g.drawPolygon(new int[] {x+10, x+10, x+50}, new int[] {y+60, y+20, y+40}, 3);  //RIGHT Triangle
            else if(id == 4)
                g.drawPolygon(new int[] {x+10, x+50, x+50}, new int[] {y+40, y+20, y+60}, 3);  //LEFT Triangle
        }
        else {
            if(id == 1)
                g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+60, y+20, y+60}, 3);  //UP Triangle
            else if(id == 2)
                g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+20, y+60, y+20}, 3);  //DOWN Triangle
            else if(id == 3)
                g.fillPolygon(new int[] {x+10, x+10, x+50}, new int[] {y+60, y+20, y+40}, 3);  //RIGHT Triangle
            else if(id == 4)
                g.fillPolygon(new int[] {x+10, x+50, x+50}, new int[] {y+40, y+20, y+60}, 3);  //LEFT Triangle

        }
    }
} //end class