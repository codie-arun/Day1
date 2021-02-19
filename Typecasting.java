package day4lab;

// 3.


public class Typecasting {
	
	
	static byte a = (byte)2147483646;
	static short b  = (short)a;
	static int c = a;
	static float d = a;
	static long e = a;
	static double f = a;
	
	static long ff = 999999999;
	static byte aa = (byte)ff;
	static short bb  = (short)ff;
	static int cc =(int)ff;
	static float dd = (float)ff;
	static double ee = (double)ff;
	
	
	public static void main(String[] args) {
		
		//Widening
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		//Narrowing
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(ff);
		
	}
	
}
