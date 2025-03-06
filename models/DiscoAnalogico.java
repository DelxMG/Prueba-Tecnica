package models;

import interfaces.PuedeLeer;

public abstract class DiscoAnalogico extends Disco implements PuedeLeer {

    public DiscoAnalogico(double capacidad, String nombre, String contenido, TipoDisco tipoDisco) {
        super(capacidad, nombre, contenido, tipoDisco);
    }
}
