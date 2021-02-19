package day4lab;

// 8.

import java.util.Scanner;

public class LocationOfElement {
	
	public static void main(String[] args) {
		
		int arr[]={15,62,8,5,8,10,2};
				
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		LocationOfElement loe = new LocationOfElement();
		System.out.println(loe.Search(arr,s));
		
		sc.close();
	}
	
	int Search(int[] a,int x) 
    { 
       for(int i = 0; i<a.length;i++)
       {
    	   if(a[i] == x)
    		   return i;
       }
       return -1; 
    }
}
