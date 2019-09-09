package Phan1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class KtSNT {

    public static void main(String[] args) {
        int [] arr;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Random rand= new Random();
        arr = new int [n];
       int count =0;
        while(count <n){
            arr[count++]=rand.nextInt(100);
         
        }
        int [] brr = new int[n];
        int sum =0;
        boolean isreal = false;
        for(int i=0;i<n;i++){
            isreal= false;
            for(int j=0;j<count;j++){
               if(arr[i]==brr[i]){
                   isreal=true;
                  break;
               } 
             }
            
               if(!isreal){
                brr[sum++]= arr[i];
            }
        }
        
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));
    }
    
}