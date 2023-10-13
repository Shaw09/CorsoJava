package it.corso.java.string;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsempioStringaTest {

//	@Test
//	public void testIsPalindroma() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testContaOccorrenza() {
		EsempiStringa es = new EsempiStringa();
		
		String testo = "Oggi è una bella giornata di sole";
		
		int occ =  3;
		
		assertEquals("Il numero di occorrenze è diverso da quello atteso", occ, es.contaOccorrenze(testo, "g"));
	}

}
