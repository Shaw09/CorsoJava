package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Prodotto {

	private String autore;
	
	@Override
	public List<String> getStore() {
		ArrayList<String> tmp = new ArrayList<String>();
		
		tmp.add("Negozio 1");
		tmp.add("Negozio 2");
		
		return tmp;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	
	
}
