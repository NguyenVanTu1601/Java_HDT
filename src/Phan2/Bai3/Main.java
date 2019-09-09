/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectange hcn = new Rectange();
        System.out.println("Nhap chieu dai");
        double width = scanner.nextDouble();
        hcn.setWidth(width);
        System.out.println("Nhap chieu cao");
        double heigth = scanner.nextDouble();
        hcn.setHeight(heigth);
        System.out.println("Nhap mau sac");
        String s = scanner.nextLine();
        String color = scanner.nextLine();
        hcn.setColor(color);
        System.out.println("Thong tin ve HCN");
        System.out.println("Dai : " + hcn.getWidth() + "\n" + 
                            "Rong : " + hcn.getHeight() + "\n" +
                            "Mau : " + hcn.getColor() + "\n" + 
                            "Chu vi : " + hcn.findPerimeter() + "\n" + 
                            "Dien tich : " + hcn.findArea());
    }
}
