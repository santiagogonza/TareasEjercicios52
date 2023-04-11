/**
 * Autor: Gonzalo Santiago Garcia
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Haga una función para determinar si un punto (X, Y) está dentro de un
                rectángulo. El rectángulo es definido por la coordenada del vértice superior
                izquierdo, su altura y su ancho.
 */
package funciones;

public class FuncionRectangulo {
    // Función para determinar si un punto está dentro de un rectángulo
  public static boolean puntoEnRectangulo(int x, int y, int rectX, int rectY, int rectAncho, int rectAltura) {
    if (x >= rectX && x <= rectX + rectAncho && y >= rectY && y <= rectY + rectAltura) {
      return true;
    } else {
      return false;
    }
  }

  // Ejemplo de uso de la función
  public static void main(String[] args) {
    int x = 3;
    int y = 5;
    int rectX = 2;
    int rectY = 4;
    int rectAncho = 8;
    int rectAltura = 6;
    if (puntoEnRectangulo(x, y, rectX, rectY, rectAncho, rectAltura)) {
      System.out.println("El punto (" + x + ", " + y + ") está dentro del rectángulo.");
    } else {
      System.out.println("El punto (" + x + ", " + y + ") está fuera del rectángulo.");
    }
  }
}
