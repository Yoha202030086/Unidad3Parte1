import java.util.Scanner;

public class Ejercicio15Parte1 {
    
    public static void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        num = n.nextInt();

        if(num<0) {
            System.out.println("El numero es negativo");
            
            }
else {
    System.out.println("El numero es positivo");

        }

    }
}
