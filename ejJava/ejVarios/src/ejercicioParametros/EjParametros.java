package ejercicioParametros;

import java.util.Scanner;

public class EjParametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del poeta: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca los apellidos del poeta: ");
		String apellidos = sc.nextLine();
		if(args[0].equals(nombre) && args[1].equals(apellidos)) {
			Lorca.poema();
		}else{
			NotAutorized.accesoDenegado();
		}
	}

}
