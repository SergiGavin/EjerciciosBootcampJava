package ejInterfaces;

public class Alumno implements IPersona {

	private String nombre;
	private String curso;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Alumno() {}
	public Alumno(String nombre, String curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + "]";
	}
	
	
	
}
