package ejerciciosScanner_3Linea;


import java.util.Random;
import java.util.Scanner;

import com.mysql.cj.QueryReturnType;

public class Main {
	
	static int pjEmpieza;
	static int otroJugador;
	static boolean victoria = false;
	static int turnoGeneral = 0;
	static int jugador;
	static char[][] campo = new char[4][4]; 
	static int[][][] arrayPosicionXY = new int[5][5][3];
	static boolean posicionRepetida = false;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Decida una opcion:\n"
				+ "1. Humano contra humano\n"
				+ "2. Humano contra CPU\n"
				+ "3. CPU contra CPU\n"
				);
		int opcion = sc.nextInt();
		
		pjEmpieza= randomNum();
		if(pjEmpieza ==1) {
			otroJugador = 2;
		}else if(pjEmpieza==2) {
			otroJugador = 1;
		}
		
		switch (opcion) {
		case 1:
			campoDeJuego();
			imprimirCampo();
			jugar();
			break;
		case 2:
			campoDeJuego();
			imprimirCampo();
			jugarVSbot();
			break;
		case 3:
			campoDeJuego();
			imprimirCampo();
			botVSbot();
			break;

		default:
			break;
		}
	}
	
	public static  int randomNum() {
		Random random = new Random();
		pjEmpieza = random.nextInt(2)+1;
		System.out.println("El jugador que inicia es "+pjEmpieza);
		return pjEmpieza;
	}
	public static void movimiento2PJ() {
		System.out.println("Jugador "+otroJugador+" . Ingresa las coordenadas (x,y) para colocar la pieza.");
		System.out.println("Ingresa "+otroJugador+" la posicion X: ");
		int opcionX = sc.nextInt();
		System.out.println("Ingresa "+otroJugador+" la posicion Y: ");
		int opcionY = sc.nextInt();
		jugador = otroJugador;
		if(victoria==false && !posicionOcupada(opcionX, opcionY)) {
			turnoGeneral++;
			arrayPosicionXY[opcionX][opcionY][0] = opcionX+1;
		    arrayPosicionXY[opcionX][opcionY][1] = opcionY+1;
		    arrayPosicionXY[opcionX][opcionY][2] = otroJugador;
//			insertarPosicion(opcionX+1,opcionY+1, jugador);
			imprimirCampoConDatos();
		}else if(posicionOcupada(opcionX, opcionY)) {
			movimientoJugador(jugador);
			System.out.println("La posicion está ocupada o no es válida. Inténtalo de nuevo.");
		}  
		
		if (verificarVictoria(jugador)) {
	        System.out.println("¡Jugador " + jugador + " ha ganado!");
	        victoria = true;
	    }
		if(comprobarCampoLleno()) {
			System.out.println("Empate!");
			victoria = true;
		}
		
	}
	
	public static void movimiento1PJ() {
		
		System.out.println("Jugador "+pjEmpieza+" . Ingresa las coordenadas (x,y) para colocar la pieza.");
		System.out.println("Ingresa "+pjEmpieza+" la posicion X: ");
		int opcionX = sc.nextInt();
		System.out.println("Ingresa "+pjEmpieza+" la posicion Y: ");
		int opcionY = sc.nextInt();
		jugador = pjEmpieza;
		if(victoria==false && !posicionOcupada(opcionX, opcionY)) {
			turnoGeneral++;
			arrayPosicionXY[opcionX][opcionY][0] = opcionX+1;
		    arrayPosicionXY[opcionX][opcionY][1] = opcionY+1;
		    arrayPosicionXY[opcionX][opcionY][2] = pjEmpieza;
//			insertarPosicion(opcionX+1,opcionY+1, jugador);
			imprimirCampoConDatos();
		}else if(posicionOcupada(opcionX, opcionY)) {
			movimientoJugador(jugador);
			System.out.println("La posicion está ocupada o no es válida. Inténtalo de nuevo.");
		}
		
		if (verificarVictoria(jugador)) {
	        System.out.println("¡Jugador " + jugador + " ha ganado!");
	        victoria = true;
	    }
		if(comprobarCampoLleno()) {
			System.out.println("Empate!");
			victoria = true;
		}
	}
