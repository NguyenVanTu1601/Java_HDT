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
public class Bai9 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int dem = 0;
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                dem++;
                n /= i;
            }
            if(dem > 0) System.out.printf("%d(%d) ",i,dem);
            dem = 0;
        }
        if(n > 1) System.out.printf("%d(1)", n);
        
    }
}
