package n3exercici1;

import java.util.Scanner;

public class Cine {

	Scanner sc = new Scanner(System.in);

	private int files = 0;
	private int seientsPerFila = 0;
	private GestioButaques gestioButaques;

	public Cine() {
		super();
		gestioButaques = new GestioButaques();
	}

	public int getFiles() {
		return files;
	}

	public void setFiles(int files) {
		this.files = files;
	}

	public int getSeientsPerFila() {
		return seientsPerFila;
	}

	public void setSeientsPerFila(int seientsPerFila) {
		this.seientsPerFila = seientsPerFila;
	}

	public GestioButaques getGestioButaques() {
		return gestioButaques;
	}

	public void initiar() {

		System.out.println("Quantes files té la sala de cinema : ");
		this.files = sc.nextInt();

		System.out.println("Quants seients per fila té la sala de cinema :");
		this.seientsPerFila = sc.nextInt();
		sc.nextLine();

	}

}
