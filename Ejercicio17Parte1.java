import java.util.Scanner;

public class Ejercicio17Parte1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float 11,12,13;

    System.out.println("Ingrese 1er primer lado: ");
     11=leer.nextFloat();
     System.out.println("Ingrese 2do lado: ");
     12=leer.nextFloat();
     System.out.println("Ingrese 3er lado: ");
     13=leer.nextFloat();
        
     /*Triangulo equilatero todos los lados iguales */
     if((11 == 12) && (12 == 13))
     System.out.println("\n EL TRIANGULO ES EQUILATERO");

     /*Triangulo isoceles dos lados iguales 1 diferente */
     if((11 == 12) && (12 != 13)) || (12 == 13) && (13 != 11) || (11 == 13) && (13 != 11);
     System.out.println("\n EL TRIANGULO ES ISOCELES");

     /*Triangulo escaleno ninguno de los lados iguales */
     if((11 != 12) && (12 != 13)) || (12 != 13) && (13 != 11) || (11 != 13) && (13 != 11);
     System.out.println("\n EL TRIANGULO ES ESCALENO");

    }
    
}
