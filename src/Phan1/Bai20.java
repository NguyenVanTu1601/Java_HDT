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
public class Bai20 {
    public static boolean SNT(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n > 2){
            for(int i = 2; i < Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int a[] = new int[500];
        Random random = new Random();
        for(int i = 0; i < 20; i++){
            a[i] = 1000+ random.nextInt(8999);
        }
        int n = new Scanner(System.in).nextInt();
        int abs = 10000000;
        int result = 0;
        for(int i = 0; i < 20; i++){
            if(SNT(a[i])){
                if(Math.abs(a[i] - n) < abs){
                    abs = Math.abs(a[i] - n);
                    result = a[i];
                }
            }
        }
        if(result == 0) System.out.println("Khong co so thoa man");
        else System.out.println("So thoa man la : " + result);
    }
}
