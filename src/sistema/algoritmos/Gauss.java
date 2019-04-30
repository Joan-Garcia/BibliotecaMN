package sistema.algoritmos;

import sistema.EcuacionesLineales;

/**
 * Aplicación del algoritmo de Gauss - Seidel a un sstema de ecuaciones cuadrado
 * de dimensión 3.
 * 
 * @author ITL. López Miguel, García Joan.
 */

public class Gauss {
  
  /**
   * Resuelve el sistema de ecuaciones por el método de Gauss - Seidel.
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
    double[] solucion;
    
    solucion = new double[3];
    
    solucion[0] = x0;
    solucion[1] = y0;
    solucion[2] = z0;
    
    for (int i = 0; i < iteraciones ; i++) {
      solucion[0] = sistema.obtenerX(solucion[1], solucion[2]);
      solucion[1] = sistema.obtenerY(solucion[0], solucion[2]);
      solucion[2] = sistema.obtenerZ(solucion[0], solucion[1]);
      
      if(Math.abs(x0-solucion[0]) < tol && Math.abs(y0-solucion[1]) < tol &&
         Math.abs(z0-solucion[2]) < tol)
        return solucion;
      
      x0 = solucion[0];
      y0 = solucion[1];
      z0 = solucion[2];
    }
    
    return solucion;
  }  
  
}
