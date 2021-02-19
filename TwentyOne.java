package day4lab;

// 21.

import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] args) {
		
		TwentyOne tOne = new TwentyOne();
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		switch(month){ 
		case 1:System.out.println("31");
			break;
		case 2:System.out.println(tOne.isLeapYear(year) ? "29" : "28");
			break;
		case 3:System.out.println("31");
			break;
		case 4:System.out.println("30");
			break;
		case 5:System.out.println("31");
			break;
		case 6:System.out.println("30");
			break;
		case 7:System.out.println("31");
			break;
		case 8:System.out.println("31");
			break;
		case 9:System.out.println("30");
			break;
		case 10:System.out.println("31");
			break;
		case 11:System.out.println("30");
			break;
		case 12:System.out.println("31");
			break;	
		}
		 sc.close();
	}
	
	
	boolean isLeapYear(int year)
    {
       return (((year % 4 == 0) && (year % 100 != 0)) ||
            (year % 400 == 0));
    }
	
}
