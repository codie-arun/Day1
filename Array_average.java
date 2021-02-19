package day4lab;

// 5.

import java.util.Scanner;



public class Array_average {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int n = sc.nextInt();
		
		int arr[] = new int[n]; 
		System.out.println("Enter the numbers");
		for(int i = 0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		
		Array_average av = new Array_average();
		System.out.println(av.avg(arr));
		sc.close();
	}
	
	
	public float avg(int[] arr)
	{
		float result = 0;
		for(int i:arr)
			result+=i;
		
		return result/arr.length;
	}
}
