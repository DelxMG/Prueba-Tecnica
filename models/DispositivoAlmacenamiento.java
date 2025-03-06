package models;

import interfaces.PuedeAlmacenar;

public abstract class DispositivoAlmacenamiento implements PuedeAlmacenar {
    protected double capacidad;
    protected String contenido;

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
