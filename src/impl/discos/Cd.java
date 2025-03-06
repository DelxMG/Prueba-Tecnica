package impl.discos;
import models.DiscoOptico;

/**
 * Representa un CD (Compact Disc).
 */
public class Cd extends DiscoOptico {

    /**
     * Crea un nuevo CD con las características especificadas.
     *
     * @param capacidad  Capacidad del CD en GB.
     * @param nombre     Nombre del CD.
     * @param contenido  Contenido almacenado en el CD.
     */
    public Cd (double capacidad, String nombre, String contenido) {
        super(capacidad, nombre, contenido, TipoDisco.CD);
    }
}


