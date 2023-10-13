package it.corso.java.regex;

public class Main {

	public static void main(String[] args) {
		String testo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
				+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
				+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia "
				+ "deserunt mollit anim id est laborum.";
		
		/* [...] */
		System.out.println(testo.replaceAll("[aeiou]", "H"));
		
		/* [^...] */
		System.out.println(testo.replaceAll("[^aeiou]", "H"));
		
		/* [...-...] */
		System.out.println(testo.replaceAll("[a-e]", "H"));
		
		/* [...&&[...]] */
		System.out.println(testo.replaceAll("[A-Z&&[L]]", "H"));
		
		/* . */
		System.out.println(testo.replaceAll(".", "H"));
		
		/* [...+[...]] */
		System.out.println(testo.replaceAll("[A-Z+[a-z]]", "K"));
		
		/* ^[...] */
		System.out.println(testo.replaceAll("^[A-Z]", "K"));
		
		/* [...]$ */
		System.out.println(testo.replaceAll("[A-Z]$", "K"));
		
		/* a* */
		System.out.println(testo.replaceAll("Lo*", "H"));
		
		/* a{n} */
		System.out.println(testo.replaceAll("L{2}", "H"));
		
		/* a{n,} */
		System.out.println(testo.replaceAll("L{2,}", "H"));
		
		/* a{n,m} */
		System.out.println(testo.replaceAll("L{2,4}", "H"));
		
		/* \d */
		System.out.println(testo.replaceAll("\\d", "H"));
		
		/* \D */
		System.out.println(testo.replaceAll("\\D", "H"));
		
		/* \s */
		System.out.println(testo.replaceAll("\\s", "H"));
		
		/* \S */
		System.out.println(testo.replaceAll("\\S", "H"));
		
		/* \w */
		System.out.println(testo.replaceAll("\\w", "H"));
		
		/* \W */
		System.out.println(testo.replaceAll("\\W", "H"));
	}

}
