/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escribir un programa que pida números positivos al usuario. Mostrar el número
                cuya sumatoria de dígitos fue mayor y la cantidad de números cuya sumatoria
                de dígitos fue menor que 10. Utilizar una o más funciones, según sea necesario
 */
package funciones;

import java.util.Scanner;


public class FuncionSumarDIgitos {
     public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingrese un número (o cero para terminar): ");
            num = sc.nextInt();
            if (num != 0) {
                int suma = sumarDigitos(num);
                System.out.printf("La suma de los dígitos de %d es: %d%n", num, suma);
            }
        } while (num != 0);
    }
}
