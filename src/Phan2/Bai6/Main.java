/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StackOfIntergers st = new StackOfIntergers(1000);
        while(n != 0){
            st.push(n % 2);
            n = n / 2;
        }
        
        System.out.println("So n sau khi chuyen sang nhi phan : ");
        while(st.isEmpty() == false){
            System.out.printf("%d", st.pop());
        }
    }
}
