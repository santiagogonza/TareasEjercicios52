package ejercicio2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Ventana1 extends JFrame {
	//Declaración de atributos
		private JLabel etiqueta;
		private JButton btnEnviar;
		private JPanel panel;
		
		//Constructores 
		
		// constructor vacio
		
		public Ventana1() {
			panel = new JPanel();
			panel.setBounds(10, 10, 380, 380);
			
			panel.setBackground(Color.green);
			panel.setLayout(null);
			add(panel);
			
			//super hereda de una clase object
			//super();
			etiqueta = new JLabel("Mi primer programa...");
			
			panel.add(etiqueta);
			
			btnEnviar = new JButton("Enviar");
			btnEnviar.setBounds(50,300, 300, 40);
			add(btnEnviar);
			
			
			
			
			setResizable(false);
			setLayout(null);
			setSize(400,400);
			setLocationRelativeTo(null);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
		public static void main(String[] args) {
			new Ventana1();
			//Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
			//JLabel.setSize(pantalla.heigth /3, pantalla.whitd /3)
			
		}
		
}
