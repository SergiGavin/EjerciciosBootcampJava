package ejEstructuraCondicionales;

import java.util.Random;

public class EjEstructuraCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean estado = false;
		Random random = new Random();
		int numberRandom = random.nextInt(2);
		// 1.1
		if(numberRandom == 0) {
			estado = true;
			System.out.println("Rojo");
		}if(numberRandom == 1) {
			estado = false;
			System.out.println("Negro");
		}*/
		// 1.2
			/*	if(numberRandom == 0) {
					estado = true;
					System.out.println("Rojo");
				}else if(numberRandom == 1) {
					estado = false;
					System.out.println("Negro");
				}
			}*/
		// 1.3
				//System.out.println(numberRandom==0?"Rojo":numberRandom==1?"Negro":"Valor no esperado");
			
		//Ej2
		double temperatura = 22.5;
		//2.1
		/*
		if(temperatura<10) {
			System.out.println("Climas frios");
			if(temperatura<5) {
				System.out.println("Polar");
			}
			if(temperatura>=5 && temperatura<10) {
				System.out.println("Alta montaña");				
			}
		}if(temperatura>=10 && temperatura<20) {
			System.out.println("Cristales templados");
			if(temperatura >= 10 && temperatura < 13.5) {
				System.out.println("Oceanico");
			}
			if(temperatura >= 13.5 && temperatura < 16.5) {
				System.out.println("Mediterraneo");
			}
			if(temperatura >= 16.5 && temperatura < 20) {
				System.out.println("Continental");
			}
			
		}if(temperatura>=20) {
			System.out.println("Climas calidos");
			if(temperatura >= 20 && temperatura < 23.5) {
				System.out.println("Ecuatorial");
			}
			if(temperatura >=23.5 && temperatura < 26.5) {
				System.out.println("Tropical");
			}
			if(temperatura >= 26.5) {
				System.out.println("Desertico");
			}
		}*/
		//2.2
		/*
		if(temperatura<10) {
			System.out.println("Climas frios");
			if(temperatura<5) {
				System.out.println("Polar");
			}else if(temperatura>=5 && temperatura<10) {
				System.out.println("Alta montaña");				
			}
		}else if(temperatura>=10 && temperatura<20) {
			System.out.println("Cristales templados");
			if(temperatura >= 10 && temperatura < 13.5) {
				System.out.println("Oceanico");
			}else if(temperatura >= 13.5 && temperatura < 16.5) {
				System.out.println("Mediterraneo");
			}else{
				System.out.println("Continental");
			}
			
		}if(temperatura>=20) {
			System.out.println("Climas calidos");
			if(temperatura >= 20 && temperatura < 23.5) {
				System.out.println("Ecuatorial");
			}else if(temperatura >=23.5 && temperatura < 26.5) {
				System.out.println("Tropical");
			}else{
				System.out.println("Desertico");
			}
		}	*/
		//2.3
		/*
		int numero = 9;
		switch (numero) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Cuatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Siete");
			break;
		case 8:
			System.out.println("Ocho");
			break;
		case 9:
			System.out.println("Nueve");
			break;
		default:
			break;
		}
		int number = 55;
		System.out.println(number>0?"¡Es positivo!":number<0?"¡Es negativo!":"¡Es cero, na de na!");
		*/
		int altura = 13;
		String asterisco = "";
		String espacio = "";
		String colorVerde="\033[48;5;22m";
		String colorMarron="\033[48;5;16m";
		String reset = "\033[0m";
		for (int i = 0; i < altura; i++) {
			asterisco += "**";
			int espaciosNecesarios = altura -i -1;
			espacio = " ".repeat(espaciosNecesarios);			
			if(i == altura - 1 || i == altura -2) {
				asterisco="****";
				System.out.println("           " +colorMarron+asterisco+reset+"           ");
			}else {
				System.out.println(espacio+ colorVerde+asterisco+reset+espacio);
			}
		}
	}

}
