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
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dai = scanner.nextInt();
        int rong = scanner.nextInt();
        for(int i = 1; i <= dai; i++){
            for(int j = 1; j <= rong; j++){
                if(i == 1|| i== dai) System.out.printf("*");
                else{
                    if(j == 1 || j == rong) System.out.printf("*");
                    else System.out.printf(" ");
                }
            }
            System.out.println("");
        }
    }
}
