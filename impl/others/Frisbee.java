package impl.others;

import interfaces.PuedeGirar;

public class Frisbee implements PuedeGirar {

    @Override
    public void girar() {
        System.out.println("El frisbee está girando en el aire...");
    }
}
