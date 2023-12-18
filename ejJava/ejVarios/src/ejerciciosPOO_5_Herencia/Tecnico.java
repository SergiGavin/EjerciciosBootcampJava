package ejerciciosPOO_5_Herencia;

public class Tecnico extends Operario {

	@Override
	public String toString() {
		return "Tecnico [toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
}
