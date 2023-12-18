package ejOperadoresBooleanoLogicos;

import java.nio.channels.NonWritableChannelException;
import java.util.Random;
import java.util.Scanner;

public class EjOperadoresBooleano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = false;
		System.out.println(bool1 = !bool2);
		System.out.println(bool2 = !bool3);
		
		
		//EJ2
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero para detectar si es par o impar");
		int number = sc.nextInt();
		if(number%2 == 0){
			System.out.println("Par");
		}else{
			System.out.println("Impar");
		}
		Random random = new Random();
		int numberRandom = random.nextInt(2);
		if(numberRandom == 0) {
			System.out.println("Blanco");
		}else {
			System.out.println("Negro");
		}
		System.out.println(numberRandom);
	}

}
