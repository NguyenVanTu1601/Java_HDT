/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap toa do cac diem : ");
        ArrayList<MyPoint> mp = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            MyPoint p = new MyPoint(x,y);
            mp.add(p);
        }
        
        double kc1,kc2,kc3;
        kc1 = Math.sqrt(Math.pow(mp.get(0).getX() - mp.get(1).getX(), 2) + 
                        Math.pow(mp.get(0).getY() - mp.get(1).getY(), 2));
        kc2 = Math.sqrt(Math.pow(mp.get(0).getX() - mp.get(2).getX(), 2) + 
                        Math.pow(mp.get(0).getY() - mp.get(2).getY(), 2));
        kc3 = Math.sqrt(Math.pow(mp.get(1).getX() - mp.get(2).getX(), 2) + 
                        Math.pow(mp.get(1).getY() - mp.get(2).getY(), 2));
        System.out.println("Cac khoang cach : " + kc1 + " " + kc2 + " " + kc3);
        if(Math.abs(kc3 - kc1) >= kc2 || kc2 >= kc1 + kc3){
            System.out.println("Khong ton tai tam giac");
        }
        else{
            if(kc1 == kc2 && kc2 == kc3) System.out.println("Tam giac deu");
            else if(kc1 == kc2 || kc2 == kc3 || kc3 == kc1) System.out.println("Tam giac can");
            else if(kc1*kc1 + kc2*kc2 == Math.pow(kc3, 2) ||
                    kc1*kc1 + kc3*kc3 == kc2*kc2 ||
                    kc2*kc2 + kc3*kc3 == kc1*kc1) System.out.println("Tam giac vuong");
            else System.out.println("Tam giac thuong");
        }
    }
    // Gía trị tính trong trường hợp tam giác vuông hơi sai sai
    
}
