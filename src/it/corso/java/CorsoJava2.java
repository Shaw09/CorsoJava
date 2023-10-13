package it.corso.java;

import it.corso.java.ciclo.ForWhileDoWhile;
import it.corso.java.condizionali.IfElseSwitchCase;
import it.corso.java.interruzione.BreakContinue;

public class CorsoJava2 {
	public int b = 5;
	public static String stampa = "CIAO!";
	
	public static void main(String[] args) {

		BreakContinue bc = new BreakContinue();
		bc.esempioBreak(10, 20);
		
		bc.esempioContinue(10, 20);
		
		bc.esempioContinue2(10, 20);
		
		ForWhileDoWhile ciclo = new ForWhileDoWhile();
//		ciclo.itera(0, 20);
		
//		ciclo.iteraDoWhile(0, 20);
		ciclo.iteraDoWhile(20, 20);
		
		ciclo.iteraFor(10);
		
		String[] stringhe = new String[] {"testo 1", "testo 2", "testo 3", "testo 4", "testo 5"};
		
		ciclo.iteraFor(stringhe);
		
		IfElseSwitchCase.getIstance().recuperaTesto(1);
		
//		IfElseSwitchCase.getIstance().isNull("test");
//		IfElseSwitchCase.getIstance().recuperaIlMaggiore(3, 8, 6);
		
//		IfElseSwitchCase test = new IfElseSwitchCase();
//		System.out.println(test.recuperaIlMaggiore(5, 3, 2));
//		
//		System.out.println(test.isNull("prova"));
		
		System.out.println("Ciao!!");

//		CorsoJava2 c1 = new CorsoJava2();
//		c1.b = 10;
		
//		CorsoJava2 c2= new CorsoJava2();
//		c2.b = 10;
//		System.out.println(c2.stampa);
		
		System.out.println(CorsoJava2.stampa);
		
		
//		CorsoJava2 c3; /* dichiarazione */
		
//		c3 = new CorsoJava2(); /*inizializzazione */
//		c3.b = 20;
		
//		CorsoJava2 c4 = new CorsoJava2(); /* dichiarazione e inizializzazione */
		
//		int val1 = 0;
		
//		System.out.println(val1);
		
		
//		double d = 0;
//		System.out.println(d);
		
//		String test = "prova di stampa";
//		
//		byte[] testAr = test.getBytes();
//		
//		for(int i = 0; i < testAr.length; i++) {
//			System.out.println(testAr[i]);
//		}
		
//		byte a = 100;
//		byte b = 20;
//		byte c = 30;
		
//		System.out.println((byte)(a+b+c));
		
//		int val1 = 10;
//		int val2 = 20;
		
//		Calcolatrice cc = new Calcolatrice();
//		int somma = cc.somma(val1, val2);
//		int sottrazione = cc.sottrazione(val1, val2);
//		int moltiplicazione = cc.moltiplicazione(val1, val2);
//		int divisione = cc.divisione(val1, val2);
		
//		System.out.println(somma);
//		System.out.println(sottrazione);
//		System.out.println(moltiplicazione);
//		System.out.println(divisione);
		
//		long val3 = 0l;
		
//		float af = 100.45f;
//		float bf = -10.30f;
		
//		float sommaf = af+bf;
		
//		System.out.println(sommaf);
		
//		double ad = 100.45;
//		double bd = -10.30;
		
//		double sommad = ad+bd;
		
//		System.out.println(sommad);
		
		
//		char c1 'a';
//		char c2 'b';

//		char c3 = (char) (c1+c2);
		
//		System.out.println(c3);
		
//		String test = "prova";
		
//		System.out.println(test+c1);
		
		
		CorsoJava2 c = new CorsoJava2();
		c.esempioStringa();
		
		
		String d = c.concatena("Mike", "of", "the", "Desert");
		
		System.out.println(d);
	}
	
	public void esempioStringa() {
//		String var1 = "Lorem ipsum...";
		
//		String s1 = "";
		String s2 = "Lorem ipsum...";
//		String s3 = new String();
		String s4 = new String("test,,,");
		
//		String s5 = new String
		String test = s2+s4;
		System.out.println(test);
	
		String test2 = s4.concat(s2);
		System.out.println(test2);
		
		
		/* trasformazione */
//		s2.toLowerCase();
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		String s5 = "   prova trim   ";
		System.out.println(s5);
		
		System.out.println(s5.trim());
		
		String t = "Questo è il corso Java AVANZATO";
		
		/* replace */
		String t1 = t.replace("ava", "!");
		System.out.println(t1);
		
		 /* replaceAll */
		String t2 = t.replaceAll("[a-nA-N]", "4");
		System.out.println(t2);
		
		/* replaceFirst */
		String t3 = t.replaceFirst("[a-n]+", "p");
		System.out.println(t3);
		
		t1.length();
		
		String t4 = t.substring(5);
		System.out.println(t4);
		
		String t5 = t.substring(0, 5);
		System.out.println(t5);
		
		t1 = "Cervo";
		t2 = "Cavoo";
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		
		String[] tArr = t1.split(" ");
		for(int i = 0; i < tArr.length; i++) {
			System.out.println(tArr[i]);
		}
	
		System.out.println(t1.startsWith("Ciao"));
		System.out.println(t1.endsWith("rvo"));
		
		System.out.println(t1.charAt(3));
		
	}
	
//	public String concatena(String stringa1, String stringa2, double c, File file) {
//		
//		return stringa1.concat(stringa2);
//	}
	
	public String concatena(String... vars) {
		String out = "";
		
		for(int i = 0; i < vars.length; i++) {
			out += vars[i];
		}
		
		return out;
	}
	
}
