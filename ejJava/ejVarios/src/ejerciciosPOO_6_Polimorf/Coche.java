package ejerciciosPOO_6_Polimorf;

public class Coche {
	
	private  String compannia;
	private int velocidad;
	
	public void getSpeed()
	{
		System.out.println(compannia+ " la velocidad del coche es de "+velocidad+" km/h");
	}
	public String getCompannia() {
		return compannia;
	}
	
	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public Coche() {}
	
	public Coche(String compannia, int velocidad) {
		super();
		this.compannia = compannia;
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return "Coche [compannia=" + compannia + ", velocidad=" + velocidad + "]";
	}
	
	
}
