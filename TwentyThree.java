package day4lab;

// 23.

public class TwentyThree {
	
	
	
	public static void main(String[] args) {
		
		
		TwentyThree tthree = new TwentyThree();
		tthree.met1();
	}
	
	void met1()
	{
		MyTest t = new MyTest();
		t.n *=10; 
		System.out.println(t.n);
	}
}


class MyTest{
	
	protected int n = 10;
	
}