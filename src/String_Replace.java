/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class String_Replace {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String temp[] = s.split(" ");
        String name = "";
        for(int i = 0; i < temp.length; i++){
            name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1) + " ";
        }
        System.out.println(name);
    }
}
