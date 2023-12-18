package ejerciciosPOO_5_Herencia;

public class Directivo extends Empleado{

	@Override
	public String toString() {
		return "Directivo [getNombre()=" + getNombre() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
}
