package n2exercici1;

import java.util.InputMismatchException;


public class Entrada {

	// Mètodes a implantar capturant l’excepció de la classe InputMismatchException:

	public static byte llegirByte(String missatge) {
		Byte byteALLegir = null;
		// boolean entaradaCorrecta = false;
		// while(!entaradaCorrecta) {
		try {
			byteALLegir = Byte.parseByte(missatge);

		} catch (InputMismatchException e) {
			System.out.println("error to read Byte");
			System.out.println(e.getMessage());
		}
		
		// }
		return byteALLegir;

	}

	public static int llegirInt(String missatge) {

		Integer intALLegir = null;

		try {
			intALLegir = Integer.parseInt(missatge);

		} catch (InputMismatchException e) {
			System.out.println("error to read Int");
			System.out.println(e.getMessage());
		}

		return intALLegir;
	}

	public static float llegirFloat(String missatge) {
		Float floatALLegir = null;

		try {
			floatALLegir = Float.parseFloat(missatge);

		} catch (InputMismatchException e) {
			System.out.println("error to read Float");
			System.out.println(e.getMessage());
		}

		return floatALLegir;
	}

	public static double llegirDouble(String missatge) {
		Double floatALLegir = null;

		try {
			floatALLegir = Double.parseDouble(missatge);

		} catch (InputMismatchException e) {
			System.out.println("error to read Double");
			System.out.println(e.getMessage());
		}

		return floatALLegir;
	}

	// Mètodes a implantar capturant l’excepció de la classe Exception:

	public static char llegirChar(String missatge) {

		char charALLegir = 0;

		try {
			charALLegir = missatge.charAt(0);
			System.out.println("char : "+ charALLegir);

		} catch (Exception e) {
			System.out.println("error to read char");
			System.out.println(e.getMessage());
		}

		return charALLegir;
	}

	public static String llegirString(String missatge) {
		String stringALLegir = null;

		try {
			stringALLegir = missatge.toString();

		} catch (Exception e) {
			System.out.println("error to read String");
			System.out.println(e.getMessage());
		}

		return stringALLegir;
	}

	public static boolean llegirSiNo(String missatge) {

		// si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”,
		// retorna “false”.
		Boolean booleanALLegir = null;

		try {
			if (missatge.toLowerCase().equals("s") ) {

				booleanALLegir = true;
				System.out.println("SiNo : "+missatge.toLowerCase());

			} else if (missatge.toLowerCase().equals("n")) {

				booleanALLegir = false;
				System.out.println("SiNo : "+missatge.toLowerCase());

			} else if (booleanALLegir==null){
				throw new Exception("La entrada debe ser 's' o 'n'");
			}

		} catch (Exception e) {
			System.out.println("error to read Sino");
			System.out.println(e.getMessage());
		}

		return booleanALLegir;
	}

}
