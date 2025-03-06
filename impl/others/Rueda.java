package impl.others;

import interfaces.PuedeGirar;

public class Rueda implements PuedeGirar {

    @Override
    public void girar() {
        System.out.println("La rueda está rodando en el suelo...");
    }
}
