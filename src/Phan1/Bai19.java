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
public class Bai19 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n + 5];
        int[] danhdau = new int[1001];
        try {
            for(int i = 0; i < n; i++){
                int x = 100 + random.nextInt(899);
                array[i] = x;
                danhdau[x]++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        int max = 0;
        for(int i = 100; i < 1000; i++){
            if(danhdau[i] > max) max = i;
        }
        System.out.println("Phan tu xuat hien nhieu nhat : " + max);
        System.out.println(danhdau[max]);
        for(int i : array) System.out.println(i + " ");
    }
}
