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
public class Bai27 {
    public static boolean thuannghich(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i = 100000; i <= 999999; i++){
            String s = "";
            s += i;
            if(thuannghich(s)) System.out.println(s);
        }
    }
}
