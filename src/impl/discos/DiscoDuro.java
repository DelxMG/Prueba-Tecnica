package impl.discos;

import interfaces.PuedeEscribir;
import models.DiscoMagnetico;

/**
 * Representa un disco duro.
 */
public class DiscoDuro extends DiscoMagnetico implements PuedeEscribir {


    /**
     * Crea un nuevo Disco Duro con las características especificadas.
     *
     * @param capacidad  Capacidad de almacenamiento en GB.
     * @param nombre     Nombre del disco duro.
     * @param contenido  Contenido inicial almacenado en el disco.
     */
    public DiscoDuro (double capacidad, String nombre, String contenido){
        super(capacidad, nombre, contenido, TipoDisco.DISCO_DURO);
    }
}



