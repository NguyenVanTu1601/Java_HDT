/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai28_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger("12345678910111415161712");
        BigInteger b = new BigInteger("12354678912345678912245");
        BigInteger sum = a.add(b);
        BigInteger subtract = a.subtract(b);
        BigInteger mul = a.multiply(b);
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(mul);
        
    }
}
