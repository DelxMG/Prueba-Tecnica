package impl.discos;

import models.DiscoAnalogico;

public class Lp extends DiscoAnalogico {

    public Lp(double capacidad, String nombre, String contenido) {
        super(capacidad, nombre, contenido, TipoDisco.VINILO);
    }

    @Override
    public void leerDatos(){
        System.out.println("Reproduciendo sonido del vinilo...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Grabando sonido en el vinilo mediante un proceso analógico...");
    }
}
