/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai12;

import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Admin
 */
public class Matrix {
    private float a[][];

    public Matrix() {
        a = new float[3][3];
    }

    public Matrix(int rows, int cols) {
        a = new float[rows][cols];
    }
    
    public Matrix add(Matrix x){
        Matrix mt = new Matrix();
        //if(this.a.length != x.a.length || this.a[0].length != x.a[0].length) return 0; 
        // Chua ktra đk 
        for(int i = 0; i < this.a.length; i++){
            for(int j = 0; j < this.a[0].length; j++){
                mt.a[i][j] = this.a[i][j] + x.a[i][j];
            }
        }
        return mt;
    }
    
    public Matrix sub(Matrix x){
        Matrix mt = new Matrix();
        for(int i = 0; i < this.a.length; i++){
            for(int j = 0; j < this.a[0].length; j++){
                mt.a[i][j] = this.a[i][j] - x.a[i][j];
            }
        }
        return mt;
    }
    
    public Matrix neg(){
        for(int i = 0; i < this.a.length; i++){
            for(int j = 0; j < this.a[0].length; j++){
                this.a[i][j] *= -1.0;
            }
        }
        return this;
    }
    
    public Matrix transpose(){
        Matrix mt = new Matrix(this.a[0].length, this.a.length);
        for(int i = 0; i < this.a[0].length; i++){
            for(int j = 0; j < this.a.length; j++){
                mt.a[i][j] = this.a[j][i];
            }
        }
        return mt;
    }
    
    public Matrix mul(Matrix x){
        Matrix a = new Matrix();
        return a;
    }
    public void input(Scanner sc){
        for(int i = 0; i < this.a.length; i++){
            for(int j = 0; j < this.a[0].length; j++){
                this.a[i][j] = sc.nextFloat();
            }
        }
    }
    
    public void printf(){
        for(int i = 0; i < this.a.length; i++){
            for(int j = 0; j < this.a[0].length; j++){
                System.out.printf("%.2f ", this.a[i][j]);
            }
            System.out.println("");
        }
    }
}
