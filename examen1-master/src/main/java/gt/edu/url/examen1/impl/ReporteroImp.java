/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.Reportero;
/**
 *
 * @author Pablo Herrera
 */
public class ReporteroImp implements Reportero {
        String[] rep=new String[10];
    @Override
    //metodo para encontrar el ganador entre los juegos 
    public String calcularGanador(int A, int B) {
        String resultado;
        if (A<= 7 && B <=7) {
            if (A==7 || B==7) {
                if (A==B + 1 || B == A + 2) {
                    resultado = "Gano A";
                }else if (B ==A + 1 || B==A+2) {
                    resultado = "Gano B";
                }else {
                    resultado = "Juego Invalido";
                }
            }
        else if (A == 6 || B == 6) {
            if (A >= B +2) {
                resultado = "Gano A";
            }else if(B >= A + 2){
                resultado = "Gano B";
            }else {
                resultado = "El juego continua";
            }
        }
        else {
            resultado ="El Juego Continua";
        }
    }else {
    resultado = "Juego Invalido";
    
}
        for (int i = 0; i < 9; i++) {
             rep[i] = resultado;  
        }
        
        return resultado;
}

    @Override
    //Se calcula en campeon en base a la lista comparando cual es el que ha ganado mas juegos 
    public String calcularCampeon() {
        int contadorA = 0;
        int contadorB = 0;
        for (int i = 0; i < 9; i++) {
            if (rep[i] == "Gano A") {
                contadorA++;
            }else {
                contadorB++;
            }
            if (contadorA > contadorB) {
                System.out.println("El ganador es el A"); 
            }else {
                System.out.println("El ganador es el B");
            }
        }
            return "No hay ganador";       
    }

    @Override
    //Se recuerda cual es el juego ganador y quien lo gano
    public String recordarGanador(int juego) {
      return rep[juego];
    }
}
