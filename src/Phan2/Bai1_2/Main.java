/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai1_2;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void Sapxep(Sinhvien ds[], int n){ 
        for(int i = n - 1; i >= 0; i--){
            boolean check = true;
            for(int j = 0; j < i; j++){
                if(ds[i].getTensv().compareTo(ds[j].getTensv()) > 0){
                    Sinhvien x = ds[i];
                    ds[i] = ds[j];
                    ds[j] = x;
                    check = false;
                }
            }
            if(check) break;
        }
    }
    
    public static void Xem(Sinhvien ds[], int n){
        System.out.println("Danh sach sinh vien");
        for(int i = 0; i < n; i++){
            System.out.println(ds[i].toString());
        }
    }
    
    public static void Xem_Theo_Lop(Sinhvien ds[], int n, String tenLop){
        for(int i = 0; i < n ;i++){
            if(ds[i].getLop().equalsIgnoreCase(tenLop)){
                System.out.println(ds[i].toString());
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so sinh vien trong danh sach");
        int n = scanner.nextInt();
        String s = scanner.nextLine();
        Sinhvien ds[] = new Sinhvien[n]; // khởi tạo danh sách sinh viên
        System.out.println("Nhap thong tin sinh vien");
        for(int i = 0; i < n; i++){
            ds[i] = new Sinhvien(); // khởi tạo mỗi phần tử sinh viên mới
            ds[i].Nhap(scanner);
        }
        
        // Sapxep(ds, n);
        Xem(ds, n);
        String tenLop = "d17cqcn06-b";
        Xem_Theo_Lop(ds, n, tenLop);
    }
}
