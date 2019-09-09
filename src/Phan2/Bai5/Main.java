/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StackOfIntergers st = new StackOfIntergers(100);
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                st.push(i);
                n = n/ i;
            }
        }
        System.out.println("Ket qua : ");
        while(st.isEmpty() == false){
            System.out.printf("%d ", st.pop());
        }
    }
}
