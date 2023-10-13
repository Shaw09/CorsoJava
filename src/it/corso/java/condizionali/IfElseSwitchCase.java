package it.corso.java.condizionali;

public class IfElseSwitchCase {
	private static IfElseSwitchCase singleton;
	
	public static IfElseSwitchCase getIstance() {
		if(singleton == null) {
			singleton = new IfElseSwitchCase();
		}
		
		return singleton;
	}
	
	public int recuperaIlMaggiore(int num1, int num2, int num3) {
		int maggiore = 0;
		
		if(num1 > num2 && num1 > num3) {
			maggiore = num1;
		} else if(num2 > num1 && num2 > num3) {
			maggiore = num2;
		} else {
			maggiore = num3;
		}
		
		return maggiore;
	}
	
	public int recuperaIlMaggiore2(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		} else if(num2 > num1 && num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}
	
	public boolean isNull(String text) {
		if(text == null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * 
	 * @param codice può contenere valori ammessi sono 1, 2, 3
	 * @return
	 */
	
	
	public String recuperaTesto(int codice) {
		String testo = null;
		
		switch (codice) {
		case 1: 
			testo = "codice1";
			break;
		case 2:
			testo = "codice2";
			break;
		case 3:
			testo = "codice3";
			break;
			
		default:
			testo = "prova";
		}
		
		return testo;
	}
	
	public String recuperaTesto2(int codice) {
		switch (codice) {
		case 1: 
			return "codice1";
		case 2:
			return "codice2";
		case 3:
			return "codice3";
			
		default:
			return "prova";
		}
	}
	
//	public void setTesto(String testo) {
//		return "";
//	}
	
	public String recuperaTesto(String testoBase) {
		String testo = null;
		
		switch (testoBase) {
		case "1":
			testo = "codice1";
		}
		
		return testo;
	}
	
}
