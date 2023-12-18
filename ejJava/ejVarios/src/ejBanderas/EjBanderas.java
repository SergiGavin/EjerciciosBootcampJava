package ejBanderas;

import java.util.Iterator;

import org.w3c.dom.css.CSSUnknownRule;

public class EjBanderas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reset = "\033[0m";
		String inicio = "\033[";
		
		String fondoRojo = "\033[0;41mHola\033[0m";
		String espacioVacio = "                        ";
		
		//Bandera 1
		/*crearBandera(1,
				"4m"+espacioVacio, 
				"226m"+espacioVacio," ", 'H', 1,2);*/
		 //nombreBandera("Ucrania");
		//Bandera 2
		 //crearBandera(2,"27m"+espacioVacio, "15m"+espacioVacio, "27m"+espacioVacio, 'H', 2, 5);
		 //nombreBandera("Grecia");
		
		//Bandera 3
		//crearBandera(3,"21m"+espacioVacio, "15m"+espacioVacio, "1m"+espacioVacio, 'V', 2, 3);
		// nombreBandera("Francia");
		//Bandera 4
	crearBandera(4,"9m"+espacioVacio, "220m"+espacioVacio, "220m"+espacioVacio, 'H', 1, 4);
		 nombreBandera("España");
		//Bandera 5
//		crearBandera(5,"220m"+espacioVacio, "9m"+espacioVacio, "220m"+espacioVacio, 'H', 4, 5);
		//nombreBandera("Cataluña");
		//Bandera 6
		//crearBandera(6,"16m"+espacioVacio, "220m"+espacioVacio, "9m"+espacioVacio, 'H', 1, 3);
		//nombreBandera("Alemania");
		 
	}
	//color1, color2, color3,direccion, tamaño,  	//DARLE VUELTA QUITAR TAMANNO Y PONER OTRA COSA
	public static void crearBandera(int id ,String color1, String color2, String color3, char direccion, int tamanno, int cantidad) {
		String reset = "\033[0m";
		String inicio = "\033[48;5;";
		
		if(id==2) {
			cruzGrecia();
		}
		for (int i = 0; i < tamanno; i++) {
			if(cantidad == 3) {			
				if(direccion == 'V') {
					vertical(inicio, color1, reset, color2, color3);
				}else if(direccion == 'H') {
					horizontal(inicio, color1, reset, color2, color3);
				}
			}else if(cantidad ==2) {
				if(direccion == 'V') {
					vertical2(inicio, color1, reset, color2);
				}else if(direccion == 'H') {
					horizontal2(inicio, color1, reset, color2);
				}
			}else if(cantidad == 5) {
				if(direccion == 'H') {
					horizontalDelgadas(inicio, color1, reset, color2);
				}
			}else if (cantidad == 4) {
					horizontal1_2(inicio, color1, reset, color2);
				}
			
		}
		
	}
	public static void nombreBandera(String nombre) {
		String inicioLetraString = "\033[1;4m";
		String reset = "\033[0m";
		System.out.println(inicioLetraString+nombre+reset);
	}
	public static void vertical(String inicio, String color1, String reset, String color2, String color3) {
		System.out.println(inicio+color1+reset+inicio+color2+reset+inicio+color3+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset+inicio+color3+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset+inicio+color3+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset+inicio+color3+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset+inicio+color3+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset+inicio+color3+reset);
	}
	public static void vertical2(String inicio, String color1, String reset, String color2) {
		System.out.println(inicio+color1+reset+inicio+color2+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset);
		System.out.println(inicio+color1+reset+inicio+color2+reset);
	}
	
	
	public static void horizontal(String inicio, String color1, String reset, String color2, String color3) {
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color3+reset);
		System.out.println(inicio+color3+reset);
		System.out.println(inicio+color3+reset);
	}
	public static void horizontal2(String inicio, String color1, String reset, String color2) {
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color2+reset);
	}
	public static void horizontalDelgadas(String inicio, String color1, String reset, String color2) {
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color2+reset);
	}
	public static void horizontal1_2(String inicio, String color1, String reset, String color2) {
		System.out.println(inicio+color1+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color2+reset);
		System.out.println(inicio+color1+reset);
	}
	public static void cruzGrecia() {
	    String inicio = "\033[48;5;";
	    String azul = "27m"; // Azul
	    String blanco = "231m"; // Blanco
	    String reset = "\033[0m";
	    String espacio = "  "; // Espacio en blanco para alinear
	    String lineaAzul = inicio + azul + espacio + reset; // Línea azul con espacios en blanco
	    String lineaBlanco = inicio + blanco + espacio + reset; // Línea blanca con espacios en blanco
	    String lineaBlanco2 = lineaBlanco+lineaBlanco+lineaBlanco;
	    String lineaAzul2 = lineaAzul+lineaAzul+lineaAzul;
	    // Imprimir la cruz de Grecia
	    System.out.println(lineaAzul + lineaBlanco + lineaAzul+lineaBlanco2+lineaBlanco2+lineaBlanco2);
	    System.out.println(lineaBlanco + lineaBlanco + lineaBlanco+lineaAzul2+lineaAzul2+lineaAzul2);
	    System.out.println(lineaAzul + lineaBlanco + lineaAzul+lineaBlanco2+lineaBlanco2+lineaBlanco2);
	}
	


}
