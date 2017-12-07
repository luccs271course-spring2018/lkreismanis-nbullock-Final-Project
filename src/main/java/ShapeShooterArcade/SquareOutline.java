/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: SquareOutline.java
 * Description: The Square Outline is a subclass of Outline.
 * Author: Larisa Kreismanis & Nathan Bullock
 * Date-written: 11/30/17
 * COMPLETED
 */

import java.awt.*;

public class SquareOutline extends Outline {
    
    public SquareOutline(int x, int y, int i){
        super(x, y, i);
    }
    
    public void draw(Graphics g){
        int x = getX();
        int y = getY();
        int id = getId();
        
        boolean fill = getFill();
        
        //Square id=5
        if(!fill){
            if(id == 5){
                g.drawRect(x, y, 40, 40);
            } 
        }
        else{
            if(id == 5){
                g.fillRect(x, y, 40, 40);
                    
            }
        }
    }
}  //end class