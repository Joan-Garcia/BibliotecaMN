package métodos_numéricos.polinomio.algoritmos;

import métodos_numéricos.polinomio.Ecuación;

/**
 * Aplicación del algoritmo de Newton a un polinómio de la forma 
 *                  Ax4+ Bx3 + Cx2 + Dx + E = 0.
 * 
 * @author ITL. López Miguel, García Joan.
 */
public class Newton {
    
    /**
     * Resuelve un polinómio de la forma Ax4+ Bx3 + Cx2 + Dx + E = 0 por el 
     * método de newton.
     * En caso de un error en la aplicación del método, la solución 0 puede 
     * presentarse, sin poder ser correcta.
     * 
     * @param ec    polinomio a obtener solución.
     * @param p0    aproximación inicial.
     * @param tol   tolerancia para el agoritmo.
     * @param itmax número de iteraciones.
     * @return      solución del polinomio.
     */
    public static double algoritmoNewton(Ecuación ec, double p0, double tol, int itmax){
        double solución = 0, errorF;
        for (int i = 0; i < itmax; i++) {
            solución = p0 - ec.evaluarEn(p0) / ec.derivadaEn(p0);
            errorF = Math.abs(solución - p0);
            if (errorF <= tol) break;
            p0 = solución;
        }
        return solución;
    }
}
