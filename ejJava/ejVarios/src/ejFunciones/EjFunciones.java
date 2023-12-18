package ejFunciones;

import java.security.PublicKey;

public class EjFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String textoJava = "java";
		String textoNull = "null";
		javaOrNull(textoJava);
		javaOrNull(textoNull);
		
		String usuarioString = "admin";
		String passwordString = "1234";
		Login(usuarioString, passwordString);
		
		int numero = 3;
		parOImpar(numero);
		
	}
	public static String javaOrNull(String texto) {
		if(texto == "java") {
			System.out.println("java");
		}else if (texto == "null") {
			System.out.println("null");
		}
		return texto;
	}
	public static String Login(String usuario, String password) {
		if(usuario == "admin" && password == "1234") {
			System.out.println("Login true");
		}else {
			System.out.println("Login false");
		}
		return usuario;
	}
	public static int parOImpar(int numero) {
		
		if(numero%2 == 0) {
			System.out.println("Este numero es par");
		}else if (numero%2 !=0) {
			System.out.println("Este numero es impar");
		}
		return numero;
		
	}
}
