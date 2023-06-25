package n1exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class N1Execici1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean programaOn = true;
		while (programaOn) {
			System.out.println("1.- VendaBuidaException. (Lista Productes Buida)");
			System.out.println("2.- Lista no buida.");
			System.out.println("0.- Salir del programa.");
			Byte opcion = sc.nextByte();

			switch (opcion) {

			case 0: {
				programaOn = false;
				System.out.println("0.- Fin de programa.");
				break;
			}
			case 1: {
				Venda venda = new Venda();
				CalcularPreuTotal(venda);
				break;
			}
			case 2: {
				ArrayList<Producte> productes = new ArrayList<Producte>();
				productes.add(new Producte("prod 1", 120));
				productes.add(new Producte("prod 1", 120));

				Venda venda = new Venda(productes);
				CalcularPreuTotal(venda);

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}
		sc.close();
	}

	public static void CalcularPreuTotal(Venda venda) {

		double resultado = venda.getPreuTotal();
		if (resultado > 0) {

			System.out.println(resultado);

		}

	}

}
