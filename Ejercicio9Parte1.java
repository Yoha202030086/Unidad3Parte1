/**
	Invertir una cadena en Java, método 1
*/
public class Ejercicio9Parte1  {

    public static void main(String[] args) {
		
        String cadena = "Hola";
		
		String invertida = "";
		
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);

	}
}

    
