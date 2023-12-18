package ejerciciosPOO_6_Polimorf;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche = new Coche();
		coche.setCompannia("Honda");
		coche.setVelocidad(100);
		
		coche.getSpeed();
		
		coche.setCompannia("Jeep");
		coche.setVelocidad(500);
		
		coche.getSpeed();
		
		coche.setCompannia("BMW");
		coche.setVelocidad(800);
		
		coche.getSpeed();
		
	}

}
