package ejOperaciones2;

public class ejOperaciones2 {
	static short numero = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			short resultadoSuma= sumar(numero);
		System.out.println(resultadoSuma);
		short resultadoResta = restar(numero);
		System.out.println(resultadoResta);
	}
	public static short sumar(short importe1) {
		++importe1;
		return importe1;
	}
	public static short restar (short importe2) {
		--importe2;
		importe2-= 2;
		return importe2;
	}
	
}
