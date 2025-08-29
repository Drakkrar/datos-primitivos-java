package cugdl.progra2.math;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        double sideA = 3.0;
        double sideB = 4.0;

        System.out.println("La longitud de la hipotenusa es: " + pythagoras(sideA, sideB));
    }

    public static double pythagoras(double sideA, double sideB) {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }
}
