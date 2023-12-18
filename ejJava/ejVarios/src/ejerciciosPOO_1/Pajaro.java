package ejerciciosPOO_1;

public class Pajaro {

	
	private String raza;
	private String color;
	private int edad;
	private String tono;
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getTono() {
		return tono;
	}
	
	public void setTono(String tono) {
		this.tono = tono;
	}
	
	public Pajaro() {}
	
	public Pajaro(String raza, String color, int edad, String tono) {
		super();
		this.raza = raza;
		this.color = color;
		this.edad = edad;
		this.tono = tono;
	}

	@Override
	public String toString() {
		return "Pajaro [raza=" + raza + ", color=" + color + ", edad=" + edad + ", tono=" + tono + "]";
	}
	public void volar() {
		System.out.println("Vuela alto pequeño");
	}
	public void comer() {
		System.out.println("Ñam Ñam");
	}
	public void cantar() {
		System.out.println("Pio Pio!");
	}
	
	
	
	
	
}
