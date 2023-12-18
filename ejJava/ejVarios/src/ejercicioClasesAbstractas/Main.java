package ejercicioClasesAbstractas;

import java.awt.image.AreaAveragingScaleFilter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SerVivo serVivo = new SerVivo() {
			
			@Override
			public void alimentarse() {
				// TODO Auto-generated method stub
				
			}
		};
		Animal animal = new Animal() {
			
			@Override
			public void alimentarse() {
				// TODO Auto-generated method stub
				
			}
		};
		Planta planta = new Planta();
		planta.alimentarse();
		AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
		animalCarnivoro.alimentarse();
		AnimalHerbivoro animalHerbivoro = new AnimalHerbivoro();
		animalHerbivoro.alimentarse();
		
	}

}
