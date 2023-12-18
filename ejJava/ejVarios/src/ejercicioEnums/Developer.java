package ejercicioEnums;

public class Developer {
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private String rolTecnico;
	
	
	
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getRolTecnico() {
		return rolTecnico;
	}

	public void setRolTecnico(String rolTecnico) {
		this.rolTecnico = rolTecnico;
	}

	public Developer() {};
	
	public Developer(String nombre, String apellidos, int edad, String dni, String rolTecnico) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.rolTecnico = rolTecnico;
	}
	@Override
	public String toString() {
		return "Developer [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni
				+ ", rolTecnico=" + rolTecnico + "]";
	}
	
	
	
}
