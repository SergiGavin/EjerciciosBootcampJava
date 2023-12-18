package ejerciciosPOO_3_Herencia;

public class Programador extends Empleado {
	private int bonus;
	private String lenguajeP;
	private String backOrFront;
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String getLenguajeP() {
		return lenguajeP;
	}
	
	public void setLenguajeP(String lenguajeP) {
		this.lenguajeP = lenguajeP;
	}
	
	public String getBackOrFront() {
		return backOrFront;
	}
	
	public void setBackOrFront(String backOrFront) {
		this.backOrFront = backOrFront;
	}

	public Programador() {}
	
	public Programador(int bonus, String lenguajeP, String backOrFront) {
		super();
		this.bonus = bonus;
		this.lenguajeP = lenguajeP;
		this.backOrFront = backOrFront;
	}

	@Override
	//Se añade el super.toString para que muestre ademas del propio del programador los heredados.
	public String toString() {
		return super.toString() + "Programador [bonus=" + bonus + ", lenguajeP=" + lenguajeP + ", backOrFront=" + backOrFront + "]";
	}
	
	
	
}
