package ejerciciosScanner_trycatch;

import java.security.DrbgParameters.NextBytes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		try {
						
			Scanner sc = new Scanner(System.in);
//			System.out.println("Operacion matematica (division):");
//			System.out.println("Introduzca el primer valor");
//			int valor1 = sc.nextInt();
//			System.out.println("Introduzca el segundo valor");
//			int valor2= sc.nextInt();
//			System.out.println("El resultado de la division es: "+valor1/valor2);
//			System.out.println("Introduce un valor booleano");
//			boolean valorBoolean = sc.nextBoolean();
//			System.out.println("Introduce un valor String");
//			String valorString = sc.next();
			System.out.println("Introduce un valor double: ");
			Double valorDouble = 0.0;
			String valorDoubleString = sc.next();
			if(valorDoubleString.contains(",")) {
				Scanner doubleComaScanner = new Scanner(valorDoubleString);
				doubleComaScanner.useLocale(Locale.ITALIAN);
				valorDouble = doubleComaScanner.nextDouble();
			}else if(valorDoubleString.contains(".")){
				Scanner doublePuntoScanner = new Scanner(valorDoubleString);
				doublePuntoScanner.useLocale(Locale.ENGLISH);
				valorDouble = doublePuntoScanner.nextDouble();
			}
			System.out.println("Introduce un valor int");
			int valorInt = sc.nextInt();
//			System.out.println("Valores introducidos:\n"
//					+ "Booleano: "+valorBoolean+"\n"
//					+ "String: "+valorString+"\n"
//					+ "Double: "+valorDouble+"\n"
//					+ "Int: "+valorInt+"\n");
		} catch(ArithmeticException arithmeticException) {
			System.err.println("El valor no puede ser divido entre 0.\n "
					+ "La excepcion es: "+arithmeticException);
		} catch (InputMismatchException inputMismatchException) {
			System.err.println("El valor introducido no es el que se ha pedido. Revise nuevamente el dato introducido.\n "
					+ "La excepcion es: "+inputMismatchException);
		}catch (Exception e) {
			System.err.println("Se ha producido un error. Mensaje del error: "+e);
		}
			
		}
	}

