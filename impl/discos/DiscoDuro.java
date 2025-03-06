package impl.discos;

import interfaces.PuedeEscribir;
import models.Disco;
import models.DiscoMagnetico;

public class DiscoDuro extends DiscoMagnetico implements PuedeEscribir {

    public DiscoDuro (double capacidad, String nombre, String contenido){
        super(capacidad, nombre, contenido, TipoDisco.DISCO_DURO);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del disco duro con un cabezal magnético...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el disco duro con un cabezal magnético...");
    }
}



