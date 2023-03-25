/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción:  Programa que lea un carácter por teclado
 * 				 y compruebe si es una letra mayúscula
 */
package tareasPoo2_2023;
import java.util.Scanner;
public class Ejercicio27 {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el primer carácter: ");
	        char caracter1 = scanner.next().charAt(0);
	        
	        System.out.print("Ingrese el segundo carácter: ");
	        char caracter2 = scanner.next().charAt(0);
	        
	        if (Character.isLowerCase(caracter1) && Character.isLowerCase(caracter2)) {
	            System.out.println("Los dos caracteres ingresados son letras minúsculas.");
	        } else {
	            System.out.println("Al menos uno de los caracteres ingresados no es una letra minúscula.");
	        }
	        
	        scanner.close();
	    }
	}


