package impl.discos;

import models.DiscoAnalogico;

/**
 * Representa un vinilo.
 */
public class Lp extends DiscoAnalogico {

    /**
     * Crea un nuevo disco de vinilo (LP) con las características especificadas.
     *
     * @param capacidad  Capacidad de almacenamiento en GB.
     * @param nombre     Nombre del vinilo.
     * @param contenido  Contenido grabado en el vinilo.
     */

    public Lp(double capacidad, String nombre, String contenido) {
        super(capacidad, nombre, contenido, TipoDisco.VINILO);
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Grabando sonido en el vinilo mediante un proceso analógico.");
    }
}


