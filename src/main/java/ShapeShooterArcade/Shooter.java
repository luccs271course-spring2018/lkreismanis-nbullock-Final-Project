package ShapeShooterArcade;
/* 
 * File Name: Shooter.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: Shooter file.
 * Date Created: 11/17/17
 * COMPLETED
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
    
    //loadBullets determines what kind of bullets to load with the shooter
    public void loadBullets(int xSpeed, int ySpeed, int size, int cnt, int id){
        storedBullets = new ArrayList<Bullet>(cnt);
        shotBullets = new ArrayList<Bullet>();
        /*ID KEY
        1 = UP pointing Triangle
        2 = DOWN pointing Triangle
        3 = LEFT pointing Triangle
        4 = RIGHT pointing Triangle
        5 = Square
        */
        
        //UP Triangle
        if(id == 1){
            for(int i = 0; i < cnt; i++){
                storedBullets.add(new TriangleBullet(getX(), getY(), size, 1, xSpeed, ySpeed, Color.RED));
            }
        }
        //DOWN Triangle
        else if(id == 2){
            for(int i = 0; i < cnt; i++){
                storedBullets.add(new TriangleBullet(getX(), getY(), size, 2, xSpeed, ySpeed, Color.BLUE));
            }
        }
        //LEFT Triangle
        else if(id == 3){
            for(int i = 0; i < cnt; i++){
                storedBullets.add(new TriangleBullet(getX(), getY(), size, 3, xSpeed, ySpeed, Color.GREEN));
            }
        }
        //RIGHT Triangle
        else if(id == 4){
            for(int i = 0; i < cnt; i++){
                storedBullets.add(new TriangleBullet(getX(), getY(), size, 4, xSpeed, ySpeed, Color.ORANGE));
            }
        }
        //Square
        else if(id == 5){
            for(int i = 0; i < cnt; i++){
                storedBullets.add(new SquareBullet(getX(), getY(), size, 5, xSpeed, ySpeed, Color.MAGENTA));
            }
        }
    }
    
    public void setStoredBullets(ArrayList<Bullet> stored){
        storedBullets = stored;
    }
    public void setShotBullets(ArrayList<Bullet> shot){
        shotBullets = shot;
    }
    public ArrayList<Bullet> getStoredBullets(){
        return storedBullets;
    }
    public Color getColor(){
        return color;
    }
    public int getX(){
        return cornerX;
    }
    public int getY(){
        return cornerY;
    }
    public void setX(int x){
        cornerX = x;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int w){
        width = w;
    }
    
    //moves X value
    public void move(int x, int w){
        setX(x - w);
    }
    
    public void shoot(){
        System.out.println("shoot test");
        if(getStoredBullets().size() > 0){
            getStoredBullets().get(getStoredBullets().size()-1).setX(getX()+getWidth()/2);
            getStoredBullets().get(getStoredBullets().size()-1).setY(getY());
            getStoredBullets().get(getStoredBullets().size()-1).release();
            
            Bullet b = getStoredBullets().remove(getStoredBullets().size-1);
            getShotBullets().add(b);
        }
    }
    
    public ArrayList<Bullet> getShotBullets(){
        if(shotBullets != null){
            for(int i = 0; i < shotBullets.size(); i++){
                if(shotBullets.get(i).getY() >= 1000){
                    shotBullets.remove(i);
                }
            }
        }
        return shotBullets;
    }
    
    public abstract void draw(Graphics g);
} 
//end class