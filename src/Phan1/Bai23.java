/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = random.nextInt(100);
        }
        int danhdau[] = new int[n];
        for(int i = 0; i < n; i++){
            danhdau[i] = 1;
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i; j < n - 1; j++){
                if(a[j] < a[j+1]) danhdau[i]++;
                else break;
            }
        }
        int max = 0;
        int vt = 0;
        for(int i = 0; i < n; i++){
            if(danhdau[i] > max){
                max = danhdau[i];
                vt = i;
            }
        }
        String s = Arrays.toString(a);
        String s1 = Arrays.toString(danhdau);
        System.out.println(s1);
        System.out.println(s);
        System.out.println(vt + " " + max);
    }
}
