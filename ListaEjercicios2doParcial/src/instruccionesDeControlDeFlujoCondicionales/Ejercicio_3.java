/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Realice un programa que imprima “Capicúa” si un número de
 *              entrada de cuatro dígitos es capicúa, o “No lo es” en caso
 *              contrario. Un número es capicúa si se escribe igual al derecho
 *              y al revés. Por ejemplo, 1551 es un número capicúa.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero de 4 digitos: ");
        int numero = entrada.nextInt();

        String numeroString = Integer.toString(numero);

        String candenaInvertida = new StringBuilder(numeroString).reverse().toString();

        if (numeroString.equals(candenaInvertida)) {
            System.out.println(candenaInvertida);
            System.out.println("CAPICUA");
        } else {
            System.out.println("NO ES CAPICUA");
        }
    }
}
