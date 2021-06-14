import java.util.Scanner;

public class Ejercicio4Parte1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrasar un numero:");
        numero = sc.nextInt();
        System.out.println("Numero ingresado: " + numero);
        System.out.println("cuadrado de " + numero + " = " + numero * numero);
        System.out.println("cubo de " + numero + " = " + numero * numero * numero);
    }
}
