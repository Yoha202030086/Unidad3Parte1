
import java.util.Scanner;

public class Ejercicio1Parte1 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

       int num1, num2;
       System.out.print("Ingrese el primer numero: ");
       num1 = entrada.nextInt();

       System.out.println("Ingrese el segundo numero: ");
       num2 = entrada.nextInt();

       System.out.println("La suma de los dos numeros es: " + (num1 + num2));
    }
}
