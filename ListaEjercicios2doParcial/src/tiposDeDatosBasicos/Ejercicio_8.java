/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 07/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escriba un programa que dados la distancia recorrida por un 
 *              objeto y el tiempo que tomó el objeto en recorrer esa 
 *              distancia, calcule su velocidad.
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la distancia recorrida del objeto: ");
        float distancia = entrada.nextInt();
        System.out.println("Ingrese el tiempo transcurrido por el objeto: ");
        float tiempo = entrada.nextInt();
        
        float velocidad = distancia/tiempo;
        
        System.out.println("La velocidad del objeto es de "+velocidad);
    }
}
