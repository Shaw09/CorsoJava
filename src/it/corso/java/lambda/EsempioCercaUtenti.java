package it.corso.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EsempioCercaUtenti {

	public static void main(String[] args) {
		EsempioCercaUtenti ecu = new EsempioCercaUtenti();
		
		List<Utente> trovati = ecu.cercaUtenti(ecu.elencoUtenti(), utente -> utente.getCognome().equals("Preite"));
		
		System.out.println("utenti con cognome Preite");
		
		for(Utente utente : trovati) {
			System.out.println(utente.getCognome() + " " + utente.getNome());
		}
		
		System.out.println(" --------------------- ");
		
		trovati = ecu.cercaUtenti(ecu.elencoUtenti(), utente -> utente.getEmail().contains(".it"));
		
		System.out.println("utenti con email .it");
		
		for(Utente utente : trovati) {
			System.out.println(utente.getCognome() + " " + utente.getNome());
		}
		
		System.out.println(" --------------------- ");
		
		trovati = ecu.cercaUtenti(ecu.elencoUtenti(), utente -> utente.getEta() > 40);
		
		System.out.println("utenti con età > 40");
		
		for(Utente utente : trovati) {
			System.out.println(utente.getCognome() + " " + utente.getNome());
		}
		
		System.out.println(" --------------------- ");
		
		Utente u = ecu.cercaUtente(ecu.elencoUtenti(), utente -> utente.getCittaResidenza().equals("Roma"));
		
		if(u != null) {
			System.out.println(u.getCognome() + " " + u.getNome());
		}
	}

	public List<Utente> cercaUtenti(List<Utente> elencoUtenti, Predicate<Utente> criterio) {
		List<Utente> trovati = new ArrayList<Utente>();
		
		for(Utente utente : elencoUtenti) {
			if(criterio.test(utente)) {
				trovati.add(utente);
			}
		}
		
		return trovati;
	}
	
	public Utente cercaUtente(List<Utente> elencoUtenti, Predicate<Utente> criterio) {
		Utente trovato = null;
		
		for(Utente utente : elencoUtenti) {
			if(criterio.test(utente)) {
				return utente;	
			}
		}
		
		return trovato;
	}
	
	private List<Utente> elencoUtenti(){
		List<Utente> utenti = new ArrayList<Utente>();
		
		utenti.add(new Utente("Paolo", "Preite", 39, "Lecce", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Mario", "Rossi", 40, "Roma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Antonio", "Di Girolamo", 23, "Milano", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Caterina", "Montefalco", 55, "Parma", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Valeria", "Natelli", 45, "Pavia", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Giovanna", "D`Antonelli", 50, "Modena", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Paolo", "Pisani", 21, "Napoli", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Laura", "Gambaro", 19, "Enna", "info@paolopreite.it", "test"));
		utenti.add(new Utente("Benedetto", "Satini", 38, "Palermo", "info@paolopreite.it", "test"));
		
		return utenti;
	}
	
}
