package models;

import interfaces.PuedeAlmacenar;

/**
 * Clase abstracta que representa un dispositivo de almacenamiento.
 */
public abstract class DispositivoAlmacenamiento implements PuedeAlmacenar {
    protected double capacidad;
    protected String contenido;

    /**
     * Constructor de la clase DispositivoAlmacenamiento.
     *
     * @param capacidad Capacidad del dispositivo en GB.
     * @param contenido Contenido almacenado en el dispositivo.
     */

    public DispositivoAlmacenamiento(double capacidad, String contenido) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }
        this.capacidad = capacidad;
        this.contenido = contenido;
    }



    @Override
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el dispositivo...");
    }


    public double getCapacidad() {
        return capacidad;
    }


    public String getContenido() {
        return contenido;
    }


    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
