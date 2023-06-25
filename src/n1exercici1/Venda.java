package n1exercici1;

import java.util.ArrayList;

public class Venda {

	private ArrayList<Producte> productes = new ArrayList<Producte>();
	private double preuTotal = 0;
	
	
	

	public Venda() {
		super();
	}
	

	public Venda(ArrayList<Producte> productes) {
		super();
		this.productes = productes;
	}


	public double calcularTotal() throws VendaBuidaException {
		if (productes.isEmpty())
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
		else {
			preuTotal = 0;
			for (Producte prod : productes) {
				preuTotal += prod.getPreu();
			}
		}

		return preuTotal;
	}

	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public void addProducte(Producte producte) {
		this.productes.add(producte);
	}

	public double getPreuTotal() {
		try {
			preuTotal= this.calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return preuTotal;
	}


	
	
	

}
