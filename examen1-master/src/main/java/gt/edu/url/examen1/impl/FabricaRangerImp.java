/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.FabricaRanger;

/**
 *
 * @author Pablo Herrera
 */
//FabricaRangerImp Herencia de la clase Fabrica Ranger
public class FabricaRangerImp implements FabricaRanger {
    Monstruo[] _list = new Monstruo[10];
    int _contador=0;
//Inserta datos en una pila
    public boolean apilar(Monstruo monstruo) {
        _list[_contador] = monstruo;
        _contador++;
        return true;
    }

    @Override
//Saca los datos en el orden LIFO
    public boolean desapilar(Monstruo monstruo) {
        _list[_contador] = null;
        _contador--;
        return true;
    }

    @Override
//Inserta los datos en una cola
    public boolean encolar(Monstruo monstruo) {
         _list[_contador]= monstruo;
         _contador++;
         return true;
    }

    @Override
//Saca los datos en el orden FIFO
    public boolean desencolar(Monstruo monstruo) {
        _list[0] = null;
         _contador--;
         for (int j = 0; j < _contador; j++) {
            _list[j] = _list[j+1];
        }
        return true;
    }

    @Override
    //Crea los elementos segun el elemento que escoja el usuario
    public Monstruo fabricar(String elemento) { 
           Monstruo NewMonstruo = new Monstruo();
        if (elemento == "Aire" || elemento == "aire") {
           NewMonstruo.setElemento_Primario(elemento);
           return NewMonstruo;
        }
        if (elemento == "Agua" || elemento == "agua") {
            NewMonstruo.setElemento_Primario(elemento);
            return NewMonstruo;
        }
       if (elemento == "Tierra" || elemento == "tierra") {
            NewMonstruo.setElemento_Primario(elemento);
            return NewMonstruo;
        }
       if (elemento == "Fuego" || elemento == "fuego") {
            NewMonstruo.setElemento_Primario(elemento);
            return NewMonstruo;
        }
        return NewMonstruo;
        
    }
    
}
