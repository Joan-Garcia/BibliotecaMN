package métodos_numéricos.polinomio.algoritmos;

import métodos_numéricos.polinomio.Ecuación;

/**
 * Aplicación del algoritmo de bisección a un polinómio de la forma 
 *                  Ax4+ Bx3 + Cx2 + Dx + E = 0.
 * 
 * @author ITL. López Miguel, García Joan.
 */

public class Bisección {
    
    /**
     * Resuelve un polinómio de la forma Ax4+ Bx3 + Cx2 + Dx + E = 0 por el 
     * método de bisección.
     * En caso de un error en la aplicación del método, la solución 0 puede 
     * presentarse, sin poder ser correcta.
     * 
     * @param ec    polinomio a obtener solución.
     * @param xi    límite inferior del rango,
     * @param xu    límite superior del rango,
     * @param tol   tolerancia para el agoritmo.
     * @param itmax número de iteraciones.
     * @return      solución del polinomio.
     */
    public static double algoritmoBisección(Ecuación ec, double xi, double xu, double tol, int itmax){
        double solución = 0;
        double iu, errorF;
        errorF =  Math.abs(((xi + xu) / 2) - xu);
        for (int i = 0; i < itmax; i++){
            solución = (xi + xu) / 2;
            iu = ec.evaluarEn(xi) * ec.evaluarEn(solución);

            if (ec.evaluarEn(iu) == 0) break;
            else if (errorF <= tol) break;
                else{
                    if (iu < 0) {
                        xu = solución;
                        errorF = Math.abs(solución - xi);
                    }
                    if (iu > 0) {
                        xi = solución;
                        errorF = Math.abs(solución - xu);
                    }
                }
        }
        return solución;
    }
}
