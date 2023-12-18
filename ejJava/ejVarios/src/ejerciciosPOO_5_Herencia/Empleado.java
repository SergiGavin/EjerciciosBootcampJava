package ejerciciosPOO_5_Herencia;

public class Empleado {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Empleado() {};
	
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
	
}
