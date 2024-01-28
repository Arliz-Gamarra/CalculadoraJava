package Ej2;

public class Torre extends Personaje {
    private int nivel;

    // Constructor
    public Torre(int salud, int nivel) {
        super(salud);
        this.nivel = nivel;
    }

    // Implementación del método entrenar para Torre
    @Override
    public void entrenar() {
        // Incrementa el nivel en 1 al entrenar
        this.nivel++;
    }

    // Getter y setter específico para Torre
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}