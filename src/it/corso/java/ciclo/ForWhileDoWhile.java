package it.corso.java.ciclo;

public class ForWhileDoWhile {
	
	public void itera(int contatore, int estremo) {
		
		while(contatore < estremo) {
			System.out.println("contatore vale " + contatore);
			contatore++;
		}
		System.out.println("sono uscito dal ciclo");
	}
	
	public void iteraDoWhile(int contatore, int estremo) {
		do {
			System.out.println("contatore vale " + contatore);
			contatore++;
		}while(contatore < estremo);
		
		System.out.println("sono uscito dal ciclo");
	}
	
	public void iteraFor(int contatore) {
		for(int i = 0; i < contatore; i++) {
			System.out.println(i);
		}
	}
	
	public void iteraFor(String[] arr) {
		if(arr != null) {
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			for (String string : arr) {
				System.out.println(string);
			}
		}
	}
	
	public void iteraFor(int[] arr) {
		if(arr != null) {
			for (int elementoiesimo : arr) {
				System.out.println(arr[elementoiesimo]);
			}
			
		}
	}
	
}
