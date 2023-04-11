/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escriba un programa que calcule el valor 𝑛 aproximado de usando la serie:
 *              π ≈ 4-(4/3)+(4/5)-(4/7)... ± (4/n)
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entero n: ");
        int n = entrada.nextInt();
        double pi = 0;
        int signo = 1;
        
        for (int i = 1; i <= n; i += 2) {
            pi += signo * 4.0 / i;
            signo *= -1;
        }
        
        System.out.println("El valor aproximado de pi con n=" + n + " es " + pi);
    }
}
