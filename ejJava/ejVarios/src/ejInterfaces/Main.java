package ejInterfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();

        profesor.setNombre("Paco");
        profesor.setSalario(20000);
        alumno.setNombre("Sergi");
        alumno.setCurso("Java bootcamp");
        // Usar los métodos para obtener y establecer el nombre
        System.out.println("Nombre del profesor: " + profesor.getNombre());
        System.out.println("Nombre del alumno: " + alumno.getNombre());


        // Usar toString para obtener una representación en cadena
        System.out.println(profesor.toString());
        System.out.println(alumno.toString());
	}

}
