import java.util.Scanner;

public class Ejercicio10Parte1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular el area y perimetro de un rectangulo");

        System.out.println("valor de base o largo del rectangulo");
        int base = sc.nextInt();

        System.out.println("valor de altura del rectangulo");
        int altura = sc.nextInt(); 

        int area = base * altura;
        int perimetro = base * 2 + altura * 2;

    System.out.println("El area del rectangulo es: "+area+ "\n" + "y su perimero es: "+perimetro);

    }
}
