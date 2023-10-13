package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Televisore extends Prodotto {
	private String pollici;
	private String accessori;
	
	public String getPollici() {
		return pollici;
	}
	public void setPollici(String pollici) {
		this.pollici = pollici;
	}
	public String getAccessori() {
		return accessori;
	}
	public void setAccessori(String accessori) {
		this.accessori = accessori;
	}
	
	public void cambiaCanale() {
		/*...*/
	}
	
	public void accendi() {
		/*...*/
	}
	
	
	@Override
	public List<String> getStore() {
		List<String> tmp = super.getStore();
		
		List<String> tmp2 = new ArrayList<String>();
		
		for(String string : tmp) {
			if(string.contains("2") || string.contains("4")) {
				tmp2.add(string);
			}
		}
		
		return tmp2;
		
//		ArrayList<String> tmp = new ArrayList<String>();
//			
//		tmp.add("Negozio 1");
//		tmp.add("Negozio 2");
//			
//		return tmp;
	}
	
	@Override
	protected void stampa() {
		
		super.stampa();
	}
	
	
}
