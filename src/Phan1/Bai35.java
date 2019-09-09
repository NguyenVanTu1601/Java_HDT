/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai35 {
    public static void main(String[] args) {
        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();
        String hop = s1; // Co trong s1 hoac s2
        for(int i = 0; i < s2.length(); i++){
            int kt = 1;
            for(int j = 0; j < s1.length(); j++){
                if(s2.charAt(i) == s1.charAt(j)){
                    kt = 0;
                    break;
                }
            }
            if(kt == 1) hop += s2.charAt(i);
        }
        String hieu  =""; // phan tu thuoc s1 ma ko thuoc s2
        for(int i = 0; i < s1.length(); i++){
            int kt = 0;
            for(int j = 0; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    kt = 1;
                     break;
                }
            }
            if(kt == 0) hieu += s1.charAt(i);
        }
        
        String giao =""; // phan tu thuoc ca s1 va s2
        
        for(int i = 0; i < s1.length(); i++){
            for(int j = 0; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    giao += s1.charAt(i);
                    break;
                }
            }    
        }
        System.out.println("Giao : " + giao);
        System.out.println("Hop : " + hop);
        System.out.println("Hieu : " + hieu);
    }
}
