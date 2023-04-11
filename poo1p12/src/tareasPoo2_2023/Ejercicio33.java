/********************************************************************
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Calcular el mayor de tres números enteros en Java.
 *******************************************************************/
package tareasPoo2_2023;
import java.util.Scanner;

public class Ejercicio33 {

	
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el primer número: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Ingrese el segundo número: ");
	        int num2 = scanner.nextInt();
	        
	        System.out.print("Ingrese el tercer número: ");
	        int num3 = scanner.nextInt();
	        
	        int mayor = num1;
	        
	        if (num2 > mayor) {
	            mayor = num2;
	        }
	        
	        if (num3 > mayor) {
	            mayor = num3;
	        }
	        
	        System.out.println("El número mayor es: " + mayor);
	        
	        scanner.close();
	    }
	}