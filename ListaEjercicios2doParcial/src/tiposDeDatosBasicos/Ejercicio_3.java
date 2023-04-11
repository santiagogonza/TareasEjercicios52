/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 07/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escribir un programa que realice la siguiente operación aritmética:
 *              (√(𝑥 + 𝑦 * 𝑧)^5)
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double x,y,z, resultado, raiz;
        
        System.out.println("Ingrese un valor para 'x': ");
        x = entrada.nextFloat();
        System.out.println("Ingrese un valor para 'y': ");
        y = entrada.nextFloat();
        System.out.println("Ingrese un valor para 'z': ");
        z = entrada.nextFloat();
        raiz = x+y*z;
        resultado = Math.pow(raiz, 5);
        resultado = Math.sqrt(resultado);
        
        System.out.println("El resultado de la operacion es: "+ resultado);
    }
}
