package it.corso.java.interruzione;

public class BreakContinue {
	
	public void esempioBreak(int interruttore, int estremo) {
		
		for (int i = 0; i < estremo; i++) {
			if (i == interruttore) {
				System.out.println("i == interruttore!!!");
				break;
			}
		}
		System.out.println("ciclo esempioBreak");
	}
	
	public void esempioContinue(int interruttore, int estremo) {
		
		for (int i = 0; i < estremo; i++) {
			if (i == interruttore) {
				System.out.println("i == interruttore!!!");
				continue;
			}
		}
		System.out.println("ciclo esempioBreak");
	}
	
	public void esempioContinue2(int interruttore, int estremo) {
		
//		for (int i = 0; i < estremo; i++) {
//			if (i % 2 == 0) {
//				System.out.println("i=" + i);
//				continue;
//			}
//			
//			System.out.println("ciclo esempioBreak i = " + i);
//			
//		}
		
		/* loop */
		
		int i = 0;
		while(i < estremo) {
			if(i % 2 == 0) {
				System.out.println("i=" + i);
				continue;
			}
			
			System.out.println("ciclo esempioBreak i = " + i);
		}
	}
}
