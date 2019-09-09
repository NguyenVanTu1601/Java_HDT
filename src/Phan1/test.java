/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
     
        BigInteger a = new BigInteger(1000, new SecureRandom()); // số trong khoảng 2^1000
        
        System.out.println(a);
    }
}
