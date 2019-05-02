package métodos_numéricos.sistema.algoritmos;

import métodos_numéricos.sistema.EcuacionesLineales;

/**
 * Aplicación del algoritmo de Jacobi a un sstema de ecuaciones cuadrado
 * de dimensión 3.
 * 
 * @author ITL. López Miguel, García Joan.
 */

public class Jacobi {
  
  /**
   * Resuelve el sistema de ecuaciones por el método de Jacobi.
   * 
   * @param sistema       El sistema de ecuaciones a resolver,
   * @param x0            Valor inicial de la primera variable,
   * @param y0            Valor inicial de la segunda variable,
   * @param z0            Valor inicial de la tercera variable
   * @param tol           Tolerancia para el algoritmo,
   * @param iteraciones   Número de iteraciones.
   * @return              Array con las soluciones.
   */
  public static double[] ObtenerSolucion(EcuacionesLineales sistema,
                                         double x0, double y0, double z0,
                                         double tol, int iteraciones){
    double xi, yi, zi;
    double[] solucion;
    
    solucion = new double[3];
    
    // - Iteracion 0:
    solucion[0] = xi = sistema.obtenerX(y0, z0);
    solucion[1] = yi = sistema.obtenerY(x0, z0);
    solucion[2] = zi = sistema.obtenerZ(x0, y0);
    
    for (int i = 0; i < iteraciones - 1; i++) {
      solucion[0] = sistema.obtenerX(yi, zi);
      solucion[1] = sistema.obtenerY(xi, zi);
      solucion[2] = sistema.obtenerZ(xi, yi);
      
      if(Math.abs(xi-solucion[0]) < tol &&
          Math.abs(yi-solucion[1]) < tol &&
          Math.abs(zi-solucion[2]) < tol)
          return solucion;
      
      xi = solucion[0];
      yi = solucion[1];
      zi = solucion[2];
    }
    
    return solucion;
  }

}
