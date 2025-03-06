package models;

import interfaces.PuedeEscribir;
import interfaces.PuedeLeer;

public abstract class DiscoMagnetico extends Disco implements PuedeLeer, PuedeEscribir {

    public DiscoMagnetico(double capacidad, String nombre, String contenido, TipoDisco tipoDisco) {
        super(capacidad, nombre, contenido,tipoDisco);
    }
}
