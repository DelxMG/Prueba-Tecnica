package impl.others;

import interfaces.PuedeGirar;

/**
 * Representa un Frisbee.
 */
public class Frisbee implements PuedeGirar {

    @Override
    public void girar() {
        System.out.println("El frisbee está girando en el aire...");
    }
}
