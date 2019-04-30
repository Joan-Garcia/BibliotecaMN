package sistema;

/**
 * Creación de un sistema de ecuaciones lineales con coeficientes de números 
 * reales. Contiene métodos para obtener el despeje de cada variable de un 
 * sistema cuadrado de dimensión 3.
 * 
 * @author ITL. López Miguel, García Joan.
 */

public class EcuacionesLineales {
  private final double[][] matriz_ecuacion;
  
  public EcuacionesLineales(double[][] matriz_ecuacion){
    this.matriz_ecuacion = matriz_ecuacion;
  }  
  
  /**
   * Define el coeficiente del sistema de la variable en (i,j).
   * 
   * @param i             Fila de la posición de la variable,
   * @param j             Columna de la posición de la variable,
   * @param nuevo_valor   Valor a asignar al coeficiente.
   */
  public void setCoeficiente(int i, int j, int nuevo_valor){
    matriz_ecuacion[i][j] = nuevo_valor;
  }
  
  /**
   * Obtiene el coeficiente del sistema de la variable en (i,j).
   * 
   * @param i             Fila de la posición de la variable,
   * @param j             Columna de la posición de la variable.
   * 
   * @return              Coeficiente en (i,j).
   */
  public double getCoeficiente(int i, int j){
    return matriz_ecuacion[i][j];
  }
  
  /**
   * Obtiene la solución de la primer variable de un sistema de ecuaciones 
   * cuadrado de dimensión 3. El sistema debe ser cuadrado de 3x3.
   * Este método es utilizado internamente por las clases del paquete 
   * sistema.algoritmos.
   * 
   * @param y   Valor de la segunda variable,
   * @param z   Valor de la tercer variable,
   * @return    Resultado de la primera variable.
   */
  public double obtenerX(double y, double z){
    return (matriz_ecuacion[0][3] - matriz_ecuacion[0][1] * y
            - matriz_ecuacion[0][2] * z) / matriz_ecuacion[0][0];
  }
  
  /**
   * Obtiene la solución de la segunda variable de un sistema de ecuaciones 
   * cuadrado de dimensión 3. El sistema debe ser cuadrado de 3x3.
   * Este método es utilizado internamente por las clases del paquete 
   * sistema.algoritmos.
   * 
   * @param x   Valor de la primera variable,
   * @param z   Valor de la tercer variable,
   * @return    Resultado de la segunda variable.
   */
  public double obtenerY(double x, double z){
    return (matriz_ecuacion[1][3] - matriz_ecuacion[1][0] * x
            - matriz_ecuacion[1][2] * z) / matriz_ecuacion[1][1];
  }
  
  /**
   * Obtiene la solución de la tercera variable de un sistema de ecuaciones 
   * cuadrado de dimensión 3. El sistema debe ser cuadrado de 3x3.
   * Este método es utilizado internamente por las clases del paquete 
   * sistema.algoritmos.
   * 
   * @param x   Valor de la primera variable,
   * @param y   Valor de la segunda variable,
   * @return    Resultado de la tercerda variable.
   */
  public double obtenerZ(double x, double y){
    return (matriz_ecuacion[2][3] - matriz_ecuacion[2][0] * x
            - matriz_ecuacion[2][1] * y) / matriz_ecuacion[2][2];
  }
}
