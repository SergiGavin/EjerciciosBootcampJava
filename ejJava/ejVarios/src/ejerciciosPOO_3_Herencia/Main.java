package ejerciciosPOO_3_Herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado = new Empleado();
		Programador programador = new Programador();
		
		programador.setNombre("Sergi");
		programador.setApellidos("Gavin Serrano");
		programador.setDni("47418638K");
		programador.setEdad(25);
		programador.setGenero("Hombre");
		programador.setBackOrFront("Back");
		programador.setLenguajeP("Java");
		programador.setBonus(150);
		
		System.out.println(programador.toString());
	}

}
