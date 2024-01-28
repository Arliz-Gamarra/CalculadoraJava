package Ej2;

public class Espadachin extends Personaje {
	 private int ataque;

	    // Constructor
	    public Espadachin(int salud, int ataque) {
	        super(salud);
	        this.ataque = ataque;
	    }

	    // Implementación del método entrenar para Espadachin
	    @Override
	    public void entrenar() {
	        // Incrementa el ataque en 10 al entrenar
	        this.ataque += 10;
	    }

	    // Getter y setter específico para Espadachin
	    public int getAtaque() {
	        return ataque;
	    }

	    public void setAtaque(int ataque) {
	        this.ataque = ataque;
	    }
}
