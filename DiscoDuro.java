public class DiscoDuro extends Disco implements DispositivoAlmacenamiento {

    public DiscoDuro (double capacidad, String nombre, String contenido){
        super(capacidad, nombre, contenido);
        this.tipoDisco = "Disco Duro";
    }

    @Override
    public void girarDisco() {
        System.out.println("El disco duro gira...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del disco duro con un cabezal magnético...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el disco duro con un cabezal magnético...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Los datos han sido almacenados en el disco duro.");
    }
}



