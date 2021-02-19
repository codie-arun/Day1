package day4lab;

// 20.

import java.util.Scanner;
import java.util.Random;

public class HighestTwoD {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Random rand = new Random();
		HighestTwoD htd = new HighestTwoD();
		
		int arr[][] = new int[n][n];
		
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				arr[i][j] = rand.nextInt(100);
			}
				
		}
		
		print(arr,n);
		System.out.println();
		
		for(int i = 0;i<n;i++)
		{
			System.out.println(htd.max(arr[i])); 
		}
		sc.close();
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
	
	int max(int[] a)
	{
		int max = 0;
		for(int i:a)
		{
			if(max<i)
				max = i;
		}
		return max;
	}
	
}
