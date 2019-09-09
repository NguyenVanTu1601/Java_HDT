/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai13;


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private int ts;
    private int ms;

    public PhanSo() {
        this.ts = 0;
        this.ms = 1;
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }
    
    public PhanSo cong(PhanSo ps){
        PhanSo x = new PhanSo();
        int a = this.ts * ps.ms + this.ms * ps.ts;
        int b = this.ms * ps.ms;
        x.ts = a;
        x.ms = b;
        x.toiGian();
        return x;
    }
    
    public PhanSo tru(PhanSo ps){
        PhanSo x = new PhanSo();
        int a = this.ts * ps.ms - this.ms * ps.ts;
        int b = this.ms * ps.ms;
        x.ts = a;
        x.ms = b;
        x.toiGian();
        return x;
    }
    
    public PhanSo nhan(PhanSo ps){
        PhanSo x = new PhanSo();
        int a = this.ts * ps.ts;
        int b = this.ms * ps.ms;
        x.ts = a;
        x.ms = b;
        x.toiGian();
        return x;
    }
    
    public PhanSo chia(PhanSo ps){
        PhanSo x = new PhanSo();
        int a = this.ts * ps.ms ;
        int b = this.ms * ps.ts;
        x.ts = a;
        x.ms = b;
        x.toiGian();
        return x;
    }
    // Chưa xét Exception tử = 0
    public PhanSo nghichDao(){
        int x = this.ts;
        this.ts = this.ms;
        this.ms = x;
        return this;
    }
    
    public PhanSo doiDau(){
        this.ts *= -1.0;
        return this;
    }
    
    public PhanSo toiGian(){
        int x = this.ts;
        int y = this.ms;
        while(y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        this.ts /= x;
        this.ms /= x;
        return this;
    }
    
    public boolean bangNhau(PhanSo ps){
        this.toiGian();
        ps.toiGian();
        return this.ts == ps.ts && this.ms == ps.ms;
    }
    
    public boolean lonHon(PhanSo ps){
        PhanSo x = this.tru(ps);
        return x.ts * x.ms > 0;
    }
    
    public boolean nhoHon(PhanSo ps){
        PhanSo x = this.tru(ps);
        return x.ts * x.ms < 0;
    }
    public void hien(){
        System.out.println("Phan so : " + this.ts + "/" + this.ms);
    }
    
    public void nhap(Scanner sc){
        this.ts = sc.nextInt();
        this.ms = sc.nextInt();
    }
}
