/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Scanner;


/**
 *
 * @author Van Tu
 */
public class Bai13 {
    public static void main(String[] args) {
        double x = 0;
        int i = 0;
        double c = new Scanner(System.in).nextDouble();
        while(1.0/ (2*i + 1) > c){
            if(i % 2 == 0){
                x += 1.0/ (2 * i + 1);
            }
            else x -= 1.0 / (2 * i + 1);
            i++;
        }
        System.out.println(4*x);
    }
}
