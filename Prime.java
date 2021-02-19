package day4lab;
import java.util.Scanner;
import java.lang.Math;

//4.

public class Prime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int flag = 0;
		for(int i = 2;i<=Math.sqrt(n);i++)
		{
			if(n%i == 0) {
				System.out.println("Not a prime number");
				flag = 1;
			}
				
		}
		
		if(flag == 0)
			System.out.println("Is a prime number");
		
		sc.close();
	}
	
}
