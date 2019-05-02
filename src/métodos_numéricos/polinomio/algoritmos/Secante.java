package métodos_numéricos.polinomio.algoritmos;

import métodos_numéricos.polinomio.Ecuación;

/**
 * Aplicación del algoritmo de regla falsa a un polinómio de la forma 
 *                  Ax4+ Bx3 + Cx2 + Dx + E = 0.
 * 
 * @author ITL. López Miguel, García Joan.
 */

public class Secante {

  /**
   * Resuelve un polinómio de la forma Ax4+ Bx3 + Cx2 + Dx + E = 0 por el 
   * método de la secante.
   * En caso de un error en la aplicación del método, la solución 0 puede 
   * presentarse, sin poder ser correcta.
   * 
   * @param ec    polinómio a obtener solución,
   * @param p0    iteración 0,
   * @param p1    iteración 1,
   * @param tol   tolerancia para el algoritmo,
   * @param itmax número de iteraciones.
   * 
   * @return      solución del polinómio. 
   */
  public static double algoritmoSecante(Ecuación ec, double p0, double p1,
                                        double tol, int itmax){
    double solución;
    
    solución = 0;
    
    for (int i = 0; i < itmax; i++) {
      solución = p1 - (ec.evaluarEn(p1) * (p1 - p0)) / 
                      (ec.evaluarEn(p1) - ec.evaluarEn(p0));
      if (Math.abs(solución - p1) <= tol) return solución;
        p0 = p1;
        p1 = solución;
    }
    
    return solución;
  }
  
}
