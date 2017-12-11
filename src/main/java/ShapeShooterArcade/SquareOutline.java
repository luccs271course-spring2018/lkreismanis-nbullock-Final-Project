/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: SquareOutline.java
 * Description: SquareOutline is a subclass of Outline.
 * COMPLETED
 */

import java.awt.*;

public class SquareOutline extends Outline {

    public SquareOutline(int x, int y, int i) {
        super(x, y, i);
    }

    public void draw(Graphics g) {
        int x = getX();
        int y = getY();
        int id = getId();

        boolean fill = getFill();

        if(!fill) {
            if(id == 5)
                g.drawRect(x, y, 40, 40);
        }
        else {
            if(id == 5)
                g.fillRect(x, y, 40, 40);
        }
    }
} //end class