/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai3;

/**
 *
 * @author Admin
 */
public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        width = 1;
        height = 1;
        color = null;
    }
    
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return this.height * this.width;
    }
    public double findPerimeter(){
        return 2 * (this.height + this.width);
    }
}
