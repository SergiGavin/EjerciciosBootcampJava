package ejerciciosPOO_1;

public class Coche {

	private String marca;
	private String color;
	private int puertas;
	private boolean eco;
	private int anyo;
	
	//Getters y Setters
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public boolean isEco() {
		return eco;
	}
	
	public void setEco(boolean eco) {
		this.eco = eco;
	}
	
	public int getAnyo() {
		return anyo;
	}
	
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	//Constructor vacio y con todos los atributos.
	public Coche() {}
	public Coche(String marca, String color, int puertas, boolean eco, int anyo) {
		super();
		this.marca = marca;
		this.color = color;
		this.puertas = puertas;
		this.eco = eco;
		this.anyo = anyo;
	}
	public void arrancar() {
		System.out.println("Arrancando!");
	}
	
	public void apagar() {
		System.out.println("Apagando!");
	}
	public void acelerar() {
		System.out.println("Aceleramos!");
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", puertas=" + puertas + ", eco=" + eco + ", anyo=" + anyo
				+ "]";
	}
	
	
	
	
}
