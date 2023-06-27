package n3exercici1;

import java.util.ArrayList;

public class GestioButaques {
	

	private static ArrayList<Butaca> butaques;

	public GestioButaques() {
		super();
		butaques = new ArrayList<Butaca>();
	}

	public ArrayList<Butaca> getButaques() {
		return butaques;
	}

	public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
		int butacaIndex = cercarButaca(butaca.getFila(), butaca.getSeient());
		if (butacaIndex != -1) {
			throw new ExcepcioButacaOcupada("Butaca Ocupada ententar con otra reservacio");
		} else {
			butaques.add(butaca);
		}

	}

	public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure {

		int butacaIndex = cercarButaca(fila, seient);
		if (butacaIndex == -1) {
			throw new ExcepcioButacaLliure("Butaca Lliure");
		} else {
			butaques.remove(butacaIndex);
		}

	}

	// cercarButaca
	public int cercarButaca(int fila, int seient) {
		int butacaIndex = -1;
		boolean butecaEncontrada = false;
		int ind = 0;
		while (!butecaEncontrada && ind < butaques.size()) {
			Butaca butaca = butaques.get(ind);
			if (butaca.getFila() == fila && butaca.getSeient() == seient) {
				butacaIndex = ind;
				butecaEncontrada = true;
			}
			ind++;

		}
		return butacaIndex;

	}

}
