import java.util.Scanner;

public class Ejercicio6Parte1 {
    public static void main(String[] args) {
        int numeroIngresado;
        float percentage;
        Scanner inputNumScanner = new Scanner(System.in);

        System.out.println("Ingresar numeros: ");
        int numeros = inputNumScanner.nextInt();

        System.out.println(" Vuelva a ingresar el numero: ");
        numeroIngresado = inputNumScanner.nextInt();

        percentage = (float) (numeroIngresado * 0.3);

        System.out.println("El porcentaje es = " + percentage + " %");

    }

}
