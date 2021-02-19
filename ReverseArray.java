package day4lab;

// 9.

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[]={15,62,8,5,8,10,2};
		ReverseArray ra = new ReverseArray();
		ra.rev(arr);
		
		for(int i:arr)
			System.out.print(i+" ");
		
	}
	
	void rev(int[] a) {
		
		int i, x; 
        for (i = 0; i < a.length  / 2; i++) { 
            x = a[i]; 
            a[i] = a[a.length - i - 1]; 
            a[a.length - i - 1] = x; 
        } 
	}
}
