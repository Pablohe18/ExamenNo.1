package gt.edu.url.examen1.api;

import gt.edu.url.examen1.impl.Monstruo;

/**
 *
 * @author Pablo Herrera
 */
public interface FabricaRanger {
    public boolean apilar(Monstruo monstruo);

    public boolean desapilar(Monstruo monstruo);
    
    public boolean encolar(Monstruo monstruo);
    
    public boolean desencolar(Monstruo monstruo);
    
    public Monstruo fabricar(String elemento);
}
