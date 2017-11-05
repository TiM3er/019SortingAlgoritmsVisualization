package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void wypisztablice(int[] arr)
	{
		for (int i = 0 ;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		} 
	}
	public static void wypisztablice(int[] arr,int x ,int y)
	{
		for (int i = 0 ;i<arr.length;i++) {
			if (i==x)
			{
				System.out.print("[");
				System.out.print(arr[i]);

				System.out.print("] ");
			}
			else if (i==y)
			{
				System.out.print("[");
				System.out.print(arr[i]);

				System.out.print("] ");
			}
			else
			{
				System.out.print(arr[i] + " ");

			}
		} 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int n ;
		n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0 ;i<n;i++) {
			arr[i]=rand.nextInt(100);
		}
		wypisztablice(arr);
		System.out.println("\n\n\n\n");
		
		
		
		int licznik = 0;
        int temp = 0;  
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
        		licznik++;
        		if(arr[j-1] > arr[j]){  
        			System.out.println(arr[j-1]+ " > " +arr[j]);
        			temp = arr[j-1];  
        			arr[j-1] = arr[j];  
        			arr[j] = temp;  
        		}  
        		else if (arr[j-1]<arr[j])
        		{
        			System.out.println(arr[j-1]+ " < " +arr[j]);
        		}
        		else if (arr[j-1]==arr[j])
        		{
        			System.out.println(arr[j-1]+ " = " +arr[j]);
        			
        		}
        		wypisztablice(arr,j-1,j);
        		System.out.println("\nPodejscie: " + licznik);
        	}  
     	}  
	}

}
