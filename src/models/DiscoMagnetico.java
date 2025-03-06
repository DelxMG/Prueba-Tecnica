package models;

import interfaces.PuedeEscribir;
import interfaces.PuedeLeer;

/**
 * Representa un disco magnético, como los discos duros.
 */
public abstract class DiscoMagnetico extends Disco implements PuedeLeer, PuedeEscribir {

    /**
     * Constructor de la clase DiscoMagnetico.
     *
     * @param capacidad Capacidad del disco en GB.
     * @param nombre    Nombre del disco.
     * @param contenido Contenido almacenado en el disco.
     */
    public DiscoMagnetico(double capacidad, String nombre, String contenido, TipoDisco tipoDisco) {
        super(capacidad, nombre, contenido, tipoDisco);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del " + getTipoDisco() + " con un cabezal magnético...");
    }


    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el " + getTipoDisco() + " con un cabezal magnético...");
    }
}


