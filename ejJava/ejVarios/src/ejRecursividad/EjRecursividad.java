package ejRecursividad;

import java.security.DomainCombiner;

import javax.lang.model.element.Element;

public class EjRecursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		int index = 0;
		//llamadaArray(index, tecnologies);
		//recorrerHastaHTML(tecnologies);
//		fibonnachi();
//		invertir();
		sumaRecursiva(5);
		
		
		
	}
	public static void llamadaArray(int index, String[] array) {
		if(index<array.length) {
			System.out.println(array[index]);
			llamadaArray(index+1, array);
		}
	}
	public static void recorrerHastaHTML(String[] array) {
		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
	}
	public static void fibonnachi () {
		int num1 = 1;
	    int num2 = 1;
	    String fibonacciSequence = "1 1";
		for (int i = 2; i < 10; i++) {
			int num3 = num1 + num2;
	        fibonacciSequence += " " + num3; // Agregamos el número actual a la cadena
	        num1 = num2;
	        num2 = num3;
		}
	    System.out.println("Secuencia de Fibonacci: " + fibonacciSequence);
	}
	public static void invertir() {
		String palabra = "supercalifragilisticoespialidoso";
		String palabraInversa="";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			char letra = palabra.charAt(i);
	        palabraInversa += letra;
		}
		System.out.println(palabraInversa);
	}
	public static void sumaRecursiva(int num) {
		num+=num;
		if(num>300){
			System.out.println("El numero ha superado el 300, la suma ha dado: "+num);
	        return;
		}
		sumaRecursiva(num);
		System.out.println(num);
	}

}
