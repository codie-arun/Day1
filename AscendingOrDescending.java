package day4lab;
import java.util.Arrays;
import java.util.Scanner;

// 7.

public class AscendingOrDescending {
	
	public static void main(String[] args) {
		
		int arr[]={15,62,8,5,8,10,2};
		
		System.out.println("Press 1 for Ascending Sort");
		System.out.println("Press 2 for Descending Sort");
		
		AscendingOrDescending aod = new AscendingOrDescending();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		switch (n) {
		  case 1:
			  aod.ascendingSort(arr);
			  break;
		  case 2:
			  aod.descendingSort(arr);
			  break;
		}
		
		
		for(int i:arr)
			System.out.print(i+" ");
		
		sc.close();
		
	}
	
	public void ascendingSort(int[] a) {
		Arrays.sort(a);
	}
	
	void descendingSort(int[] a) {
		Arrays.sort(a);
		int i, x; 
        for (i = 0; i < a.length  / 2; i++) { 
            x = a[i]; 
            a[i] = a[a.length - i - 1]; 
            a[a.length - i - 1] = x; 
        } 
	}
}
