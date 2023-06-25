package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	Scanner sc = new Scanner(System.in);

	// Mètodes a implantar capturant l’excepció de la classe InputMismatchException:

	public static byte llegirByte(String missatge) {
		Byte byteALLegir = null;
		// boolean entaradaCorrecta = false;
		// while(!entaradaCorrecta) {
		try {
			byteALLegir = Byte.parseByte(missatge);

		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		// }
		return byteALLegir;

	}

	public static int llegirInt(String missatge) {

		Integer intALLegir = null;

		try {
			intALLegir = Integer.parseInt(missatge);

		} catch (InputMismatchException e) {
			System.out.println(e);
		}

		return intALLegir;
	}

	public static float llegirFloat(String missatge) {
		Float floatALLegir = null;

		try {
			floatALLegir = Float.parseFloat(missatge);

		} catch (InputMismatchException e) {
			System.out.println(e);
		}

		return floatALLegir;
	}

	public static double llegirDouble(String missatge) {
		Double floatALLegir = null;

		try {
			floatALLegir = Double.parseDouble(missatge);

		} catch (InputMismatchException e) {
			System.out.println(e);
		}

		return floatALLegir;
	}

	// Mètodes a implantar capturant l’excepció de la classe Exception:

	public static char llegirChar(String missatge) {

		char charALLegir = 0;

		try {
			charALLegir = missatge.charAt(1);

		} catch (Exception e) {
			System.out.println(e);
		}

		return charALLegir;
	}

	public static String llegirString(String missatge) {
		String stringALLegir = null;

		try {
			stringALLegir = missatge.toString();

		} catch (Exception e) {
			System.out.println(e);
		}

		return stringALLegir;
	}

	public static boolean llegirSiNo(String missatge) {

		// si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”,
		// retorna “false”.
		Boolean booleanALLegir = null;

		try {
			if (missatge.toLowerCase() == "s") {
				
				booleanALLegir = true;
				
			} else if (missatge.toLowerCase() == "n") {
				
				booleanALLegir = false;

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return booleanALLegir;
	}

}
