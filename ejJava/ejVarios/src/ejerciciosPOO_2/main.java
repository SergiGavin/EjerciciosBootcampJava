package ejerciciosPOO_2;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarjetaCredito creditCard = new TarjetaCredito();
		
//		//Para ver el saldo
//		creditCard.verSaldo();
//		//Para activar la tarjeta
//		creditCard.activar();
//		//Para realizar el pago
//		creditCard.pagar(0);
//		//Para anular la tarjeta
//		creditCard.anular();
		Scanner sc = new Scanner(System.in);
			
		boolean estadoBucle = true;
		while(estadoBucle) {
			System.out.println("Que accion quiere realizar?");
			System.out.println("1.Ver Salgo\n"
					+ "2.Realizar un pago \n"
					+ "3.Activar tarjeta \n"
					+ "4.Anular tarjeta \n"
					+ "0.Salir\n"
					+ "----------------------------");
		
			
			String eleccion = sc.nextLine();
	
			switch (eleccion) {
			case "1":
				creditCard.verSaldo();
				break;
			case "2":
				System.out.println("Inserte cantidad a pagar");
				double pago = sc.nextDouble();
				//Consumimos la linea para que el usuario pueda introducir otra opcion
				sc.nextLine();
				creditCard.pagar(pago);
				break;
			case "3":
				creditCard.activar();
				break;
			case "4":
				creditCard.anular();
				break;
			case "0":
				System.out.println("Ha salido del menu");
				estadoBucle = false;
				break;
			default:
				break;
			}
		}
	}

}
