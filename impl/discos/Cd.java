package impl.discos;

import interfaces.PuedeEscribir;
import models.DiscoOptico;

public class Cd extends DiscoOptico {

    public Cd (double capacidad, String nombre, String contenido) {
        super(capacidad, nombre, contenido, TipoDisco.CD);
    }

    @Override
    public void girar() {
        System.out.println("El CD gira...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del CD...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el CD con un láser...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Los datos han sido almacenados en el CD.");
    }
}


