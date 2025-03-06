package models;

import interfaces.PuedeLeer;

/**
 * Representa un disco analógico, como los vinilos (LP).
 * Utiliza un proceso de lectura analógico.
 */
public abstract class DiscoAnalogico extends Disco implements PuedeLeer {

    /**
     * Constructor de la clase DiscoAnalogico.
     *
     * @param capacidad   Capacidad del disco en GB.
     * @param nombre      Nombre del disco.
     * @param contenido   Contenido almacenado en el disco.
     */
    public DiscoAnalogico(double capacidad, String nombre, String contenido, TipoDisco tipoDisco) {
        super(capacidad, nombre, contenido, tipoDisco);
    }


    @Override
    public void leerDatos() {
        System.out.println("Reproduciendo sonido analógico desde el " + getTipoDisco() + "...");
    }
}

