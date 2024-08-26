public class circulo extends figura {
    private double radio;

    // Constructor
    public circulo(double radio) {
        this.radio = radio;
    }

    // Getters
    public double getRadio() {
        return radio;
    }

    // Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

