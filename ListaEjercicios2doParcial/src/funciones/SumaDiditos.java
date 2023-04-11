/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Solicitar números al usuario hasta que ingrese el cero. Por cada uno, mostrar la
                suma de sus dígitos (utilizando una función que realice dicha suma).
 */
package funciones;

import java.util.Scanner;


public class SumaDiditos {
    // Función para obtener la sumatoria de dígitos de un número
  public static int sumarDigitos(int n) {
    int suma = 0;
    while (n > 0) {
      suma += n % 10;
      n /= 10;
    }
    return suma;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int mayorSuma = 0;
    int numMayorSuma = 0;
    int cantMenorSuma = 0;

    System.out.print("Ingrese un número positivo (o un número negativo para terminar): ");
    int num = input.nextInt();

    while (num > 0) {
      int sumaDigitos = sumarDigitos(num);
      if (sumaDigitos > mayorSuma) {
        mayorSuma = sumaDigitos;
        numMayorSuma = num;
      }
      if (sumaDigitos < 10) {
        cantMenorSuma++;
      }
      System.out.print("Ingrese otro número positivo (o un número negativo para terminar): ");
      num = input.nextInt();
    }

    System.out.println("El número cuya sumatoria de dígitos fue mayor es: " + numMayorSuma);
    System.out.println("La cantidad de números cuya sumatoria de dígitos fue menor que 10 es: " + cantMenorSuma);
  }
}
