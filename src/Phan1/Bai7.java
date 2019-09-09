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
public class Bai7 {
    public static int UCLN(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a ,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        for(int i = a; i < b; i++){
            for(int j = i + 1; j <= b; j++){
                if(UCLN(i, j) == 1){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
