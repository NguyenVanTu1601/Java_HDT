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
public class Bai11 {
    public static void main(String[] args) {
        int[] a = new int[100];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i <= 90; i++){
            a[i] = a[i-1]+ a[i-2]; 
        }
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
