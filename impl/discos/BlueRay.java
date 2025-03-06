package impl.discos;

import models.DiscoOptico;

public class BlueRay extends DiscoOptico {

    boolean esReescribible;

    public BlueRay(double capacidad, String nombre, String contenido, boolean esReescribible) {
        super(capacidad, nombre, contenido, TipoDisco.BLUERAY);
        this.esReescribible = esReescribible;
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del Blue-ray...");
    }

    @Override
    public void escribirDatos() {
        System.out.println(esReescribible ? "Grabando datos en Blu-ray reescribible..." : "Error: Este Blu-ray es solo de lectura.");
    }
}
