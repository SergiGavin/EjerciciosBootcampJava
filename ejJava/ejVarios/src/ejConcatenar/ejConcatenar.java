package ejConcatenar;

public class ejConcatenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define, nombre, apellido, calle minicipio, cp, sexo char, correo electronico.. Concatenar salto de linea, tab
		String nombre = "Sergi";
		String apellido = "Gavin";
		String calle = "C/ ejemplo";
		String cp = "08208"; //Ponemos String porque no vamos a operar con el.
		char sexo = 'H';
		String correo = "sergi.gs@hotmail.es";
		System.out.println("Buenas mi nombre es "+nombre+ " " +apellido + ". Actualmente vivo en"
				+calle+ " con codigo postal "+cp+". \n Mi sexo es "+sexo+
				". \n Para contactar conmigo lo podeis hacer enviando un correo a "+correo);
	}

}
