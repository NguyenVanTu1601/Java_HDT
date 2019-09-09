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
public class Bai25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] a = new int [n][m];
        int[][] b = new int [m][k];
        int[][] c = new int [n][k];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = random.nextInt(10);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < k; j++){
                b[i][j] = random.nextInt(10);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                c[i][j] = 0;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                for(int p = 0; p < m; p++){
                    c[i][j] = c[i][j] + a[i][p] * b[p][j];
                }
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
            for(int j = 0; j < k; j++){
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
