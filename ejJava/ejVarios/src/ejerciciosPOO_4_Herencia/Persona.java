package ejerciciosPOO_4_Herencia;

public class Persona {

	private String nombre;
	private String apellidos;
	private String documento;
	private String tipo;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Persona() {}
	
	public Persona(String nombre, String apellidos, String documento, String tipo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.documento = documento;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return  "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", documento=" + documento + ", tipo=" + tipo
				+ "]";
	}
	
	
}
