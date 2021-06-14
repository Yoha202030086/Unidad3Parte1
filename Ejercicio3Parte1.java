import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ejercicio3Parte1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrasar un numero:");
        numero = sc.nextInt();
        System.out.println("Numero ingresado: " + numero);
        System.out.println("Doble de " + numero + " = " + 2 * numero);
        System.out.println("Triple de " + numero + " = " + 3 * numero);
    }
}