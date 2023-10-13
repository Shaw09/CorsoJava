package it.corso.java.modificatori1;

public class Persona {
	private int id;
	private String nome;
	private String cognome;
	
	public static final String ID = "APRE";
	
	public void cammina() {
		/*...*/
	}
	
	protected void mangia() {
		bevi();
		/*...*/
	}
	
	void dormi() {
		/*...*/
	}
	
	private void bevi() {
		/*...*/
	}
}
