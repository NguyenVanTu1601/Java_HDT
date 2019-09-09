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
public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        int sum = 0;
        while(x != 0){
            sum += x % 10;
            x /= 10;
        }
        System.out.println("sum = " + sum);
    }
}
