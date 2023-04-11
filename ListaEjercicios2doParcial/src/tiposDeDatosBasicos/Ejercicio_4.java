/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 07/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escribir un programa que pida al usuario dos números enteros 
 *              y muestre por pantalla el siguiente mensaje:
 *              "<n> entre <m> da un cociente <c> y un resto <r>”, 
 *              donde <n> y <m> son los números introducidos por el usuario, 
 *              y <c> y <r> son el cociente y el resto de la división entera 
 *              respectivamente.
"
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        double cociente, resto;
        
        System.out.println("Ingrese un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        num2 = entrada.nextInt();
        
        cociente = num1 / num2;
        resto = num1 % num2;
        
        System.out.println(num1+ " entre " +num2+ " da un cociente " +cociente+" y un resto " +resto);
    }
}
