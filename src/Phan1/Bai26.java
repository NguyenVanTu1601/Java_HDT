/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan1;

import java.util.Scanner;

/**
 *
 * @author Van Tu
 */
public class Bai26 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][]a = new int[n+1][n+1];
	int d = 0;
	int gt = n * n;
	int hang = n - 1;
	int cot = n - 1;
	while(d<=n/2){
	    for(int i=d;i<=cot;i++) a[d][i]=gt--;
	    for(int i=d+1;i<=hang;i++) a[i][cot]=gt--;
            for(int i=cot-1;i>=d;i--) a[hang][i]=gt--;
	    for(int i=hang-1;i>d;i--) a[i][d]=gt--;
	    d++; hang--; cot--;
	}    
	for(int i = 0; i < n; i++){
	    for(int j = 0; j < n; j++){
	    	System.out.printf("%d ", a[i][j]);
	    }
	    System.out.println("");
	}
    }
}
