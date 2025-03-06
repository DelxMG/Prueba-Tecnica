package impl.others;

import interfaces.PuedeGirar;

/**
 * Representa una rueda.
 */
public class Rueda implements PuedeGirar {

    @Override
    public void girar() {
        System.out.println("La rueda está rodando en el suelo...");
    }
}
