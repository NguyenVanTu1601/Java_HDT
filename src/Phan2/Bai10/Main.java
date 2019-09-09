/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MyPoint> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            MyPoint mp = new MyPoint(x,y); // khởi tạo các điểm mới <=> bài 2
            arr.add(mp);
        }
        
        double maxKc = 0;
        MyPoint mp1 = new MyPoint();
        MyPoint mp2 = new MyPoint();
        
        for(int i = 0; i < arr.size() - 1; i++){
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(i).distance(arr.get(j)) > maxKc){
                    maxKc = arr.get(i).distance(arr.get(j));
                    mp1 = arr.get(i);
                    mp2 = arr.get(j);
                }
            }        
        }
        System.out.println("Max kc = " + maxKc + "\n");
        System.out.println("Cac vi tri : " + mp1.getX() + " " + mp1.getY() + "\n");
        System.out.println(mp2.getX() + " " + mp2.getY());
    }
}
