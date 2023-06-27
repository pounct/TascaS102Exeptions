package n3exercici1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class N3Exercici1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ExcepcioButacaLliure, ExcepcioButacaOcupada {
		Cine cine = new Cine();
		cine.initiar();
		menu(cine);

	}

	public static void menu(Cine cine) throws ExcepcioButacaLliure, ExcepcioButacaOcupada {

		boolean programaOn = true;
		while (programaOn) {
			System.out.println();
			System.out.println();
			System.out.println("1.- Mostrar totes les butaques reservades.");
			System.out.println("2.- Mostrar les butaques reservades per una persona.");
			System.out.println("3.- Reservar una butaca.");
			System.out.println("4.- Anul·lar la reserva d’una butaca.");
			System.out.println("5.- Anul·lar totes les reserves d’una persona.");
			System.out.println("0.- Sortir.");

			Byte opcion = sc.nextByte();

			switch (opcion) {

			case 0: {
				programaOn = false;
				System.out.println("0.- Fin de programa.");
				
				break;
			}
			case 1: {
				System.out.println("1.- Les butaques reservades.");
				butaquesReservades(cine);
				
				break;
			}
			case 2: {
				System.out.println("2.- Mostrar les butaques reservades per una persona.");
				butaquesReservadesPerUnaPersona(cine);
				
				break;
			}
			case 3: {
				System.out.println("3.- Reservar una butaca.");
				reservarButaca(cine);
				
				break;
			}
			case 4: {
				System.out.println("4.- Anul·lar la reserva d’una butaca.");
				anullarReservaButaca(cine);
				
				break;
			}
			case 5: {
				System.out.println("5.- Anul·lar totes les reserves d’una persona.");
				anullarTotesReservesPersona(cine);
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}
		//sc.close();

	}

	private static void butaquesReservades(Cine cine) {
		ArrayList<Butaca> butaques = cine.getGestioButaques().getButaques();
		if (butaques.size() > 0) {
			for (Butaca butaca : butaques) {
				System.out.println(butaca);
			}
		} else {
			System.out.println("No Butaques Reservades");
		}

	}

	private static void anullarTotesReservesPersona(Cine cine) {
		System.out.println("entrar una persona: ");
		sc.nextLine();
		String persona = sc.nextLine();
		//ArrayList<Butaca> butaques = cine.getGestioButaques().getButaques();
		boolean personaEncontrada = false;
		
		ListIterator<Butaca> listIterator = cine.getGestioButaques().getButaques().listIterator();
		while (listIterator.hasNext()) {
			
			if (listIterator.next().getPersona().equalsIgnoreCase(persona)) {
				listIterator.remove();
				personaEncontrada = true;
			}

		}
		
		if (personaEncontrada) {
			System.out.println("totes les reserves de " + persona + " anuladas");
		} else {
			System.out.println(persona + " no esta en la aplicacion");
		}

	}

	private static void anullarReservaButaca(Cine cine) throws ExcepcioButacaLliure {

		System.out.println("Dades Butaca. ");
		System.out.println("entrar fila: ");
		int fila = sc.nextInt();
		System.out.println("entrar seient: ");
		int seient = sc.nextInt();
		try {
			cine.getGestioButaques().eliminarButaca(fila, seient);
			System.out.println("Anulacion de Reserva hecha");
		} catch (ExcepcioButacaLliure e) {
			System.out.println(e.getMessage());
		}

		
	}

	private static void reservarButaca(Cine cine) throws ExcepcioButacaOcupada {
		System.out.println("- Dades Butaca. ");
		System.out.println("entrar fila: ");
		int fila = sc.nextInt();
		System.out.println("entrar seient: ");
		int seient = sc.nextInt();
		sc.nextLine();
		System.out.println("entrar persona: ");
		String persona = sc.nextLine();
		try {
			cine.getGestioButaques().afegirButaca(new Butaca(fila, seient, persona));
			System.out.println("Reserva hecha");
		} catch (ExcepcioButacaOcupada e) {
			System.out.println(e.getMessage());
		}
		

		
	}

	private static void butaquesReservadesPerUnaPersona(Cine cine) {
		System.out.println("entrar una persona: ");
		sc.nextLine();
		String persona = sc.nextLine();
		ArrayList<Butaca> butaques = new ArrayList<Butaca>();

		for (Butaca buteca : cine.getGestioButaques().getButaques()) {
			if (buteca.getPersona().equals(persona)) {
				butaques.add(buteca);
			}

		}
		if (butaques.size() > 0) {
			System.out.println("Butaques Reservades per " + persona);
			for (Butaca butaca : butaques) {
				System.out.println(butaca);
			}
		} else {
			System.out.println("No Reserves per " + persona);
		}
	}

}
