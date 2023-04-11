/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escribir un programa que pida al usuario un número entero y 
 *              muestre por pantalla si es un número primo o no.
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int numero = entrada.nextInt();
        
        boolean esPrimo = true;
        
        for (int i = 2; i <= numero/2; i++) {
            if (numero % 2 == 0) {
                esPrimo = false;
            }
        }
        
        if (esPrimo) {
            System.out.println(numero+ " es primo");
        } else {
            System.out.println(numero+ " NO es primo");
        }
    }
}
