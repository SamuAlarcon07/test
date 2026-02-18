public class Aprobar {

    public class Notas {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static boolean aprobo(double promedio) {
        return promedio >= 3.0;
    }

    public static void main(String[] args) {
        double promedio = calcularPromedio(4.0, 3.5, 4.5);
        System.out.println("Promedio: " + promedio);

        if (aprobo(promedio)) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante reprobó.");
        }
    }
}
    
}
