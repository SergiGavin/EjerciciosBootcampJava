package ejEstructRepetitivas;

import java.util.Iterator;

public class EjEstructRepetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroRango = 100;
		//1.1.
		/*for (int i = 0; i < numeroRango; i++) {
			if(i%2==0 && i != 0) {
				System.out.println(i);
			}
		}*/
		//1.2
		/*for (int i = 0; i < numeroRango; i++) {
			if(i%3==0 && i != 0) {
				System.out.println(i);
			}
		}*/
		
		//1.3
		/*int numeroSaludos = 7;
		int interacciones = 0;
		boolean interruptor = true;
		do {
		System.out.println("Hola!");
		interacciones++;
		if(interacciones>numeroSaludos) {
			interruptor = false;
		}
		} while (interruptor);*/
		//1.4
		String abcedario = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
		String nuevoAbcedario= "";
		 for (int i = 0; i < 26; i++) {
			 char primerC = abcedario.charAt(0);
			 nuevoAbcedario += String.valueOf(primerC);
			 abcedario = abcedario.substring(1);
			 System.out.println(abcedario);
			 if(i==25) {
				 while(nuevoAbcedario.length() > 0) {
					 char primerC2 = nuevoAbcedario.charAt(nuevoAbcedario.length()-1);
					 abcedario += String.valueOf(primerC2);
					 nuevoAbcedario = nuevoAbcedario.substring(0,nuevoAbcedario.length()-1);
					 System.out.println(abcedario);
				 }
			 }
		}
	}

}
