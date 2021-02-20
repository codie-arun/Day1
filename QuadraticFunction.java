package day4lab;

import java.util.Scanner;

public class QuadraticFunction {
	
	private float a,b,c;
	
	QuadraticFunction()
	{
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}
	
	QuadraticFunction(float x,float y,float z)
	{
		this.a = x;
		this.b = y;
		this.c = z;
	}
	
	
	//Extractors
	
	public float getA()
	{
		return a;
	}
	public float getB()
	{
		return b;
	}
	public float getC()
	{
		return c;
	}
	
	//Modifiers
	
	
	public void setA(float x)
	{
		this.a = x;
	}
	public void setB(float y)
	{
		this.b = y;
	}
	public void setC(float z)
	{
		this.c = z;
	}
	
	
	float compute(float x)
	{
		return (a*x*x)+(b*x)+c;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the parameters");
		QuadraticFunction qf = new QuadraticFunction();
		
		
		
		qf.setA(s.nextFloat());
		qf.setB(s.nextFloat());
		qf.setC(s.nextFloat());
		
		System.out.println(qf.getA());
		System.out.println(qf.getB());
		System.out.println(qf.getC());
		
		System.out.println("Result : "+qf.compute(2));
		
		s.close();
	}
	
}
