package ejConversiones;

public class EjConversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double variableDouble = 0.0;
		float variableFloat = (float) variableDouble;
		long variableLong = (long) variableFloat;
		int variableInt = (int) variableLong;
		short variableShort = (short) variableInt;
		byte variableByte = (byte) variableShort;

		byte valorByte= 0;
		short valorShort = valorByte;
		int valorInt = valorShort;
		long valorLong = valorInt;
		float valorFloat = valorLong;
		double valorDouble = valorFloat;
		
		byte byteEj3 = 100;
		//byteEj3 * 2; Esta operacion no es posible porque al realizar una operacion devuelve un int, no un byte.
		
		byte resultado = (byte)(byteEj3 * 2);
		System.out.println(resultado); // Esto dará -56 porque byte solo llega hasta 128.
		short resultado2 = (short) resultado;
		System.out.println(resultado2);
		
	}

}
