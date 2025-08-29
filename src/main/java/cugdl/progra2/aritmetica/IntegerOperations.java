package cugdl.progra2.aritmetica;

public class IntegerOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;

        System.out.println("Suma: " + sum(a, b));
        System.out.println("Resta: " + substract(c, a));
        System.out.println("Producto: " + multiply(b, c));
        System.out.println("Cociente: " + divide(a, b));
        System.out.println("Resto: " + modulo(c, a));
    }

    public static int sum(int left_value, int right_value) {
        return left_value + right_value;
    }

    public static int substract(int left_value, int right_value) {
        return left_value - right_value;
    }

    public static int multiply(int left_value, int right_value) {
        return left_value * right_value;
    }

    public static int divide(int left_value, int right_value) {
        return left_value / right_value;
    }

    public static int modulo(int left_value, int right_value) {
        return left_value % right_value;
    }
}
