/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea una cantidad de grados centígrados y 
 *              la pase a grados Fahrenheit. La fórmula correspondiente 
 *              es: F = 32 + ( 9 * C / 5)
 */
package tareasPoo2_2023;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio4 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JButton boton;
    private JLabel resultado;
    
    public Ejercicio4 (){
         // Configurar la ventana
        setTitle("Calculo de Grados");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(153, 153, 255));
        
        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Escribe los Grados Celcius a transformar");
        etiquetaInstrucciones.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetaInstrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etiquetaInstrucciones);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar el JTextField Entrada de Datos
        entradaDatos = new JTextField(12);
        entradaDatos.setFont(new Font("Arial", Font.PLAIN, 12));
        entradaDatos.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(entradaDatos);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

         // Agregar el botón
        boton = new JButton("Preciona Aquí");
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(boton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        
        // Agregar el JLabel Resultado
        resultado = new JLabel("");
        resultado.setFont(new Font("Arial", Font.PLAIN, 14));
        resultado.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(resultado);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dato = entradaDatos.getText();
                float datoFloat = Float.parseFloat(dato);
                resultado.setText(datoFloat+" Grados Celcius es igual a "+ (32+(9*datoFloat/5)) +" grados Fahrenheit");
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
    public static void main(String[] args) {
        Ejercicio4 ventana = new Ejercicio4();
        ventana.setVisible(true);
    }
}
