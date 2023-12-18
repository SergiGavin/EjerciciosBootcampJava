package ejercicioSwing_3;

import javax.swing.JOptionPane;

public class Ejercicio_showInputDialog {

    public static void main(String[] args) {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
            
            if (nombre == null) {
                // El usuario presionó "Cancelar" o cerró la ventana
                JOptionPane.showMessageDialog(null, "Introduzca el nombre", "Title", JOptionPane.WARNING_MESSAGE);
            } else {
                
                if (!nombre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + nombre, "Title", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Introduzca su nombre", "Title", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (nombre == null || nombre.trim().isEmpty());
    }
}
