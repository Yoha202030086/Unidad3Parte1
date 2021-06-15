import java.util.Scanner;
public class ej {
       public static void main( String args[] ){
       Scanner leer = new Scanner(System.in);
 
       int CM;
       int Y;
       int M;
       int P;
       int PULG;
       double RES;
 
       System.out.println( "Ingrese el numero" );
              
                          System.out.println( "Centimetros a yardas" );
                          Y = leer.nextInt();
                          RES = CM * 91.44;
                          System.out.println( "El resultado es: "+RES+" yardas" );

                          System.out.println( "Centimetros a metros" );
                          M = leer.nextInt();
                          RES = CM * 0.01;
                          System.out.println( "El resultado es: "+RES+" metros" );
                          
                          System.out.println( "Centimetros a pies" );
                          P = leer.nextInt();
                          RES = CM * 30.48;
                          System.out.println( "El resultado es: "+RES+" pies" );

                          System.out.println( "Centimetros a pulgadas" );
                          PULG = leer.nextInt();
                          RES = CM * 2.54;
                          System.out.println( "El resultado es: "+RES+" pulgadas" );    

                          System.out.println("");
                     
                  }
       
}
