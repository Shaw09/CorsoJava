package it.corso.java.annotation;

public class Telefono extends Prodotto {

	@Override
	@Deprecated
	public double calcolaIva(double ivaperc) {
		return super.calcolaIva(ivaperc);
	}

	
	
}
