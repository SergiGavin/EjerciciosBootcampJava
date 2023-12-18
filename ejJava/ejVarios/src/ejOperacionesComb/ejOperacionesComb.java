package ejOperacionesComb;

public class ejOperacionesComb {
	static int valor25 = 25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		valor25+=5;
		System.out.println(valor25);
		valor25 = asignarValorOrigen();
		valor25-=15;
		System.out.println(valor25);
		valor25 = asignarValorOrigen();
		valor25*=2;
		System.out.println(valor25);
		valor25 = asignarValorOrigen();
		valor25/=2;
		System.out.println(valor25);
		valor25 = asignarValorOrigen();
		valor25%=3;
		System.out.println(valor25);
	}
	public static int asignarValorOrigen () {
		valor25 = 25;
		return valor25;
	}
}
