

import java.util.Scanner;

public class Ejercicio8Parte1 {

  public static void main(String[] args) {
      //Scanner
      Scanner leer = new Scanner(System.in);
      System.out.println("Promedio");

      System.out.println("Ingresar primer numero");
      int numero1 = leer.nextInt();

      System.out.println("Ingresar segundo numero");
      int numero2 = leer.nextInt();

      System.out.println("Ingresar tercer numero");
      int numero3 = leer.nextInt();

      double promedio = (numero1 + numero2 + numero3)/3.0;

      System.out.println("Promedio Final: "+promedio);
  }
}
