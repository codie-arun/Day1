package day4lab;

// 11.

import java.util.Scanner;

 
public class LowerTriangle {
	
	
	 public static void main(String[] args) {
		 	
		    System.out.println("Enter the size");
		 
		 	Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
		 
		 
			int[][] arr = new int[s][s];
			int n = 1;
			
			for(int i = 0;i<s;i++)
			{
			    for(int j = 0;j<=i;j++)
				{
				   arr[i][j] = n++;
				}
			}
			
			for(int i = 0;i<s;i++)
			{
			    for(int j = 0;j<=i;j++)
				{
				   System.out.print(arr[i][j]+" ");
				}
			    System.out.println();
			}
			 sc.close();
		}
	
	
}
