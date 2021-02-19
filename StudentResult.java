package day4lab;


// 13.

import java.util.Random;
import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i = 0;i<n;i++)
			for(int j = 0;j<n;j++)
				arr[i][j] = rand.nextInt(100);
		
		print(arr,n);
		System.out.println();
		for(int i = 0;i<n;i++)
			System.out.println(sum(arr[i]));
		
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
	

	static int sum(int[] a)
	{
		int sum = 0;
		for(int i = 0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}
	
}
