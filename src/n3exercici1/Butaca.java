package n3exercici1;

public class Butaca {

	private int fila;
	private int seient;
	private String persona;

	public Butaca(int fila, int seient, String persona) {
		super();
		this.fila = fila;
		this.seient = seient;
		this.persona = persona;
	}

	public int getFila() {
		return fila;
	}

	public int getSeient() {
		return seient;
	}

	public String getPersona() {
		return persona;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Butaca other = (Butaca) obj;
		return fila == other.fila && seient == other.seient;
	}

	@Override
	public String toString() {
		return "fila: " + fila + ", seient: " + seient + ", Persona:" + persona + ".";
	}

}
