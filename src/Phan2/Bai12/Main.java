/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix mt1 = new Matrix(2,3);
        Matrix mt2 = new Matrix();
        mt1.input(sc);
       // mt2.input(sc);
        Matrix mt3 = mt1.transpose();
        mt3.printf();
    }
}
