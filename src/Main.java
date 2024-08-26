//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada figura usando constructores
        rectangulo Rectangulo = new rectangulo(5, 10);
        triangulo Triangulo = new triangulo(4, 7);
        circulo Circulo = new circulo(3);

        // Mostrar el área de cada figura
        System.out.println("Área del rectángulo: " + Rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + Triangulo.calcularArea());
        System.out.println("Área del círculo: " + Circulo.calcularArea());

        // Cambiar valores usando setters
        Rectangulo.setBase(7);
        Rectangulo.setAltura(12);
        System.out.println("Nueva área del rectángulo: " + Rectangulo.calcularArea());
    }
}