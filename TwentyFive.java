package day4lab;

// 25.

protected class TwentyFive {
	
	String method()
	{
		return "wow";
	}
	
}

class Derived{
	public void useD()
	{
		TwentyFive t = new TwentyFive();
		System.out.println("TwentyFour says, "+t.method());
	}
}


/*
TwentyFour.java:3: error: modifier protected not allowed here
protected class TwentyFour {
*/