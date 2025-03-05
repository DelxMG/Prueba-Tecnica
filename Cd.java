public class Cd extends Disco implements DispositivoAlmacenamiento {

    public Cd (double capacidad, String nombre, String contenido) {
        super(capacidad, nombre, contenido);
        this.tipoDisco = "CD";
    }

    @Override
    public void girarDisco() {
        System.out.println("El CD gira...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del CD con un láser...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el CD con un láser...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Los datos han sido almacenados en el CD.");
    }
}


