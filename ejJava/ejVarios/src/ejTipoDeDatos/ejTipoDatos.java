package ejTipoDeDatos;

public class ejTipoDatos {

	public static void main(String[] args) {
		Long variableLong = 100l;
		System.out.println(variableLong.getClass().getName());
		byte variableByte = 5;
		System.out.println(((Byte) variableByte).getClass().getName());
		//System.out.println(variableByte.getClass().getName());
		short variableShort = 1;
		System.out.println(((Short) variableShort).getClass().getName());
		//System.out.println(variableShort.getClass().getName());
		Integer variableInteger = 99999;
		System.out.println(variableInteger.getClass().getName());
		// En el caso de byte y short no se puede obtener la clase.
		
		Integer integerObject = 123;
        Double doubleObject = 3.14159;
        Character charObject = 'B';
        Boolean booleanObject = false;
        int variableInt = 42;
        float variableFloat = 3.14f;
        double variableDouble = 2.71828;
        char variableChar = 'A';
        boolean variableBoolean = true;
		
		
		
	       System.out.println(identificarTipo(variableByte));
	       System.out.println(identificarTipo(variableInt));
	       System.out.println(identificarTipo(variableDouble));
	       System.out.println(identificarTipo(charObject));
	       System.out.println(identificarTipo(integerObject));
	       System.out.println(identificarTipo(doubleObject));
	       System.out.println(identificarTipo(booleanObject));
	       System.out.println(identificarTipo(variableFloat));
	       System.out.println(identificarTipo(variableChar));
	       System.out.println(identificarTipo(variableBoolean));
		
	}
	
	public static String identificarTipo(Object objeto) {
	    if (objeto instanceof Byte || objeto instanceof Short || objeto instanceof Integer || objeto instanceof Long ||
	        objeto instanceof Float || objeto instanceof Double || objeto instanceof Character || objeto instanceof Boolean) {
	        String tipoPrimitivo = objeto.getClass().getName();
	        String tipoEnvoltorio = obtenerTipoEnvoltorio(objeto);
	        return "Tipo primitivo: " + tipoPrimitivo + ", usaria " + tipoEnvoltorio + " para el casteo.";
	    } else {
	        return "Tipo no primitivo: " + objeto.getClass().getName();
	    }
	}

	public static String obtenerTipoEnvoltorio(Object objeto) {
	    if (objeto instanceof Byte) {
	        return "Byte";
	    } else if (objeto instanceof Short) {
	        return "Short";
	    } else if (objeto instanceof Integer) {
	        return "Integer";
	    } else if (objeto instanceof Long) {
	        return "Long";
	    } else if (objeto instanceof Float) {
	        return "Float";
	    } else if (objeto instanceof Double) {
	        return "Double";
	    } else if (objeto instanceof Character) {
	        return "Character";
	    } else if (objeto instanceof Boolean) {
	        return "Boolean";
	    } else {
	        return "Desconocido";
	    }
	}


}
