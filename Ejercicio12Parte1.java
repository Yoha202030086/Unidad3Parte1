import java.util.Scanner;

public class Ejercicio12Parte1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        double v1,convers;
        System.out.println("Cantidad en grados celcius");
        v1=leer.nextInt();
        convers=(v1*1.8+32);
        System.out.println("Resultado en grados Farenheit:"+convers);
    }
}
