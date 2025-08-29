package cugdl.progra2.aritmetica;

public class FloatingPointOperations {
    public static void main(String[] args) {

        float radius = 10.5f;
        System.out.println("El area del circulo es: " + getCircleArea(radius));
    }

    public static float getCircleArea(float radius) {
        float pi = 3.14159f;
        return pi * radius * radius;
    }
}
