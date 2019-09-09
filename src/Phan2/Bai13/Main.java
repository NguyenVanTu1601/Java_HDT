/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai13;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(1,2);
        PhanSo ps2 = new PhanSo(3,4);
        PhanSo ps3 = ps1.cong(ps2);
        PhanSo ps4 = new PhanSo(2,4);
        System.out.println(ps1.nhoHon(ps2));
        
    }
}
