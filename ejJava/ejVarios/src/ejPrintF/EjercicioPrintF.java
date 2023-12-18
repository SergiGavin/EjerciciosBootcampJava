package ejPrintF;

public class EjercicioPrintF {

	public static void main(String[] args) {
		
		//1.
		System.out.printf("%s\t%s\t%s%n","Sergi","Gavin","Serrano");
		//2.
		System.out.printf("%s       %s%s","Sergi","Gavin","Serrano");
		//3.
		System.out.printf("%n%2$s %3$s, %1$s%n","Sergi","Gavin","Serrano");
		//4. 
		System.out.printf("%10d%n",22);
		//5. 
		System.out.printf("%010d%n",22);
		//6.
		System.out.printf("%09.2f%n",17.1829327);
		//7.
		System.out.printf("%s\b%s", "Hola ", "Mun\bdo");
		
		
	}

}
