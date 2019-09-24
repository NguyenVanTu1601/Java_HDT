/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Sort_List {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(10);
        array.add(4);
        array.add(15);
        array.add(2);
        array.add(3);
        // Sap xep giam
        Collections.sort(array, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
            
        });
        for(int i = 0; i < array.size(); i++ ){
            System.out.print(array.get(i) + " ");
        }
    }
}
