package it.corso.java.oparitm;

public class OperatoriAritmetici {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = a+b;
		
		System.out.println(c);
//		System.out.println(a+=b);
		
		
//		if(a > b && b <= 20) {
//			System.out.println("eccomi and");
//		}
//		
//		if(a > b || b <= 20) {
//			System.out.println("eccomi or");
//		}
//		
//		if(a > b) {
//			System.out.println("eccomi a>b");
//		}
//		
//		if(!(a > b)) {
//			System.out.println("eccomi !(a>b)");
//		}
		
		if(a != b) {
			System.out.println("bro");
		}
		
		a = b;
		if(a == b) {
			System.out.println("yep");
//		} else {
//			System.out.println("riprova sarai più fortunato");
		}
		
		long  l1 = a;
		int d = (int) l1;
	}

}
