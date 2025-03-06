package impl.discos;

import models.DiscoOptico;

/**
 * Representa un Blue-Ray.
 */
public class BlueRay extends DiscoOptico {

    boolean esReescribible;

    /**
     * Crea un nuevo Blu-ray con las características especificadas.
     *
     * @param capacidad       Capacidad del Blu-ray en GB.
     * @param nombre          Nombre del disco.
     * @param contenido       Contenido almacenado en el disco.
     * @param esReescribible  Indica si el Blu-ray se puede reescribir.
     */
    public BlueRay(double capacidad, String nombre, String contenido, boolean esReescribible) {
        super(capacidad, nombre, contenido, TipoDisco.BLUERAY);
        this.esReescribible = esReescribible;
    }

    /**
     * Intenta escribir datos en el Blu-ray.
     * Si el disco es reescribible, permite la grabación; de lo contrario, muestra un error.
     */
    @Override
    public void escribirDatos() {
        System.out.println(esReescribible ? "Grabando datos en Blu-ray reescribible..." : "Error: Este Blu-ray es solo de lectura.");
    }
}
