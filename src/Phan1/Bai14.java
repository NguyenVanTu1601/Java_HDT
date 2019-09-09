/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

/**
 *
 * @author Van Tu
 */
public class Bai14 {
    public static boolean STN(int n){
        int m = n;
        int s = 0;
        while(n != 0){
            s = s * 10 + n % 10;
            n = n / 10;
        }
        if(s == m) return true;
        return false;
    }
    public static int tongcs(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        for(int i = 100000; i <= 999999; i++){
            if(STN(i) && tongcs(i) % 10 == 0){
                System.out.println(i);
            }
        }
    }
}
