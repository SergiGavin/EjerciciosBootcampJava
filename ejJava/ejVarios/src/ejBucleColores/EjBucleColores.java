package ejBucleColores;

import java.util.Iterator;
import java.util.Random;

public class EjBucleColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		String reset = "\033[0m";
		String inicioTextColor = "\033[38;5;";
		String inicioBackground = "\033[48;5;";
		String inicioFormato = "\033[";
		String texto = "Esta es una linea arcoiris                             ";
		for (int recuento = 0; recuento < 10; recuento++) {
			int numRandomTexto = random.nextInt(256);
			String colorTexto = inicioTextColor+numRandomTexto+"m"+"colorTexto"+reset;
			int numRandomBackground = random.nextInt(256);
			String colorBackground = inicioBackground+numRandomBackground+"m"+"colorBackground"+reset;
			int numRandomFormato = random.nextInt(5);
			String formatoTexto = inicioFormato+numRandomFormato+"m"+"formatoTexto"+reset;
			String lineaArcoiris = inicioBackground+numRandomBackground+"m"+inicioTextColor+numRandomTexto+"m"+inicioFormato+numRandomFormato+"m"+texto+reset;	
			arcoiris(lineaArcoiris);
		}
	
		

        // Generar un número aleatorio en el rango de 0 a 255
        
	}
	public static void arcoiris(String texto) {
		System.out.println(texto);
	}

}
