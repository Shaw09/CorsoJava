package it.corso.java.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsempioStringa2Test {

	@Test
	public void testIsPalindroma() {
		EsempiStringa es = new EsempiStringa();
		
		assertTrue("La variabile è falsa", es.isPalindroma("anna"));
	}
	
	@Test
	public void testContaOccorrenza() {
		EsempiStringa es = new EsempiStringa();
		
		String testo = "Oggi è una bella giornata di sole";
		
		int occ =  3;
		
		assertEquals("Il numero di occorrenze è diverso da quello atteso", occ, es.contaOccorrenze(testo, "g"));
		
		assertNotNull(es);
	}

}
