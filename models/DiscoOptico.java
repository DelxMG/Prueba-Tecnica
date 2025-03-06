package models;

import interfaces.PuedeEscribir;
import interfaces.PuedeLeer;

public abstract class DiscoOptico extends Disco implements PuedeLeer, PuedeEscribir {

    public DiscoOptico(double capacidad, String nombre, String contenido, TipoDisco tipoDisco) {
        super(capacidad, nombre, contenido, tipoDisco);
    }
}
