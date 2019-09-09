/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai4;

import Phan1.Bai10;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Main {
    public static boolean SNT(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n > 2){
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
            return true;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Chú ý khởi tạo mảng trong contructor nếu không sẽ dính nullpointerException
        StackOfIntegers st = new StackOfIntegers(100);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i < n; i++){
            if(SNT(i)) st.push(i);
        }
        while(st.isEmpty() == false){
            System.out.println(st.pop());
        }
        
    }
}
