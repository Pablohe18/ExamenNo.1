/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

/**
 *
 * @author tuxtor
 */
public class Monstruo {
    //Se guardan los datos de los Monstruos en sus respectivas variables
    String nombre;
    String Elemento_Primario;
    int Edad;
    String color;
//Guarda el nombre del monstruo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Guarda el elemento primario de los monstruos
    public void setElemento_Primario(String Elemento_Primario) {
        this.Elemento_Primario = Elemento_Primario;
    }
    //Guarda la edad de los monstruos
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    //Guarda el color de los monstruos
    public void setColor(String color) {
        this.color = color;
    }
    //Jala el nombre de los monstruos Guardado
    public String getNombre() {
        return nombre;
    }
    //jala el elementro primario GUardado
    public String getElemento_Primario() {
        return Elemento_Primario;
    }
    //Jala La edad guardada de los monstruos
    public int getEdad() {
        return Edad;
    }
    //jala el color de los monstruos guardados
    public String getcolor() {
        return color;
    }
        //Se crean las habilidades en comun esntre los diferentes monstruos
        public String Agigantarse(String Agigantarse) {
        return "Soy un mounstruo y me Agiganto :)";
    }
        //Se crean las habilidades en comun esntre los diferentes monstruos
        public String Caminar_Lento(String Caminar_Lento) {
        return "Soy un mounstruo y camino lento";
    }   
        //Se crean las habilidades en comun esntre los diferentes monstruos
        public String Golpear(String golpear) {
        return "Soy un mounstruo y te golpeo";
    }  
}
