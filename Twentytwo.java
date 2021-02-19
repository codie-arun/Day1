package day4lab;

// 22.

public class Twentytwo {
	
	public static void main(String[] args) {
		Demo tt = new Demo();
		
		
		//System.out.println(tt.a);
		System.out.println(tt.b);
		System.out.println(tt.c);
		System.out.println(tt.d);
	
		
		//tt.method1();
		tt.method2();
		tt.method3();
		tt.method4();
	}
	
	/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The field Demo.a is not visible
	The method method1() from the type Demo is not visible
	*/
}

class Demo{
	
	private int a = 1;
	    int b = 2;
	protected int c = 3;
	public int d = 4;
	
	
	
	private void method1()
	{
		System.out.println("private");
	}
	
	void method2()
	{
		System.out.println("nomod");
	}
	
	protected void method3()
	{
		System.out.println("protected");
	}
	
	public void method4()
	{
		System.out.println("public");
	}
	
	public void fun() {
		System.out.println(a);
		method1();
	}
}

