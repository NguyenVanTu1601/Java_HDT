/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai18 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static ArrayList SetArrayList(){
        ArrayList arrayList = new ArrayList();
        int n = scanner.nextInt();
        while(n > 0){
            arrayList.add(100 + random.nextInt(899));
            n--;
        }
        return arrayList;
    }
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList = SetArrayList();
        int i = 0;
        int j = arrayList.size() - 1;
        int kt = 0;
        while(i <= j){
            if(arrayList.get(i) != arrayList.get(j)){
                System.out.println("Mang khong doi xung");
                kt = 1;
                break;
            }
        }
        if(kt == 0) System.out.println("Mang doi xung");
        
        
    }
}
