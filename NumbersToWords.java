package day4lab;

// 18.

import java.util.Scanner;

public class NumbersToWords {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		
		NumbersToWords nobj = new NumbersToWords();
		n = nobj.reverse(n);
		sc.close();
		while(n>0)
		{
			x = n%10;
			n=n/10;
			switch(x)
			{
				case 1:System.out.println("one");
				  	break;
				case 2:System.out.println("two");
			  		break;
				case 3:System.out.println("three");
			  		break;
				case 4:System.out.println("four");
			  		break;
				case 5:System.out.println("five");
			  		break;
				case 6:System.out.println("six");
			  		break;
				case 7:System.out.println("seven");
			  		break;
				case 8:System.out.println("eight");
			  		break;
				case 9:System.out.println("nine");
			  		break;
				case 0:System.out.println("zero");
			  		break;
				
			}
		}
		
	}
	
	int reverse(int x)
	{
		int temp,res = 0;
		
		while(x>0)
		{
			temp = x%10;
			x = x/10;
			res = res*10+temp;
		}
		return res;
		
	}
	
}
