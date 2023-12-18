package ejercicioContainer;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ejercicio_Container{

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		//Titulo
		jFrame.setTitle("Fundación Esplai");
		//Tamaño
		jFrame.setSize(800,600);
		//Para que sea visible
		jFrame.setVisible(true);
		//Para que al darle a cerrar se salga.
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Para que aparezca en el centro de la pantalla
		jFrame.setLocationRelativeTo(null);
		jFrame.getContentPane().setBackground(new Color(5,65,90));
		jFrame.setResizable(false);
		//Icono
        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("./icono2.png"));
        
	}

}
