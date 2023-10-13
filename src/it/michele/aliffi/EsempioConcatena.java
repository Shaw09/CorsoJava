package it.michele.aliffi;

public class EsempioConcatena {

	public static void main(String[] args) {
		System.out.println(concatena("Michele", "Aliffi", true));
		System.out.println(concatena("Michele", "Aliffi", false));
		
		System.out.println(sottostringa("testo con più di tre lettere"));
		System.out.println(sottostringa("tre"));
	}
	
	public static String concatena(String nome, String cognome, boolean stampaMaiuscolo) {
		String spazio = " ";
		
		if(stampaMaiuscolo) {
			return nome.toUpperCase().concat(spazio).concat(cognome.toUpperCase());
		}
		
		return nome.toLowerCase().concat(spazio).concat(cognome.toLowerCase());
	}
	
	public static String sottostringa(String testo) {
		if(testo.length() > 3) {
			return testo.substring(0, 3);
		}
		return testo;
	}
}
