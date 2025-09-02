package cugdl.progra2.math;

public class CircleMath {
    public static void main(String[] args) {
        double circleRadius = 10.5;

        System.out.println("El area del circulo es: " + getArea(circleRadius) );
        System.out.println("El perimetro del circulo es: " + getCircumference(circleRadius) );
    }

    private static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
