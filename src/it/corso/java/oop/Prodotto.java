package it.corso.java.oop;

import java.util.List;
import java.util.ArrayList;

public class Prodotto {
	private int id;
	private String nome;
	private String descrizione;
	private double prezzo;
	
	public static final String TIPO_PRODOTTO = "GENERICO";
	
	public Prodotto() {
		super();
	}

	public Prodotto(int id, String nome, double prezzo) {
		super();
		
		setId(id);
		setNome(nome);
		setPrezzo(prezzo);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int temp) {
		this.id = temp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		String tmp = nome.concat("...");
		
		this.nome = tmp;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		if(prezzo == 0) {
			prezzo = 1;
		}
		
		this.prezzo = prezzo;
	}
	
	public List<String> getStore() {
		ArrayList<String> tmp = new ArrayList<String>();
		
		tmp.add("Negozio 1");
		tmp.add("Negozio 2");
		tmp.add("Negozio 3");
		tmp.add("Negozio 4");
		
		
		return tmp;
	}
	
	protected void stampa() {
		/*...*/
	}
	
	private void sincronizza() {
		/*...*/
	}
}
