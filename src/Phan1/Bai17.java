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
public class Bai17 {
    public static int Ckn(int n, int k){
        if(k == 0 || k == n) return 1;
        else return Ckn(n-1, k) + Ckn(n-1, k-1);
    }
    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("%d ", Ckn(i, j));
            }
            System.out.println("");
        }
        
    }
}
