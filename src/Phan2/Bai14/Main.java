/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai14;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc(4,2);
        SoPhuc sp2 = new SoPhuc(1,1);
        //SoPhuc sp3 = new SoPhuc();
        SoPhuc sp3 = sp1.chia(sp2);
        sp3.hien();
        
    }
}
