package ejercicioBorderLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EjercicioBorderLayout_1 {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		//Titulo
		jFrame.setTitle("Border Layout");
		//Tamaño
		jFrame.setSize(800,600);
		//Para que sea visible
		jFrame.setVisible(true);
		//Para que al darle a cerrar se salga.
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Para que aparezca en el centro de la pantalla
		jFrame.setLocationRelativeTo(null);
		//jFrame.getContentPane().setBackground(new Color(5,65,90));
		jFrame.setResizable(false);
		jFrame.setLayout(new BorderLayout());
		
		
		JButton btn1 = new JButton("Btn 1");
		JButton btn2 = new JButton("Btn 2");
		JButton btn3 = new JButton("Btn 3");
		JButton btn4 = new JButton("Btn 4");
		JButton btn5 = new JButton("Btn 5");
		
		jFrame.add(btn1,BorderLayout.NORTH);
		jFrame.add(btn2,BorderLayout.EAST);
		jFrame.add(btn3,BorderLayout.CENTER);
		jFrame.add(btn4,BorderLayout.WEST);
		jFrame.add(btn5,BorderLayout.SOUTH);
		

	}

}
