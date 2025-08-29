package cugdl.progra2.math;

public class TrigonometryExercise {
    public static void main(String[] args) {
        double angleInDegrees = 45.0;

        double angleInRadians = getRadians(angleInDegrees);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);

        System.out.println("El angulo en radianes es: " + angleInRadians);
        System.out.println("El seno es: " + sine);
        System.out.println("El coseno es: " + cosine);

    }

    private static double getRadians(double angleInDegrees) {
        return angleInDegrees * Math.PI / 180.0;
    }

}
