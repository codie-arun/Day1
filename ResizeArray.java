package day4lab;

import java.util.Scanner;
import java.util.Arrays;

// 6.

public class ResizeArray {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int n = sc.nextInt();
		
		for(int i = 0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Creating Larger Array....");
		int[] arr2 = Arrays.copyOf(arr, n);
		
		for(int i = 5;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println("Sorry... Memory is Costly");
		sc.close();
	}
	
}
