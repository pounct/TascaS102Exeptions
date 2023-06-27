package n2exercici1;

import java.util.Scanner;

public class N2Exercici1 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		boolean programOn = true;
		while (programOn) {
			System.out.println();
			System.out.println("--------------------------MENU------------------------------------");
			System.out.println("Mètodes capturant l’excepció de la classe Input Mismatch Exception:");
			System.out.println("1- llegir Byte");
			System.out.println("2- llegir Int");
			System.out.println("3- llegir Float");
			System.out.println("4- llegir Double");

			System.out.println("Mètodes capturant l’excepció de la classe Exception:");
			System.out.println("5- llegir Char");
			System.out.println("6- llegir String");
			System.out.println("7- llegir SiNo");
			System.out.println("0- Sortir");

			Byte opcion = sc.nextByte();
			sc.nextLine();

			switch (opcion) {

			case 0: {
				programOn = false;
				System.out.println("0.- Fin de programa.");
				break;
			}
			case 1: {
				System.out.println("1- llegir Byte");
				try {
					String missatge = llegirMissatge();
					Entrada.llegirByte(missatge);

				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}

				break;
			}
			case 2: {
				System.out.println("2- llegir Int");
				try {
					String missatge = llegirMissatge();
					Entrada.llegirInt(missatge);

				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
			case 3: {
				System.out.println("3- llegir Float");
				try {
					String missatge = llegirMissatge();
					Entrada.llegirFloat(missatge);

				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
			case 4: {
				System.out.println("4- llegir Double");
				try {
					String missatge = llegirMissatge();
					Entrada.llegirDouble(missatge);

				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
			case 5: {
				System.out.println("5- llegir Char");
				String missatge = llegirMissatge();
				Entrada.llegirChar(missatge);
				break;
			}
			case 6: {
				System.out.println("6- llegir String");
				String missatge = llegirMissatge();
				Entrada.llegirString(missatge);
				break;
			}
			case 7: {
				System.out.println("7- llegir SiNo");
				try {
					String missatge = llegirMissatge();
					Entrada.llegirSiNo(missatge);

				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}

		}

		sc.close();
	}

	private static String llegirMissatge() {
		return sc.nextLine();
	}

}
