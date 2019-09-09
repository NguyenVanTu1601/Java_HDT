/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = random.nextInt(100);
        }
        for(int j = 0; j < m; j++){
            b[j] = random.nextInt(100);
        }
        int p = scanner.nextInt();
        ArrayList arrayList = new ArrayList();
        for(int i = 0; i < p ; i++){
            arrayList.add(a[i]);
        }
        for(int j = 0; j < m; j++){
            arrayList.add(b[j]);
        }
        for(int i = p; i < n; i++){
            arrayList.add(a[i]);
        }
        String s1 = Arrays.toString(a);
        String s2 = Arrays.toString(b);
        System.out.println(s1);
        System.out.println(s2);
        String s = arrayList.toString();
        System.out.println(s);
    }
}
