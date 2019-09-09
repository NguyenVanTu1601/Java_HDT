/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class String_Tokenizer {
    public static void main(String[] args) {
        String s = new String();
        s = new Scanner(System.in).nextLine();
        StringTokenizer st = new StringTokenizer(s,",- ", false);
        ArrayList<String>temp = new ArrayList<>();
        while(st.hasMoreTokens()){
            temp.add(st.nextToken());
        }
        for(int i = 0; i < temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
}
