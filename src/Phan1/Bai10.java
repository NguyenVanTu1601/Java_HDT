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
public class Bai10 {
    public static boolean SNT(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n > 2){
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int dem = 0;
        int i = 2;
        while(dem < n){
            if(SNT(i)) {
                System.out.println(i);
                dem++;
            }
            i++;
            
        }
    }
    
}
