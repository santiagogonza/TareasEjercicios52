/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 07/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Programa que pregunte al usuario por el número de horas 
 *              trabajadas y el coste por hora. Después debe mostrar por la 
 *              pantalla la paga total que le corresponde al usuario.
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int hrsTrabajadas, sueldoXhrs, totalSueldo;
        
        System.out.println("Digite el numero de horas que laboro: ");
        hrsTrabajadas = entrada.nextInt();
        System.out.println("Digite el suedo por hora trabajada: ");
        sueldoXhrs = entrada.nextInt();
        
        totalSueldo = hrsTrabajadas * sueldoXhrs;
        
        System.out.println("Su sueldo es de $" + totalSueldo + " por "+ hrsTrabajadas+" horas trabajadas");
    }
    
}
