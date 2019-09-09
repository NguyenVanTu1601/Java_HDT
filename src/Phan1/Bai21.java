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
public class Bai21 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = 100+ random.nextInt(899);
        }
        Arrays.sort(a);
        System.out.println("Mang sau sap xep : ");
        String s = Arrays.toString(a);
        System.out.println(s);
        ArrayList arrayList = new ArrayList();
        for(int i = 0; i < n - 1; i++){
            arrayList.add(a[i]);
            while(a[i] == a[i+1]) i++;
        }
        if(a[n-2] != a[n-1]) arrayList.add(a[n-1]);
        String ss = arrayList.toString();
        System.out.println(ss);
    }
}
