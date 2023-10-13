package it.corso.java.oop.gestionale;

public class Prodotto {
	private int id;
	private String nome;
	private String descrizione;
	private double prezzo;
	private Categoria categoriaMerceologica;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		this.prezzo = prezzo;
	}
	public Categoria getCategoriaMerceologica() {
		return categoriaMerceologica;
	}
	public void setCategoriaMerceologica(Categoria categoriaMerceologica) {
		this.categoriaMerceologica = categoriaMerceologica;
	}
	
	/**
	 * Questo metodo stampa le informazioni base di un prodotto
	 */
	public void stampaProdotto() {
		System.out.println(getId() + " " + getNome() + " " + getPrezzo());
	}
}
