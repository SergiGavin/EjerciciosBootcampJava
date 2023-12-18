package ejPrintF;

import java.util.ArrayList;

public class EjPrintFTabla {

	public static void main(String[] args) {
		ArrayList<Alumno> alumnoslist = new ArrayList<Alumno>();
		// Añadiendo peliculas al arrayList
		alumnoslist.add(new Alumno("Sergi", "Gavin Serrano ","3 de Java", "2023"));
		alumnoslist.add(new Alumno("David", "Mouriz Orozco","1 de Java", "2023"));
		alumnoslist.add(new Alumno("Carlos", "Terrero NoseQue ","2 de Java", "2023"));

		System.out.printf("%20s%20s%20s%n", "Nombre ", "Apellidos", "Curso", "Año");
		System.out.println("\t-----------------------------------------------------------");
		for (Alumno alumno : alumnoslist) {
			System.out.printf("%20s%20s%20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.anyo);
		}
		System.out.println("                                                          ");
		System.out.printf("%-20s%-20s%-20s%n", "Nombre ", "Apellidos", "Curso", "Año");
		System.out.println("-----------------------------------------------------------");
		for (Alumno alumno : alumnoslist) {
			System.out.printf("%-20s%-20s%-20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.anyo);
		}
	}

	public static class Alumno {
		String nombre = "";
		String apellidos = "";
		String curso = "";
		String anyo = "";
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
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public String getAnyo() {
			return anyo;
		}
		public void setAnyo(String anyo) {
			this.anyo = anyo;
		}
		@Override
		public String toString() {
			return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", anyo=" + anyo
					+ "]";
		}
		
		public Alumno(String nombre, String apellidos, String curso, String anyo) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.curso = curso;
			this.anyo = anyo;
		}
		
	}

}
