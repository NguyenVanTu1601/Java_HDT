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
public class Bai31 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        s = s.trim(); // bỏ khoảng trắng đầu , cuối 
        s = s.replaceAll("\\s+", " "); // \s : so khớp khoảng trống + là 1 hay nhiều 
        String temp[] = s.split(" ");
        int vt = 0;
        int length = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i].length() > length){
                vt = i;
                length = temp[i].length();
            }
        }
        System.out.println(vt + " " + temp[vt]);
    }
}