public static void movimientoJugador(int jugadorP) {
		posicionRepetida = false;
		System.out.println("Esa posicion esta ocupada por el otro jugador. Seleccione otra.");
		System.out.println("Ingresa "+jugadorP+" la posicion X: ");
		int opcionX = sc.nextInt();
		System.out.println("Ingresa "+jugadorP+" la posicion Y: ");
		int opcionY = sc.nextInt();
		jugador = jugadorP;
		if(victoria==false && !posicionOcupada(opcionX, opcionY)) {
			arrayPosicionXY[opcionX][opcionY][0] = opcionX+1;
		    arrayPosicionXY[opcionX][opcionY][1] = opcionY+1;
		    arrayPosicionXY[opcionX][opcionY][2] = jugador;
//			insertarPosicion(opcionX+1,opcionY+1, jugador);
			imprimirCampoConDatos();
		}else if(posicionOcupada(opcionX, opcionY)) {
			movimientoJugador(jugador);
			System.out.println("La posicion está ocupada o no es válida. Inténtalo de nuevo.");
		}
		if (verificarVictoria(jugador)) {
	        System.out.println("¡Jugador " + jugador + " ha ganado!");
	        victoria = true;
	    }
		if(comprobarCampoLleno()) {
			System.out.println("Empate!");
			victoria = true;
		}
	}

	
	public static void campoDeJuego() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                campo[i][j] = ' ';
            }
        }
    }
	public static void imprimirCampo() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                System.out.print("|" + campo[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }
	public static void insertarPosicion(int opcionX, int opcionY, int jugador) {
	    posicionRepetida = false;

	    for (int i = 0; i < turnoGeneral; i++) {
	        int x = arrayPosicionXY[i][opcionX][0];
	        int y = arrayPosicionXY[i][opcionY][1];

	        if (x == opcionX && y == opcionY) {
	            posicionRepetida = true;
	            movimientoJugador(jugador);
	            break;
	        }
	    }

	    if (posicionRepetida) {
	        System.out.println("Las coordenadas (" + opcionX + ", " + opcionY + ") ya existen en el array. No se puede insertar el número.");
	    }
	}
	public static boolean posicionOcupada(int x, int y) {
	    return arrayPosicionXY[x][y][2] != 0;
	}
	
	public static void imprimirCampoConDatos() {
	    System.out.print("  ");
	    for (int i = 0; i < campo.length; i++) {
	        System.out.print(" " + i + " ");
	    }
	    System.out.println();

	    for (int i = 0; i < campo.length; i++) {
	        System.out.print(i + " ");
	        for (int j = 0; j < campo[i].length; j++) {
	            int jugadorEnPosicion = arrayPosicionXY[i][j][2]; 

	            if (jugadorEnPosicion == 1) {
	                campo[i][j] = 'X'; 
	            } else if (jugadorEnPosicion == 2) {
	                campo[i][j] = 'O'; 
	            }
	            System.out.print("| " + campo[i][j]);
	        }
	        System.out.println("| ");
	    }
	    System.out.println();
	}

	public static void jugar() {
		while (!victoria) {
			movimiento1PJ();
		if(!victoria) { //Para en el caso que gane el 1 no salga el texto.
			movimiento2PJ();
			}
		}
	}
	public static void jugarVSbot(){
		while (!victoria) {
			movimiento1PJ();
		if(!victoria) { //Para en el caso que gane el 1 no salga el texto.
			movimientoBot(otroJugador);
			}
		}
	}
	public static void botVSbot(){
		while (!victoria) {
			movimientoBot(pjEmpieza);
		if(!victoria) { //Para en el caso que gane el 1 no salga el texto.
			movimientoBot(otroJugador);
			}
		}
	}
	public static boolean verificarVictoria(int jugador) {
	    // Verificar en horizontal
	    for (int i = 0; i < 4; i++) {
	        if (campo[i][0] == 'O' && campo[i][1] == 'O' && campo[i][2] == 'O') {
	            return true;
	        }else if (campo[i][1] == 'O' && campo[i][2] == 'O' && campo[i][3] == 'O') {
	        	return true;
			}else if(campo[i][0] == 'X' && campo[i][1] == 'X' && campo[i][2] == 'X') {
	        	return true;
	        }else if(campo[i][1] == 'X' && campo[i][2] == 'X' && campo[i][3] == 'X'){
	        	return true;
	        }
	    }
	    // Verificar en vertical
	    for (int j = 0; j < 4; j++) {
	        if (campo[0][j] == 'O' && campo[1][j] == 'O' && campo[2][j] == 'O') {
	            return true;
	        }else if (campo[1][j] == 'O' && campo[2][j] == 'O' && campo[3][j] == 'O') {
	        	return true;
	        }else if(campo[0][j] == 'X' && campo[1][j] == 'X' && campo[2][j] == 'X') {
	        	return true;
	        }else if(campo[1][j] == 'X' && campo[2][j] == 'X' && campo[3][j] == 'X') {
	        	return true;
	        }
	    }

	    // Verificar en diagonal (desde izquierda)
	    if (campo[0][0] == 'O' && campo[1][1] == 'O' && campo[2][2] == 'O') {
	        return true;
	    }else if(campo[1][1] == 'O' && campo[2][2] == 'O' && campo[3][3] == 'O') {
	    	return true;
	    }else if(campo[0][1] == 'O' && campo[1][2] == 'O' && campo[2][3] == 'O') {
	    	return true;
	    }else if(campo[1][0] == 'O' && campo[2][1] == 'O' && campo[3][2] == 'O') {
	    	return true;
	    }else if(campo[0][0] == 'X' && campo[1][1] == 'X' && campo[2][2] == 'X') {
	    	return true;
	    }else if(campo[1][1] == 'X' && campo[2][2] == 'X' && campo[3][3] == 'X') {
	    	return true;
	    }else if(campo[0][1] == 'X' && campo[1][2] == 'X' && campo[2][3] == 'X')
	    	
	    
	    // Verificar en diagonal (desde  derecha)
	    if (campo[0][2] == 'O' && campo[1][1] == 'O' && campo[2][0] == 'O') {
	        return true;
	    }else if(campo[0][3] == 'O' && campo[1][2] == 'O' && campo[2][1] == 'O') {
	    	 return true;
	    }else if(campo[1][2] == 'O' && campo[2][1] == 'O' && campo[3][0] == 'O') {
	    	 return true;
	    }else if(campo[1][3] == 'O' && campo[2][2] == 'O' && campo[3][1] == 'O') {
	    	return true;
	    }else if(campo[0][2] == 'X' && campo[1][1] == 'X' && campo[2][0] == 'X') {
	    	return true;
	    }else if(campo[0][3] == 'X' && campo[1][2] == 'X' && campo[2][1] == 'X') {
	    	return true;
	    }else if(campo[1][3] == 'X' && campo[2][2] == 'X' && campo[3][1] == 'X') {
	    	return true;
	    }
		return false;
	}

	    

public static void movimientoBot(int jugadorBot) {
		
		System.out.println("Turno del BOT!");
		int opcionX = eleccionBot();
		int opcionY = eleccionBot();
		System.out.println("Pulsa enter para ver el siguiente turno");
		sc.nextLine();
		System.out.println("El bot ha elegido la posicion ("+opcionX+","+opcionY+")");
		jugador = jugadorBot;
		if(victoria==false && !posicionOcupada(opcionX, opcionY)) {
			turnoGeneral++;
			arrayPosicionXY[opcionX][opcionY][0] = opcionX+1;
		    arrayPosicionXY[opcionX][opcionY][1] = opcionY+1;
		    arrayPosicionXY[opcionX][opcionY][2] = jugador;
			imprimirCampoConDatos();
		}else if(posicionOcupada(opcionX, opcionY)) {
			movimientoBotRepe(jugador);
		}
		
		if (verificarVictoria(jugador)) {
			if(jugador == 1) {
				System.out.println("El bot X ha ganado!");
			}else if(jugador == 2) {
				System.out.println("El bot O ha ganado!");
			}
	        
	        victoria = true;
	    }
	}
	public static int eleccionBot() {
		Random random = new Random();
        return random.nextInt(4);
	}
	public static void movimientoBotRepe(int jugadorP) {
		System.out.println("Turno del BOT!");
		int opcionX = eleccionBot();
		int opcionY = eleccionBot();
		System.out.println("El bot ha elegido la posicion ("+opcionX+","+opcionY+")");
		jugador = jugadorP;
		if(victoria==false && !posicionOcupada(opcionX, opcionY)) {
			arrayPosicionXY[opcionX][opcionY][0] = opcionX+1;
		    arrayPosicionXY[opcionX][opcionY][1] = opcionY+1;
		    arrayPosicionXY[opcionX][opcionY][2] = jugador;
//			insertarPosicion(opcionX+1,opcionY+1, jugador);
			imprimirCampoConDatos();
		}else if(posicionOcupada(opcionX, opcionY)) {
			movimientoBotRepe(jugador);
		}
		if (verificarVictoria(jugador)) {
			if(jugador == 1) {
				System.out.println("El bot X ha ganado!");
			}else if(jugador == 2) {
				System.out.println("El bot O ha ganado!");
			}
	        
	        victoria = true;
	    }
	}
	public static boolean comprobarCampoLleno() {
		 for (int i = 0; i < 4; i++) {
		        for (int j = 0; j < 4; j++) {
	        if (campo[i][j] != 'O' && campo[i][j] != 'X') {
	            return false;
	        }
	    }
	}
		 return true;
	   
	}
}
	
	
	
	
	

