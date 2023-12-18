package ejerciciosScanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor booleano");
		boolean valorBoolean = sc.nextBoolean();
		System.out.println("Introduce un valor String");
		String valorString = sc.next();
		System.out.println("Introduce un valor double (utilizar coma)");
		Double valorDouble = sc.nextDouble();
		System.out.println("Introduce un valor int");
		int valorInt = sc.nextInt();
		System.out.println("Valores introducidos:\n"
				+ "Booleano: "+valorBoolean+"\n"
				+ "String: "+valorString+"\n"
				+ "Double: "+valorDouble+"\n"
				+ "Int: "+valorInt+"\n");
	}

}
