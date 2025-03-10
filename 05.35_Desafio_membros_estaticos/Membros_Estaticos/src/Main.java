//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(5.2);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(10.5);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);

    }
}