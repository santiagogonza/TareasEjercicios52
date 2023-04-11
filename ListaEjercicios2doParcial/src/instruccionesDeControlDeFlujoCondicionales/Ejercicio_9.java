/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Cree un algoritmo que tome como entrada la hora exacta 
 *              (horas, minutos, segundos y AM/PM) e indique el número de 
 *              segundos transcurridos durante ese día.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la hora en formato HH:MM:SS AM/PM: ");
        String hora = entrada.nextLine();
        
        String[] partes = hora.split(":");
        
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1].substring(0, 2));
        int segundos = Integer.parseInt(partes[2].substring(0, 2));
        String amPm = partes[2].substring(3);
        
        if (amPm.equalsIgnoreCase("pm")) {
            horas += 12;
        }
        
        segundos = horas * 3600 + minutos * 60 + segundos;
        
        System.out.println("El numero de segundos transcurridos durante el dia es: " + segundos);
    }
}
