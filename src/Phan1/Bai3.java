/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 10 + random.nextInt(89);
        int t = 1;
        while(x != n){
            System.out.println("Buoc " + t + " : " + x);
            x = 10 + random.nextInt(89);
            t++;
        }
        
    }
}
