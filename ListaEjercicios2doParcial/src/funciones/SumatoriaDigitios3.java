/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Solicitar números al usuario hasta que ingrese el cero. Por cada uno, mostrar la
                suma de sus dígitos. Al finalizar, mostrar la sumatoria de todos los números
                ingresados y la suma de sus dígitos. Reutilizar la misma función realizada en el
                Ejercicio N°8.
 */
package funciones;

import java.util.Scanner;


public class SumatoriaDigitios3 {
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
        int num, sumaNumeros = 0, sumaDigitos = 0;
        do {
            System.out.print("Ingrese un número (o cero para terminar): ");
            num = sc.nextInt();
            if (num != 0) {
                sumaNumeros += num;
                sumaDigitos += sumarDigitos(num);
                System.out.printf("La suma de los dígitos de %d es: %d%n", num, sumarDigitos(num));
            }
        } while (num != 0);
        System.out.printf("La sumatoria de los números ingresados es: %d%n", sumaNumeros);
        System.out.printf("La suma de los dígitos de los números ingresados es: %d%n", sumaDigitos);
    }
}
