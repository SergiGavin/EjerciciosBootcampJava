package ejerciciosPOO_5_Herencia;

public class Oficial extends Operario{

	@Override
	public String toString() {
		return "Oficial [toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
