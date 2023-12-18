package ejOperaciones;

public class ejOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short resta1 = 10;
		short resta2 = 5;
		System.out.println("La operacion "+ resta1+ " menos "+ resta2+ " da como resultado "+ (resta1-resta2));

		short suma1 = 55;
		short suma2 = 45;
		System.out.println("La operacion "+ suma1+ " mas "+ suma2+ " da como resultado "+ (suma1+suma2));
		
		short numNegativo = -3;
		short numNegativo2 = 3;
		System.out.println("El numero en negativo es "+numNegativo+ " pero tambien se puede hacer con operacion matematica * -1, dando: "+ -1*(numNegativo2));
	
		short multi1 = 5;
		short multi2 = 5;
		System.out.println("La operacion "+ multi1+ " por "+ multi2+ " da como resultado "+ (multi1*multi2));
		
		short divi1 = 25;
		short divi2 = 7;
		System.out.println("La operacion "+ divi1+ " divido entre "+ divi2+ " da como resultado "+ (divi1/divi2));
	
		float divi3 = 25f;
		float divi4 = 7f;
		System.out.println("La operacion "+ divi3+ " divido entre "+ divi4+ " da como resultado "+ (divi3/divi4));
	
		float diviResto1 = 25;
		float diviResto2 = 4;
		System.out.println("La operacion "+ diviResto1+ " dividio "+ diviResto2+ " da como resultado como resto de "+ (diviResto1%diviResto2));
		
	}

}
