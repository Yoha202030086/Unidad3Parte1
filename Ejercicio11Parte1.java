
import java.util.Scanner;

public class Ejercicio11Parte1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
 
       int CM;
       int Y;
       int M;
       int P;
       int PULG;
       double RES;
       
        String numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar un numero: ");
        numero = entrada.nextLine();
        

                System.out.println( "Centimetros a yardas" );
                CM = leer.nextInt();
                RES = CM * 91.44;
                System.out.println( "El resultado es: "+RES+" yardas" );

                          System.out.println( "Centimetros a metros" );
                          CM = leer.nextInt();
                          RES = CM * 0.01;
                          System.out.println( "El resultado es: "+RES+" metros" );
                          
                          System.out.println( "Centimetros a pies" );
                          CM = leer.nextInt();
                          RES = CM * 30.48;
                          System.out.println( "El resultado es: "+RES+" pies" );

                          System.out.println( "Centimetros a pulgadas" );
                          CM = leer.nextInt();
                          RES = CM * 2.54;
                          System.out.println( "El resultado es: "+RES+" pulgadas" );    

                          System.out.println("");
            

    }
    
}
