package it.corso.java.generics;

import java.util.ArrayList;
import java.util.List;

import it.corso.java.classiinnerlocali.Appartamento;

public class Main {

	public static void main(String[] args) {
		
		/* senza generics */
		
		List lista1 = new ArrayList();
		
		lista1.add("es 1");
		lista1.add("es 2");
		lista1.add(new Appartamento());
		
		String test1 = (String) lista1.get(0);
		
		/* con generics */
		List<String> lista2 = new ArrayList<String>();
		lista2.add("es 3");
		lista2.add("es 4");
		
		String test2 = lista2.get(0);
	}

}
