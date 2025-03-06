package models;

import interfaces.PuedeEscribir;
import interfaces.PuedeLeer;

/**
 * Representa un disco óptico, como CD o Blu-ray.
 * Utiliza tecnología láser para leer y escribir datos.
 */
public abstract class DiscoOptico extends Disco implements PuedeLeer, PuedeEscribir {

    /**
     * Constructor de la clase DiscoOptico.
     *
     * @param capacidad   Capacidad del disco en GB.
     * @param nombre      Nombre del disco.
     * @param contenido   Contenido almacenado en el disco.
     * @param tipoDisco   Tipo de disco óptico (CD o Blu-ray).
     */

    public DiscoOptico(double capacidad, String nombre, String contenido, TipoDisco tipoDisco) {
        super(capacidad, nombre, contenido, tipoDisco);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del " + getTipoDisco() + " con tecnología láser...");
    }


    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el " + getTipoDisco() + " con un láser...");
    }
}


