import java.util.Scanner;

public class Ejercicio14Parte1 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int a, b;

        System.out.println("Ingresar el numero mayor: ");
        a = leer.nextInt();
        System.out.println("Ingresar el numero menor; ");
        b = leer.nextInt();

        if (a%b == 0){
            System.out.println(b+ " Es divisible de " +a); 
        }
    else{
        System.out.println(b+ "No es divisible de" +a);
     }
    }
}
