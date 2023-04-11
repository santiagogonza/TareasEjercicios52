/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escribir una función que calcule el área de un círculo y otra 
 *              que calcule el volumen de un cilindro usando la primera función.
 */
package funciones;


public class FuncionCirculo {
    
     // Función para calcular el área de un círculo
  public static double calcularAreaCirculo(double radio) {
    return Math.PI * radio * radio;
  }

  // Función para calcular el volumen de un cilindro usando la función anterior
  public static double calcularVolumenCilindro(double radio, double altura) {
    double areaBase = calcularAreaCirculo(radio);
    return areaBase * altura;
  }

  // Ejemplo de uso de las funciones
  public static void main(String[] args) {
    double radio = 5.0;
    double altura = 10.0;

    double areaCirculo = calcularAreaCirculo(radio);
    System.out.println("El área del círculo es: " + areaCirculo);

    double volumenCilindro = calcularVolumenCilindro(radio, altura);
    System.out.println("El volumen del cilindro es: " + volumenCilindro);
  }
    
}
