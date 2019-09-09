/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Secure_Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int x = secureRandom.nextInt(20);
        System.out.println(x);
    }
}
