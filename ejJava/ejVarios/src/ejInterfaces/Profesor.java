package ejInterfaces;

public class Profesor implements IPersona {

	private String nombre;
	private double salario;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Profesor() {}
	public Profesor(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
}
