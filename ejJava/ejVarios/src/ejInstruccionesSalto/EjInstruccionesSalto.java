package ejInstruccionesSalto;

import java.util.Iterator;

public class EjInstruccionesSalto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i < 10; i++) {
//			System.out.println("Hola");
//			if(i==3) {
//				break;
//			}
//		}
		String mensaje = "Iteracion";
		for (int i = 1; i < 10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(mensaje);
			System.out.println("Numero iteracion: "+i);
		}
		
	}

}
