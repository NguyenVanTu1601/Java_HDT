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
public class Bai30 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        s = s.trim(); // bỏ khoảng trắng đầu , cuối 
        s = s.replaceAll("\\s+", " "); // \s : so khớp khoảng trống + là 1 hay nhiều 
        String temp[] = s.split(" ");
        s = "";
        for(int i = 0; i < temp.length;i++){
            s = s + String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1) + " "; 
            // substring(1) .. lấy chuỗi con từ 1 đến hết
        }
        System.out.println(s);
    }
}
