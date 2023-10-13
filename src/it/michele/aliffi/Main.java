package it.michele.aliffi;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Articolo articolo = new Articolo(
			1l, 
			"Parole e frasi palindrome", 
			"Focus", 
			"Avete presente le parole  palindrome? Sono quelle parole mantengono lo tesso suono e lo stesso significato "
			+ "sia che si leggano normalmente, da sinistra verso destra, sia viceversa, cioè da destra verso sinistra.  "
			+ "Ossesso  per esempio è una parola palindroma. Narturalmente si possono costruire anche delle intere frasi "
			+ "palindrome : basta un po' di attenzione e creatività.  Ecco qualche esempio di frasi palindrome. Come leggerete, "
			+ "lo stile di alcune di esse è piuttosto... antiquato. E vorrei vedere: non è affatto facile far corrispondere "
			+ "suono e significato di una frase sia che la si legga normalmente, sia che la si legga nel verso opposto!", 
				"Focus junior", 
			    new Date(), 
			    new Date());
			      
			   	System.out.println("Lettere presenti: " + articolo.conta());
			    System.out.println("Parole palindrome presenti: " + articolo.contaPalindrome());
	}
}
