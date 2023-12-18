package ejerciciosPOO_4_Herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		Empleado empleado = new Empleado();
		Cliente cliente = new Cliente();
		
		empleado.setNombre("Sergi");
		empleado.setApellidos("Gavin Serrano");
		empleado.setDocumento("Dni");
		empleado.setSueldo(1000);
		empleado.setTipo("A");
		empleado.setTipoContrato("Indefinido");
		
		cliente.setCategoria("Prioritario");
		cliente.setCodigo(1111);
		
		cliente.generarCodigo();
		empleado.calcularSueldo();
		System.out.println(empleado.toString());
		System.out.println(cliente.toString());
	}

}
