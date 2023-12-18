package ejerciciosSwing_6;


import javax.swing.JOptionPane;

public class Ejercicio_showOptionDialog {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "¿Cuántas preguntas quieres hacer?");
        
        int numPreguntas = Integer.parseInt(input);
		for (int i = 0; i <numPreguntas; i++) {
			 mostrarPreguntaAleatoria();
		}
		
	}
	public static void mostrarPreguntaAleatoria() {
        Pregunta[] preguntas = {
                new Pregunta("La vida es como una bicicleta, para mantener el equilibrio, debes seguir adelante.",
                        new Object[]{"Sí, me encanta", "Sí", "No", "No, definitivamente no"}, 0),
                new Pregunta("El único modo de hacer un gran trabajo es amar lo que haces.",
                        new Object[]{"De acuerdo", "En desacuerdo"}, 0),
                new Pregunta("La imaginación es más importante que el conocimiento.",
                        new Object[]{"Cierto", "Falso"}, 0),
                new Pregunta("¿Viaje antes que destino?",
                        new Object[]{"Si","Obvio que si", "No","Obvio que no"}, 0),
                new Pregunta("¿Qué es más valioso: el tiempo pasado con seres queridos, el éxito profesional, la salud física o la autorrealización?",
                        new Object[]{"Tiempo con seres queridos","Éxito profesional", " Salud física","Autorrealización"}, 0),
                new Pregunta("Si pudieras tener un superpoder, ¿elegirías la invisibilidad, la teletransportación, la telepatía o la capacidad de volar?",
                        new Object[]{"Invisibilidad","Teletransportación", "Telepatía", " Capacidad de volar"}, 0),
                new Pregunta("¿Feliz e ignorante o infeliz pero culto?",
                        new Object[]{"Feliz e ignorante","Infeliz pero culto"}, 0),
                new Pregunta("¿Si pudieras cambiar el pasado provocando cambios en el presente y futuro, lo harías?",
                        new Object[]{"Si","No"}, 0),
                new Pregunta("¿Sacrificarías el mundo entero por tu gente o tu gente por el mundo entero?",
                        new Object[]{"Mi gente antes que todo","El mundo entero antes que mi gente"}, 0),
        };

        int indicePregunta = (int) (Math.random() * preguntas.length);
        Pregunta preguntaActual = preguntas[indicePregunta];

        int respuesta = JOptionPane.showOptionDialog(
                null,
                preguntaActual.frase,
                "Frases Aleatorias",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, preguntaActual.opciones,
                preguntaActual.opciones[0]
        );
    }

   
}

		class Pregunta {
		    String frase;
		    Object[] opciones;
		    int respuestaCorrecta;
		
		    Pregunta(String frase, Object[] opciones, int respuestaCorrecta) {
		        this.frase = frase;
		        this.opciones = opciones;
		        this.respuestaCorrecta = respuestaCorrecta;
		
		        for (int i = opciones.length - 1; i > 0; i--) {
		            int j = (int) (Math.random() * (i + 1));
		            Object temp = opciones[i];
		            opciones[i] = opciones[j];
		            opciones[j] = temp;
		        }
		    }
		}
