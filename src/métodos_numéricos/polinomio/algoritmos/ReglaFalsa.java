package métodos_numéricos.polinomio.algoritmos;

import métodos_numéricos.polinomio.Ecuación;

/**
 * Aplicación del algoritmo de regla falsa a un polinómio de la forma 
 *                  Ax4+ Bx3 + Cx2 + Dx + E = 0.
 * 
 * @author ITL. López Miguel, García Joan.
 */
public class ReglaFalsa {

  /**
   * Resuelve un polinómio de la forma Ax4+ Bx3 + Cx2 + Dx + E = 0 por el 
   * método de regla falsa.
   * En caso de un error en la aplicación del método, la solución 0 puede 
   * presentarse, sin poder ser correcta.
   * 
   * @param ec    polinómio a obtener solución,
   * @param xi    límite inferior del rango,
   * @param xu    límite superior del rango,
   * @param tol   tolerancia para el algoritmo,
   * @param itmax número de iteraciones.
   * 
   * @return      solución del polinómio. 
   */
  public static double obtenerSolución(Ecuación ec, double xi, double xu, 
                                       double tol, int itmax){
    double xo, fxo, solución;
    
    solución = 0;
    
    xo = (xi * ec.evaluarEn(xu) - xu * ec.evaluarEn(xi)) /
         (ec.evaluarEn(xu) - ec.evaluarEn(xi));
    fxo = ec.evaluarEn(xo);

    for (int i = 0; i < itmax; i++){
      if(ec.evaluarEn(xi) * ec.evaluarEn(xu) > 0){  // - No puede aplicarse
        System.err.println("No se cumple el teorema de bolzano");
        break;
      }else if(ec.evaluarEn(xi) * fxo > 0){ // - Actualiza valor de xi
        xi = xo;
        xo = (xi * ec.evaluarEn(xu) - xu * ec.evaluarEn(xi)) /
             (ec.evaluarEn(xu) - ec.evaluarEn(xi));
        solución = xo;
        if(Math.abs(xo - xi) < tol) break;
      }else if(ec.evaluarEn(xi) * fxo < 0){ // - Actualiza valor de xu
        xu = xo;
        xo = (xi * ec.evaluarEn(xu) - xu * ec.evaluarEn(xi)) /
             (ec.evaluarEn(xu) - ec.evaluarEn(xi));
        solución = xo;
        if(Math.abs(xo - xi) < tol) break;
      }
    }
    
    return solución;
  }

}
