package day4lab;

// 15.

import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		
		Fifteen f = new Fifteen();
		f.prime();
		f.palindrome(s);
		f.perfect(s);
		f.isArmstrong(s);
		
		sc.close();
	}
	
	void prime()
	{
		int n = 100;
		
		for(int i = 1;i<n;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
		System.out.println();
	}
	
	boolean isPrime(int x)
	{
		if(x == 1)
			return false;
		
		for(int i = 2;i<x;i++)
		{
			if(x%i == 0)
				return false;
		}
		return true;
	}
	
	void palindrome(int n)
	{
		int r,sum=0,temp = n;
		while(n>0){ 
			
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		}    
	    if(temp==sum)    
	    	System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");
	}
	
	void perfect(int n) 
	{ 
	    int sum = 1; 
	  
	    for (int i = 2; i * i <= n; i++) 
	    { 
	        if (n % i==0) 
	        { 
	            if(i * i != n) 
	                sum = sum + i + n / i; 
	            else
	                sum = sum + i; 
	        } 
	    }  

	    if (sum == n && n != 1)
	    {
	    	System.out.println("perfect number ");
	    	return;
	    }
	    
	    System.out.println("Not perfect number ");
	} 
	
	
	int power(int x, long y) 
    { 
        if( y == 0) 
            return 1; 
        if (y%2 == 0) 
            return power(x, y/2)*power(x, y/2); 
        return x*power(x, y/2)*power(x, y/2); 
    } 
  

	int order(int x) 
    { 
        int n = 0; 
        while (x != 0) 
        { 
            n++; 
            x = x/10; 
        } 
        return n; 
    } 
  
 
    void isArmstrong (int x) 
    { 
        
        int n = order(x); 
        int temp=x, sum=0; 
        while (temp!=0) 
        { 
            int r = temp%10; 
            sum = sum + power(r,n); 
            temp = temp/10; 
        } 
  
        System.out.println((sum==x)?"Armstrong Number":"Not Armstrong Number");
        
    } 
	
}
