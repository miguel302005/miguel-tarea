public class rectangulo extends figura {
    private double base;
    private double altura;

    // Constructor
    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
