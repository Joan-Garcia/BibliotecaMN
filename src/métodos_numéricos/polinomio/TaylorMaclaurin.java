package métodos_numéricos.polinomio;

/**
 * 
 * @author ITL. López Miguel, García Joan.
 */
public class TaylorMaclaurin {
    
  /**
     * Enumerado para elegir la función deseada (COSENO, SENO, EULER).
     */
    public enum Funcion{
        COSENO,
        SENO,
        EULER
    }

    /**
     * Devuelve la aproximación del polinomio de MacLaurin.
     * 
     * @param funcion  Tipo de función (SENO, CSENO, EULER).
     * @param x        Punto en donde se evaluará la estimación.
     * @param n        Número de terminos de la expansión del polinomio de MacLaurin.
     * @return         Aproximación del polinomio.
     */
    public static double polinomios(Funcion funcion, double x, int n){
        double resultado = 0;
        for(int i = 0; i < n; i++){
            resultado += derivada(funcion, i) * Math.pow(x, i) / factorial(i);
        }
        return resultado;
    }

    private static int derivada(Funcion funcion, int i){
        switch(funcion){
            case SENO:
                return (i%2 == 0)? 0 : (int) Math.pow(-1,(i-1)/2);
            case COSENO:
                return (i%2 == 0)? (int) Math.pow(-1,(i+1)/2): 0;
            case EULER:
                return 1;
            default: assert funcion != null;
        }
        return 0;
    }

    private static int factorial(int numero){
        return (numero <= 1)? 1: numero * factorial(numero-1);
    }
}
