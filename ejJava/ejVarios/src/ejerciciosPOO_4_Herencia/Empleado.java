package ejerciciosPOO_4_Herencia;

import java.util.Random;

public class Empleado extends Persona {

	private String tipoContrato;
	private int sueldo;
	
	public void calcularSueldo() {
		Random random = new Random();
		double numRandom = random.nextInt(999);
		sueldo += numRandom;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public Empleado() {}

	public Empleado(String tipoContrato, int sueldo) {
		super();
		this.tipoContrato = tipoContrato;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString()+ "Empleado [tipoContrato=" + tipoContrato + ", sueldo=" + sueldo + "]";
	}
	
	
}
