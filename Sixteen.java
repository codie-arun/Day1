package day4lab;

import java.util.Scanner;

public class Sixteen {
	
	
public static void main(String[] args) {
		
		int arr[]={15,62,8,5,8,10,2};
				
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		LocationOfElement loe = new LocationOfElement();
		
		
		if(loe.Search(arr,s) == -1)
		{
			System.out.println("-1");
			return;
		}
			
		
		count(arr,s);
		
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
	
	static void count(int[] a,int n) 
    { 
		int count = 0;
		System.out.println("Positions of occurrence");
        for(int i = 0;i<a.length;i++)
        {
        	
        	if(a[i] == n)
        	{
        		count++;
        		System.out.println(i);
        	}
        }
        System.out.println("Total occurrence :"+count);
        
    }
	
	
}
