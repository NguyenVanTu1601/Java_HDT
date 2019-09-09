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
public class Bai16 {
    public static boolean NT(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n > 2){
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
    public static boolean CSNT(int n){
        while(n != 0){
            if(NT(n % 10) == false) return false;
            n = n / 10;
        }
        return true;
    }
    
    public static boolean DaoNT(int n){
        int m = 0;
        while(n != 0){
            m = m * 10 + (n % 10);
            n = n / 10;
        }
        if(NT(m)) return true;
        else return false;
    }
    public static void main(String[] args) {
        for(int i = 1000000; i <= 9999999; i++){
            if(CSNT(i)){
                if(NT(i)){
                    if(DaoNT(i)) System.out.println(i);
                }
            }
        }
        
    }
}
