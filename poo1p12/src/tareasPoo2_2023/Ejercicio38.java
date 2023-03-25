/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que muestre los números 
 * 				del 1 al 100 utilizando la instrucción do..while
 */
package tareasPoo2_2023;
import javax.swing.*;

public class Ejercicio38 extends JFrame {

		    private JLabel label;
		    private JButton button;
		    
		    public Ejercicio38() {
		    	
		        super("Números del 1 al 100");
		        
		        setSize(350, 300);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        label = new JLabel("1");
		        label.setHorizontalAlignment(JLabel.CENTER);
		        add(label);
		        
		        button = new JButton("Mostrar siguiente número");
		        add(button, "South");
		        
		        button.addActionListener(e -> mostrarSiguienteNumero());
		        
		        setVisible(true);
		    }
		    
		    private void mostrarSiguienteNumero() {
		        int i = Integer.parseInt(label.getText()) + 1;
		        label.setText(Integer.toString(i));
		        
		        if (i == 100) {
		            button.setEnabled(false);
		        }
		    }
		    
		    public static void main(String[] args) {
		        new Ejercicio38();
		    }
		
}
