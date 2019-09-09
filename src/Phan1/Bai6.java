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
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a * b;
        while(b != 0){
            int n = a % b;
            a = b;
            b = n;
        }
        System.out.println("UCLN = " + a);
        System.out.println("BCNN = " + x / a);
    }
}
