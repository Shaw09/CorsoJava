package it.corso.java.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
		List<Utente> elenco = m.elencoUtenti();
		
		List<Utente> trovati = m.cercaUtenti(elenco, utente -> utente.getNome().equals("Paolo"));
		trovati = m.cercaUtenti(elenco, utente -> utente.getCognome().equals("Paolo"));
		
		
		for(Utente utenteTrovato : trovati) {
			System.out.println(utenteTrovato.getCognome() + " " + utenteTrovato.getNome());
		}
		
		
		trovati = m.cercaUtentiPerNome(elenco, "Paolo");
		trovati = m.cercaUtentiPerCognome(elenco, "Preite");
		
		
		Consumer<Utente> cons = utente -> System.out.println(utente.getCognome() + " " + utente.getNome());
		elenco.forEach(cons);
		
		elenco.forEach(utente -> System.out.println(utente.getCognome() + " " + utente.getNome()));
		
		
		Consumer<Utente> cu = utente -> System.out.println(utente.getCognome() + " " + utente.getNome());
		
		for(Utente utente2 : elenco) {
			cu.accept(utente2);
		}
		
		
		for(Utente utente2 : elenco) {
			System.out.println(utente2.getCognome() + " " + utente2.getNome());
		}
		
		Iterator<Utente> it = elenco.iterator();
		
		while(it.hasNext()) {
			Utente u = it.next();
			
			System.out.println(u.getCognome() + " " + u.getNome());
		}
		
		
		/* UnaryOperator */
		UnaryOperator<String> unop = str -> str.toLowerCase();
		UnaryOperator<Long> unop2 = val -> val*val;
		
		System.out.println(unop.apply("Prova Di Stampa Minuscolo"));
		
		long num = 10;
		System.out.println("Il quadrato di " + num + " è " + unop2.apply(num));
		
		
		
		/* BinaryOperator */
		BinaryOperator<Double> biop = (a1, a2) -> a1 * a2;
		
		double x = 10.5;
		double y = 15;
		
		System.out.println("La moltiplicazione tra " + x + " ed " + y + " è: " + biop.apply(x, y));
		
		BinaryOperator<String> biop2 = (s1, s2) -> "Ciao " + s1 + " " + s2;
		
		List<Utente> utenti = m.elencoUtenti();
		
		for(Utente utente : utenti) {
			System.out.println(biop2.apply(utente.getNome(), utente.getCognome()));
		}
		
		
	}
	
	
	/* Esempio Function */
	public String stampaDatiUtente(Utente u, Function<Utente, String> utente) {
		return utente.apply(u);
	}
	
	private List<Utente> elencoUtenti(){
		List<Utente> utenti = new ArrayList<Utente>();
		
		utenti.add(new Utente("Paolo", "Preite", 39, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Mario", "Rossi", 40, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Antonio", "Di Girolamo", 23, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Caterina", "Montefalco", 55, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Valeria", "Natelli", 45, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Giovanna", "D`Antonelli", 50, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Paolo", "Pisani", 21, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Laura", "Gambaro", 19, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Benedetto", "Satini", 38, "Roma", "info@paolopreite.it", "test"));
		
		return utenti;
	}
	
	public List<Utente> cercaUtenti(List<Utente> utenti, Predicate<Utente> p){
		List<Utente> utentiTrovati = new ArrayList<Utente>();
		
		for(Utente u:utenti) {
			if(p.test(u)) {
				utentiTrovati.add(u);
			}
		}
		
		return utentiTrovati;
	}
	
	public List<Utente> cercaUtentiPerNome(List<Utente> utenti, String nome){
		List<Utente> utentiTrovati = new ArrayList<Utente>();
		
		for(Utente u:utenti) {
			if(u.getNome().equals(nome)) {
				utentiTrovati.add(u);
			}
		}
		
		return utentiTrovati;
	}
	
	public List<Utente> cercaUtentiPerCognome(List<Utente> utenti, String cognome){
		List<Utente> utentiTrovati = new ArrayList<Utente>();
		
		for(Utente u:utenti) {
			if(u.getCognome().equals(cognome)) {
				utentiTrovati.add(u);
			}
		}
		
		return utentiTrovati;
	}
}
