/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static int Ut(char x){
        if(x == '+' || x == '-') return 1;
        if(x == '*' || x == '/') return 2;
        return 0;
    }
    
    public static void hauTo(StackOfChars stackOfChars, String s, ArrayList<Character> arr){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                //System.out.printf("%s", s.charAt(i));
                arr.add(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                    stackOfChars.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                while(stackOfChars.peak() != '('){
                    //System.out.printf("%s", stackOfChars.peak());
                    arr.add(stackOfChars.pop());
                }
                stackOfChars.pop();
            }
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
                while(stackOfChars.isEmpty() == false && 
                        Ut(stackOfChars.peak()) >= Ut(s.charAt(i))){
                    //System.out.printf("%s", stackOfChars.peak());
                    arr.add(stackOfChars.pop());
                }
                stackOfChars.push(s.charAt(i));
            }
        }
        if(stackOfChars.isEmpty() == false){
            while(stackOfChars.isEmpty() == false){
                //System.out.printf("%s", stackOfChars.peak());
                arr.add(stackOfChars.pop());
            }
        }
    }
    
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        StackOfChars st = new StackOfChars(1000);
        ArrayList<Character>array = new ArrayList<>();
        hauTo(st, s,array);
        System.out.println(array.toString());
    }
}
