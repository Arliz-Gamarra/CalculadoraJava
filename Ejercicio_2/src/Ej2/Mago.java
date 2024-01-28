package Ej2;

public class Mago extends Personaje {
    private String magia;

    // Constructor
    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }

    // El método entrenar para Mago no hace nada
    @Override
    public void entrenar() {
        // Mago no entrena, no hay cambios
    }

    // Getter y setter específico para Mago
    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}