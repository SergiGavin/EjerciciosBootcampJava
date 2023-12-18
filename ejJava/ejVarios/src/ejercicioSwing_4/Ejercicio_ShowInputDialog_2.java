package ejercicioSwing_4;

import javax.swing.JOptionPane;

public class Ejercicio_ShowInputDialog_2 {

	public static void main(String[] args) {
		String opcion;
		boolean exit = false;
		do {
		    opcion = JOptionPane.showInputDialog(null, "Queue Operations Menu\n"
		            + "1.Insert\n"
		            + "2.Delete\n"
		            + "3.Display\n"
		            + "4.Exit\n\n"
		            + "Enter your option", JOptionPane.QUESTION_MESSAGE);

		    if (opcion == null) {
		        exit = true;
		    } else {
		        opcion = opcion.trim();

		        if (opcion.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Introduzca su opción", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            try {
		                int opcionInt = Integer.parseInt(opcion);

		                switch (opcionInt) {
		                    case 1:
		                        JOptionPane.showMessageDialog(null, "Has elegido la opcion de insertar", "Insertar", JOptionPane.INFORMATION_MESSAGE);
		                        break;
		                    case 2:
		                        JOptionPane.showMessageDialog(null, "Has elegido la opcion de delete", "Delete", JOptionPane.WARNING_MESSAGE);
		                        break;
		                    case 3:
		                        JOptionPane.showMessageDialog(null, "Has elegido la opcion de display", "Display", JOptionPane.QUESTION_MESSAGE);
		                        break;
		                    case 4:
		                        exit = true;
		                        JOptionPane.showMessageDialog(null, "¡Hasta luego!", "Exit", JOptionPane.ERROR_MESSAGE);
		                        break;
		                    default:
		                        JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
		                }
		            } catch (NumberFormatException e) {
		                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
		    }

		} while (!exit);


	}
}

