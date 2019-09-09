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
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumchan = 0;
        int sumle = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0) sumchan += i;
            else sumle += i;
        }
        System.out.println("Tong so chan = " + sumchan);
        System.out.println("Tong so le = " + sumle);
    }
    
}
