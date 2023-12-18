package ejercicioSwing_2;

import javax.swing.JOptionPane;

public class EjSwing_showMessageDialog_2 {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "El total es: \n"
				+ "120 € (IVA 10% no incl.) \n"
				+ "132 € (con IVA incl.)","Ticket", JOptionPane.INFORMATION_MESSAGE);
		

	}
}
