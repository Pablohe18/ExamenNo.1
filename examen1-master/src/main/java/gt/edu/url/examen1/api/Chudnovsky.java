package gt.edu.url.examen1.api;

/**
 *
 * @author tuxtor
 */
public interface Chudnovsky {
    
    public double calcularPi(int cantidadDigitos);
    //Factorial para utilizarlo en la formula del algoritmo
    public static double factorial(double n){
        if (n == 0) {
            return 1;
        }
        else{
            return n * factorial(n -1);
        }
    }
    //Metodo para calcular el algoritmo de algChudnovsky
     public static double algChudnovsky (double k){
         double sum;
         double Numerogrande;
         double numerador;
         double denominador;
         double NumeroPi = 0;
         Numerogrande = Math.pow(-2.625374126*10, 17);
         if (k == 0) {
             return 1;
         }
         else{
             //Ecuacion para calcular el algoritmo
             numerador = Math.pow(-1, k) * factorial(6.0 * k) * (13591409.0 + 545140134.0 * k);
             denominador = factorial(3 * k) * Math.pow(factorial(k), 3.0) * Math.pow(640320.0, (3.0 * k) + 3.0 / 2);
             NumeroPi = (numerador / denominador);
             sum = NumeroPi;
         }
         sum = sum * 12;
         sum = 1/sum;
         
         System.out.print(sum);
        return sum;
  }
}