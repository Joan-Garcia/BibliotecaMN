package métodos_numéricos.polinomio;

/**
 * Creación de una ecuación de cuarto grado con coeficientes de números reales
 *                    Ax4+ Bx3 + Cx2 + Dx + E = 0.
 * Contiene métodos para evaluar en la función normal y en la derivada 
 * de la misma.
 * 
 * @author ITL. García Joan, López Miguel.         
 */

public class Ecuación {
  private double a, b, c, d, e;

    public Ecuación(double a, double b, double c, double d, double e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    /**
     * Regresa el valor de la función en el punto x dado.
     * 
     * @param x  Punto en el que se va a evaluar.
     * @return   Resultado al evaluar.
     */
    public double evaluarEn(double x){
        return a * Math.pow(x, 4) + b * Math.pow(x, 3) + c * Math.pow(x, 2) + d * x  + e;
    }


    /**
     * Regresa el valor de la derivada de la función en el punto dado.
     * 
     * @param x   Punto en el que se va a evaluar.
     * @return    Resultado al evaluar.
     */
    public double derivadaEn(double x){
        return 4 * a * Math.pow(x, 3) + 3 * b * Math.pow(x, 2) +  2 * c * x + d;
    }
    
    /**
     * Devuelve el coeficiente A de la ecuación.
     * @return  Valor de a.
     */
    public double getA() {
        return a;
    }
    
    /**
     * Define el valor del coeficiente A.
     * @param a   Valor a asignar al coeficiente.
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Devuelve el coeficiente B de la ecuación.
     * @return  Valor de b.
     */
    public double getB() {
        return b;
    }

    /**
     * Define el valor del coeficiente B.
     * @param b   Valor a asignar al coeficiente.
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Devuelve el coeficiente C de la ecuación.
     * @return  Valor de c.
     */
    public double getC() {
        return c;
    }

    /**
     * Define el valor del coeficiente C.
     * @param c   Valor a asignar al coeficiente.
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Devuelve el coeficiente D de la ecuación.
     * @return  Valor de d.
     */
    public double getD() {
        return d;
    }

    /**
     * Define el valor del coeficiente D.
     * @param d   Valor a asignar al coeficiente.
     */
    public void setD(double d) {
        this.d = d;
    }

    /**
     * Devuelve el coeficiente E de la ecuación.
     * @return  Valor de e.
     */
    public double getE() {
        return e;
    }

    /**
     * Define el valor del coeficiente E.
     * @param e   Valor a asignar al coeficiente.
     */
    public void setE(double e) {
        this.e = e;
    }
  
}
