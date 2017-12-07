package ShapeShooterArcade;
/* 
 * File Name: TriangleBullet.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: creates triangle bullet 
 * Date Created: 11/17/17
 * COMPLETE
*/

public class TriangleBullet extends Bullet{
    
    //private Color color = Color.CYAN;
    
    public TriangleBullet(int x, int y, int r, int i, int xSpeed, int ySpeed, Color c){
        super(x, y, r, i, xSpeed, ySpeed, c);
        //color = c;
    }
    
    public void draw(Graphics g){
        int x = getX();
        int y = getY();
        
        //UP Triangle
        if(getId() == 1){
            g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {x+60, y+20, y+60}, 3);
        }
        //DOWN Triangle
        else if(getId() == 2){
            g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {x+60, y+20, y+60}, 3);
        }
        //RIGHT Triangle
        else if(getId == 3){
            g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {x+60, y+20, y+60}, 3);
        }
        //LEFT Triangle
        else if(getId == 4){
            g.fillPolygon(new int[] {x+10, x+30, x+50}, new int[] {x+60, y+20, y+60}, 3);
        }
    }
    //return null;
} //end class
