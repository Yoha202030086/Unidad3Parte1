import java.util.Scanner;

public class Ejercicio13Parte1 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double r,h,vol;

        System.out.println("Programa para calcular el volumen del cilindro");
        System.out.println("");

        System.out.println("Ingresa el radio del cilindro: ");
        r = entrada.nextDouble();

        System.out.println("Ingresar la altura del cilindro: ");
        h = entrada.nextDouble();

        vol = (3.1416)*(r*r)*(h);
        
        System.out.println("El volumen del cilindro es: "+vol+"");


    }
    
}
