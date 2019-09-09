/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai34 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        s = s.trim(); // bỏ khoảng trắng đầu , cuối 
        s = s.replaceAll("\\s+", " "); // \s : so khớp khoảng trống + là 1 hay nhiều 
        String temp[] = s.split(" ");
        Arrays.sort(temp);
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);
        }
    }
}
