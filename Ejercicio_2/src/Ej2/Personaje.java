package Ej2;

public abstract class Personaje {
	  private int salud;

	    // Constructor
	    public Personaje(int salud) {
	        this.salud = salud;
	    }

	    // Método abstracto entrenar
	    public abstract void entrenar();

	    // Getter y setter
	    public int getSalud() {
	        return salud;
	    }

	    public void setSalud(int salud) {
	        this.salud = salud;
	    }
}
