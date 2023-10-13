package it.corso.java.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EsempioPatternMatcher {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d");
		
		/*-------------*/
		String elenco = "1. Juventus, 2. Roma, 3. Napoli, 4. Atalanta, 5. Lazio";
		
		String[] elencoArray = p.split(elenco);
		
		for(int i = 1; i < elencoArray.length; i++) {
			System.out.println(i + elencoArray[i].replaceAll(",", ""));
		}
		
		/*--------------*/
		String testo = "info@paolopreite.it";
		
		boolean match = Pattern.matches(".*@.*", testo);
		System.out.println("Il testo contiene la @? " + match);
		
		/*--------------*/
		System.out.println(p.pattern());
		
		/*--------------*/
		p = Pattern.compile("PAOLO", Pattern.CASE_INSENSITIVE);
		
		elencoArray = p.split(testo);
		
		for(int i = 1; i <= elencoArray.length; i++) {
			System.out.println(i + " " + elencoArray[i-1]);
		}
		
		/*--------------*/
		System.out.println(p.flags());
		
		
		/********** MATCHER **********/
		System.out.println(" /*********** MATCHER ***********/ ");
		
		String text = 
				"<h1>Titolo 1</h1>"+
						"<p>Testo A</p>"+
						"<hr/>" +
						"<p>Testo B</p>"+
						"<h2>Titolo 2</h2>" +
						"<p>Testo C</p>";
		
		/**
		 * gruppo 0 - (<p>([^<]+)</p>)
		 * gruppo 1 - (<p>([^<]+)</p>)
		 * gruppo 2 - ([^<]+)
		 */
		
		String regex = "(<p>([^<]+)</p>)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("gruppi presenti nell'espressione regolare " + regex + ": " + matcher.groupCount());
		
		System.out.println(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println("-------------");
		}
		
		System.out.println("SECONDA ITERAZIONE");
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println("-------------");
		}
		
		matcher.reset();
		
		System.out.println("TERZA ITERAZIONE");
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println("-------------");
		}
		
		
		EsempioPatternMatcher ex = new EsempioPatternMatcher();
		System.out.println(ex.emailValidator("info@paolopreite.it"));
		
		System.out.println(ex.dateFormatValidator("12/09/2006"));
		
		System.out.println(ex.codiceFiscaleValidator("MHLDLW91P5G213B"));
		
		System.out.println(ex.passwordValidator("ciciobelo999"));
	}
}
