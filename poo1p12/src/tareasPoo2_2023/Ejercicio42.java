/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que muestre 
 * 				los números del 100 al 1 utilizando 
 * 				la instrucción for
 */
package tareasPoo2_2023;
import javax.swing.*;
public class Ejercicio42 extends JFrame{

	 private JLabel label;
	    private JButton button;
	    private int i = 100;
	    
	    public Ejercicio42() {
	        super("Números del 100 al 1");
	        setSize(300, 100);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        label = new JLabel("100");
	        label.setHorizontalAlignment(JLabel.CENTER);
	        add(label);
	        
	        button = new JButton("Mostrar siguiente número");
	        add(button, "South");
	        
	        button.addActionListener(e -> mostrarSiguienteNumero());
	        
	        setVisible(true);
	    }
	    
	    private void mostrarSiguienteNumero() {
	        i--;
	        label.setText(Integer.toString(i));
	        
	        if (i == 1) {
	            button.setEnabled(false);
	        }
	    }
	    
	    public static void main(String[] args) {
	        new Ejercicio42();
	        
	        for (int i = 100; i >= 1; i--) {
	            System.out.println(i);
	        }
	    }
	
}
