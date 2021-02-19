package day4lab;

// 17.

public class Seventeen {
	
	static final int n = 100;
	static double f = 1.1;
	
	public static void main(String[] args) {
		
		//Test t = new Test(); //The constructor Test() is undefined
		Seventeen s = new Seventeen();
		s.access();// Cannot make a static reference to the non-static method access() from the type Seventeen
		// n = 20; // The final field Seventeen.n cannot be assigned
		
	}
	
	void access() {
		Seventeen s = new Seventeen();
		System.out.println(s.f);
		System.out.println(Seventeen.f);
	}
	
	
	
}

class Test{
	
	Test(int num){
		System.out.println(num);
	}
	
}
