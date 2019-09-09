/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai7;

/**
 *
 * @author Admin
 */
public class StackOfChars {
    private char [] elements;
    private int size;
    private int capacity;

    public StackOfChars() {
        this.capacity = 16;
        this.size = -1;
        elements = new char[16];
    }

    public StackOfChars(int capacity) {
        this.capacity = capacity;
        this.size = -1;
        elements = new char[capacity];
    }
    
     public boolean isEmpty(){
        if(this.size == -1) return true;
        else return false;
    }
    
    public boolean isFull(){
        if(size == capacity) return true;
        else return false;
    }
    
    public char peak(){
        return elements[size];
    }
    
    public void push(char value){
        elements[++size] = value;
    }
    
    public char pop(){
        char x = elements[size];
        this.size = this.size - 1;
        return x;
    }
    
    public int getSize(){
        return this.size;
    }
    
}
