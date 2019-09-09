/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = random.nextInt(50);
            }
        }
        int b[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = a[j][i];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d " , b[i][j]);
            }
            System.out.println("");
        }
    }
}
