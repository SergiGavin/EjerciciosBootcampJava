package ejerciciosPOO_5_Herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();
		Operario operario = new Operario();
		Directivo directivo = new Directivo();
		Oficial oficial = new Oficial();
		Tecnico tecnico = new Tecnico();
		
		empleado.setNombre("Sergi");
		
		directivo.setNombre(empleado.getNombre());
		operario.setNombre("JoseLuis");
		tecnico.setNombre("Maria");
		oficial.setNombre("Pedro");
		System.out.println(empleado.toString());
		System.out.println(directivo.toString());
		System.out.println(operario.toString());
		System.out.println(tecnico.toString());
		System.out.println(oficial.toString());
		
	}

}
