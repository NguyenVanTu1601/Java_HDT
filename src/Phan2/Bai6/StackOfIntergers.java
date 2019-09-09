/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2.Bai6;

/**
 *
 * @author Admin
 */
public class StackOfIntergers {
    private int [] elements;
    private int size;
    private int capacity;

    public StackOfIntergers() {
        this.capacity = 16;
        this.size = -1;
        elements = new int[capacity];
    }

    public StackOfIntergers(int capacity) {
        this.capacity = capacity;
        this.size = -1;
        elements = new int[capacity];
    }
    
    public boolean isEmpty(){
        if(this.size == -1) return true;
        else return false;
    }
    
    public boolean isFull(){
        if(size == capacity) return true;
        else return false;
    }
    
    public int peak(){
        return elements[size];
    }
    
    public void push(int value){
        elements[++size] = value;
    }
    
    public int pop(){
        int x = elements[size];
        this.size = this.size - 1;
        return x;
    }
    
    public int getSize(){
        return this.size;
    }
}
