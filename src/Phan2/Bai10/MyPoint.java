/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai10;

/**
 *
 * @author Admin
 */
public class MyPoint {
    private double  x;
    private double y;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(MyPoint mp){
        double oX = this.x - mp.x;
        double oY = this.y - mp.y;
        double kc = Math.sqrt(oX*oX + oY*oY);
        return kc;
    }
    
    public double distance(MyPoint p1, MyPoint p2){
        double oX = p1.x - p2.x;
        double oY = p1.y - p2.y;
        double kc = Math.sqrt(oX*oX + oY*oY);
        return kc;
    }
}
