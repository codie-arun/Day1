package day4lab;

import java.util.Scanner;

// 19.

public class ReverseTwoDArray {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				arr[i][j] = i+j;
			}
				
		}
		
		print(arr,n);
		System.out.println();
		
		for(int i = 0;i<n;i++)
		{
			rev(arr[i]);
		}
		
		print(arr,n);
		
		sc.close();
	}
	
	
	
		static void rev(int[] a) {
			
			int i, x; 
	        for (i = 0; i < a.length  / 2; i++) { 
	            x = a[i]; 
	            a[i] = a[a.length - i - 1]; 
	            a[a.length - i - 1] = x; 
	        } 
		}
		
		static void print(int[][] arr,int n)
		{
			for(int i = 0;i<n;i++)
			{
				for(int j = 0;j<n;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();	
			}
		}
}
