public class Validacion {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 5;
    }

    public static void main(String[] args) {

        double n1 = 4.0;
        double n2 = 3.5;
        double n3 = 4.5;

        if (validarNota(n1) && validarNota(n2) && validarNota(n3)) {
            double promedio = calcularPromedio(n1, n2, n3);
            System.out.println("El promedio del estudiante es: " + promedio);
        } else {
            System.out.println("Error: Nota inválida");
        }
    }
}
