/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author Van Tu
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = 0;
        for(int i = 1; i <= n; i++){
            x = x + (double)1.0 / i;
        }
        System.out.println("x = " + x);
    }
    
}
