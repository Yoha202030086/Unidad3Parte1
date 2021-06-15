import java.util.Scanner;

public class Ejercicio16Parte1 {

    public static void main(String[] args) {
      
        Scanner obj = new Scanner(System.in);
        
        int n1, n2, n3;

        System.out.println("Ingresar primer numero");
        n1 = obj.nextInt();
        System.out.println("Ingresar segundo numero");
        n2 = obj.nextInt();
        System.out.println("Ingresar tercer numero");
        n3 = obj.nextInt();

     if (n1 > n2 && n1 > n3){
      System.out.println("El numero mayor es: "+n1);

    } else if(n2 > n1 && n2 > n2){
        System.out.println("El numero mayor es: "+n2);
    }
}
}
