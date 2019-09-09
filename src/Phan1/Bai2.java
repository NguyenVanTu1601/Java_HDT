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
public class Bai2 {
    public static void In(int n){
        for(int i = 1; i <= n; i++){
            if(i == 1){
                for(int j = 0; j < n- i; j++){
                    System.out.printf("  ");
                }
                System.out.printf("1\n");
            }
            else{
                for(int j = 0; j < n - i; j++){
                    System.out.printf("  ");
                }
                for(int j = 1; j <= i; j++){
                    System.out.printf(j + " ");
                }
                for(int j = i - 1; j >= 1; j--){
                    System.out.printf(j + " ");
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        In(n);
    }
}
