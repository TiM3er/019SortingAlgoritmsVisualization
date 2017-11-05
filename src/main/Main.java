package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int n ;
		n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0 ;i<n;i++) {
			arr[i]=rand.nextInt(100);
		}
		for (int i = 0 ;i<n;i++) {
			System.out.print(arr[i]);
		} 
		
		
		
		
		
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
	}

}
