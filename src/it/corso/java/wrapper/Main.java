package it.corso.java.wrapper;

public class Main {

	public static void main(String[] args) {
		
		int a = 10;
		
		Integer b = new Integer(10);
		
		Integer c = new Integer(a);
		
		/* boxing */
		Double d1 = new Double(10.40);
		
		double d2 = 90.451;
		
		Double d3 = new Double(d2);
		
		/* autoboxing */
		Double d4 = 123.34;
		
		/* unboxing */
		double d5 = d4;
	}

}
