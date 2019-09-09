/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai1_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sinhvien implements java.lang.Comparable<Sinhvien>{
    private String masv;
    private String tensv;
    private String lop;
    private String khoa;

    public Sinhvien() {
    }

    public Sinhvien(String masv, String tensv, String lop, String khoa) {
        this.masv = masv;
        this.tensv = tensv;
        this.lop = lop;
        this.khoa = khoa;
    }

    public String getTensv() {
        return tensv;
    }
    
    public String getLop(){
        return this.lop;
    }
    public void Nhap(Scanner sc){
        this.masv = sc.nextLine();
        this.tensv = sc.nextLine();
        this.lop = sc.nextLine();
        this.khoa = sc.nextLine();
    }

    @Override
    public String toString() {
        return this.masv + "\n" + this.tensv + "\n" + this.lop + "\n" + this.khoa + "\n";
    }

    @Override
    // Dung sap xep by Collections arraylist
    public int compareTo(Sinhvien o) {
         return this.tensv.compareTo(o.tensv);
    }
 
            
}
