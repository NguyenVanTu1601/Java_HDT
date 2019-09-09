/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai14;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoPhuc {
    private float a;
    private float b;

    public SoPhuc() {
        this.a = 0;
        this.b = 0;
    }

    public SoPhuc(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public SoPhuc cong(SoPhuc sp){
        SoPhuc s = new SoPhuc();
        s.a = this.a + sp.a;
        s.b = this.b + sp.b;
        return s;
    }
    
    public SoPhuc tru(SoPhuc sp){
        SoPhuc s = new SoPhuc();
        s.a = this.a - sp.a;
        s.b = this.b - sp.b;
        return s;
    }
    
    public SoPhuc nhan(SoPhuc sp){
        SoPhuc s = new SoPhuc();
        s.a = this.a*sp.a - this.b * sp.b;
        s.b = this.a*sp.b + this.b * sp.a;
        return s;
    }
    public SoPhuc chia(SoPhuc sp){
        SoPhuc s = new SoPhuc();
        float modun = (float) (sp.a *sp.a + sp.b * sp.b);
        s.a = (this.a*sp.a + this.b*sp.b)/ modun;
        s.b = (sp.a*this.b - sp.b*this.a)/ modun;
        return s;
    }
    
    public SoPhuc nghichDao(){
        float modun = (float) (this.a * this.a + this.b * this.b);
        this.a = this.a / modun;
        this.b = (float) (this.b*(-1.0) / modun);
        return this;
    }
    // ?? Khong co định nghĩa so sánh số phức ....!
    public boolean bangNhau(SoPhuc sp){
        return this.a == sp.a && this.b == sp.b;
    }
    
    public void nhap(Scanner sc){
        this.a = sc.nextFloat();
        this.b = sc.nextFloat();
    }
    
    public void hien(){
        if(this.b > 0) System.out.println("So phuc : " + this.a + "+j" + this.b);
        else System.out.println("So phuc : " + this.a + "-j" + (float)this.b*(-1));
    }
}
