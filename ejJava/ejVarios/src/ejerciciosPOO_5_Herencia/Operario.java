package ejerciciosPOO_5_Herencia;

public class Operario extends Empleado {

	@Override
	public String toString() {
		return "Operario [getNombre()=" + getNombre() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
