package ejerciciosPOO_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche = new Coche();
		coche.arrancar();
		coche.acelerar();
		coche.apagar();
		
		coche.setMarca("Mercedes");
		coche.setColor("Negro");
		coche.setAnyo(2007);
		coche.setEco(false);
		coche.setPuertas(4);
			
		String cocheString = coche.toString();
		System.out.println(cocheString);
		
		
		Pajaro pajaro = new Pajaro();
		pajaro.cantar();
		pajaro.comer();
		pajaro.volar();
		
		pajaro.setColor("Azul y blanco");
		pajaro.setEdad(2);
		pajaro.setRaza("Periquito");
		pajaro.setTono("Agudo");
		
		Libro libro = new Libro();
		libro.leerSinopsis();
		
		libro.setAutor("Brandon Sanderson");
		libro.setGenero("Fantasia");
		libro.setPaginas(750);
		libro.setTitulo("Imperio Final");
		
		
	}

}
