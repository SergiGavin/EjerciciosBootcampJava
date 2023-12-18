package ejercicioSwing_5;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio_showInputDialog_3 {

	public static void main(String[] args) {
		String[] opciones = {"Perro", "Gato", "Lobo", "Loro"};
		String rutaImagen = "./src/ejercicioSwing_5/";
		String lobo = "lobo.jpg";
		String perro = "perro.jpg";
		String gato = "gato.jpg";
		String loro = "loro.jpg";
        String animalFavorito = (String) JOptionPane.showInputDialog(
                null,
                "¿Cuál es tu animal favorito?",
                "Selecciona tu animal favorito",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                "Lobo");

        if (animalFavorito == null) {
            JOptionPane.showMessageDialog(null, "Has cancelado la selección", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        } else if(animalFavorito=="Lobo"){
        	 JOptionPane.showMessageDialog(null, new ImageIcon(rutaImagen+lobo), "Imagen de " + animalFavorito, JOptionPane.PLAIN_MESSAGE);
        }else if(animalFavorito=="Perro"){
        	JOptionPane.showMessageDialog(null, new ImageIcon(rutaImagen+perro), "Imagen de " + animalFavorito, JOptionPane.PLAIN_MESSAGE);
        }else if(animalFavorito=="Gato") {
        	JOptionPane.showMessageDialog(null, new ImageIcon(rutaImagen+gato), "Imagen de " + animalFavorito, JOptionPane.PLAIN_MESSAGE);
        }else if(animalFavorito=="Loro") {
        	JOptionPane.showMessageDialog(null, new ImageIcon(rutaImagen+loro), "Imagen de " + animalFavorito, JOptionPane.PLAIN_MESSAGE);
        }
    }

	}


