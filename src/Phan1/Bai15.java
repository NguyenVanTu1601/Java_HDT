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
public class Bai15 {
    public static boolean CS(int n){
        while(n != 0){
            int i = n % 10;
            if(i != 0 && i != 6 && i != 8) return false;
            n /= 10;
        }
        return true;
    }
    public  static boolean tongcs(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        if(sum % 10 == 0) return true;
        return false;
    }
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
    public static void main(String[] args) {
        for(int i = 1000000; i <= 999999999; i++){
            if(CS(i)){
                if(tongcs(i)){
                    if(STN(i)) System.out.println(i);
                }
            }
        }
    }
   
}
