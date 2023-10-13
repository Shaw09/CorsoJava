package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Smartphone extends Prodotto {

	private String imei;

	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	@Override
	public List<String> getStore() {
		ArrayList<String> tmp = new ArrayList<String>();
		
		tmp.add("Negozio 1");
		tmp.add("Negozio 2");
		
		return tmp;
	}

	
}
