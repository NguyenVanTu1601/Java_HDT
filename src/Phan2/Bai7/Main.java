/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai7;

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
    
    public static long Result(ArrayList<Character> arr){
        long result = 0;
        StackOfChars st = new StackOfChars();
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) != '+' && arr.get(i) != '-' && arr.get(i) != '*' && arr.get(i) != '/' ){
                st.push(arr.get(i));
            }
            else{
                if(arr.get(i) == '+'){
                    long s = (st.pop() - '0');
                    long t = (st.pop() - '0');
                    long kq = s + t;
                    st.push((char) (kq + '0'));
                }
                if(arr.get(i) == '-'){
                    long s = (st.pop() - '0');
                    long t = (st.pop() - '0');
                    long kq = t - s;
                    st.push((char) (kq + '0'));
                }
                if(arr.get(i) == '*'){
                    long s = (st.pop() - '0');
                    long t = (st.pop() - '0');
                    long kq = s * t;
                    st.push((char)(kq + '0'));
                   
                }
                if(arr.get(i) == '/'){
                    long s = (st.pop() - '0');
                    long t = (st.pop() - '0');
                    long kq = t/s;
                    st.push((char) ((kq)+ '0'));
                }
            }
        }
        result = st.pop() - '0';
        return result;
    }
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        StackOfChars st = new StackOfChars(1000);
        ArrayList<Character>array = new ArrayList<>();
        hauTo(st, s,array);
//        for(int i = 0; i < array.size(); i++){
//            System.out.printf("%s", array.get(i));
//        }
        System.out.println("\nKet qua = " + Result(array));
        
    }
}
