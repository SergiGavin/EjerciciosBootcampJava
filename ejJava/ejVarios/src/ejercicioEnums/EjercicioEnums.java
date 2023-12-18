package ejercicioEnums;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

import ejComentarios.ejComentarios;

public class EjercicioEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduzca nombre");
			String nombre = scanner.nextLine();
			System.out.println("Introduzca apellidos");
			String apellidos = scanner.nextLine();
			System.out.println("Introduzca edad");
			int edad = scanner.nextInt();
			System.out.println("Introduzca DNI");
			String DNI = scanner.nextLine();
			System.out.println("Introduzca si eres Front(FT), Back(B) o Full(FL)");
			String rol = scanner.nextLine();
			
			if(rol == "FT") {
				rol = Profesiones.FRONT_END_DEVELOPER.toString();
			}else if(rol == "B") {
				rol = Profesiones.BACK_END_DEVELOPER.toString();
			}else if(rol == "FL") {
				rol = Profesiones.FULL_STACK_DEVELOPER.toString();
			}
			
			Developer developer = new Developer(nombre,apellidos,edad,DNI, rol);
			
			if(developer.getRolTecnico() == Profesiones.BACK_END_DEVELOPER.toString() || developer.getRolTecnico() == Profesiones.FULL_STACK_DEVELOPER.toString()) {
				System.out.println("Viva el Back!");
			}else if(developer.getRolTecnico() != Profesiones.BACK_END_DEVELOPER.toString()) {
				System.out.println("JS es lo peor es mejor TypeScript");
			}
		}catch (InputMismatchException inputMismatchException) {
		    System.err.println("Error: La edad debe ser un número entero. Mensaje: "+inputMismatchException);
		}catch (Exception e) {
			System.err.println("Se ha producido un error. Mensaje: "+e);
		}
			
		
	}

}
