/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Dada una secuencia de números terminada en cero, elaborar un 
 *              algoritmo para calcular el porcentaje y la suma de los números 
 *              impares, el porcentaje y la suma de los números pares, y la suma 
 *              de todos los números, y cuántos números fueron ingresados.
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, impares = 0, pares = 0, sumaImpares = 0, sumaPares = 0, total = 0, cantidad = 0;
        double porcImpares, porcPares;
        
        System.out.print("Ingrese una secuencia de números terminada en cero: ");
        num = entrada.nextInt();
        
        while (num != 0) {
            total += num;
            cantidad++;
            
            if (num % 2 == 0) {
                pares++;
                sumaPares += num;
            } else {
                impares++;
                sumaImpares += num;
            }
            
            num = entrada.nextInt();
        }
        
        porcImpares = (double) impares / cantidad * 100;
        porcPares = (double) pares / cantidad * 100;
        
        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Porcentaje de números impares: " + porcImpares + "%");
        System.out.println("Suma de números impares: " + sumaImpares);
        System.out.println("Porcentaje de números pares: " + porcPares + "%");
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma total de números: " + total);
    }
}
