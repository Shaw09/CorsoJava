package it.corso.java.thread.sync;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Cliente c1 = new Cliente("Mario", 20);
		Cliente c2 = new Cliente("Lucia", 50);
		
		// Avvio i threads
		c1.start();
		c2.start();
		
		// Attendo il completamento
		c1.join();
		c2.join();
		
		/*************************/
		
		ClienteNonSync c3 = new ClienteNonSync("Paola", 20);
		ClienteNonSync c4 = new ClienteNonSync("Antonio", 50);
		
		// Avvio i threads
		c3.start();
		c4.start();
				
		// Attendo il completamento
		c3.join();
		c4.join();
	}

}
