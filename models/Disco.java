package models;

import interfaces.PuedeGirar;

public abstract class Disco extends DispositivoAlmacenamiento implements PuedeGirar {

    private String nombre;
    protected TipoDisco tipoDisco;

    public enum TipoDisco {
        VINILO("Vinilo"),
        CD("CD"),
        BLUERAY("Blue-ray"),
        DISCO_DURO("Disco Duro");

        private final String tipo;

            TipoDisco(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return tipo;
        }
    }

    public Disco(double capacidad, String nombre, String contenido, TipoDisco tipoDisco) {
        super(capacidad, contenido);
        this.nombre = nombre;
        this.tipoDisco = tipoDisco;

    }

    public String getNombre() {
        return nombre;
    }

    public TipoDisco getTipoDisco() {
        return tipoDisco;
    }

    @Override
    public void girar() { // got you!
        System.out.println("El " +  getTipoDisco()  + " está girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("El " + getTipoDisco() + " almacena datos");
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Capacidad: " + getCapacidad() + "GB, Contenido: " + getContenido() + ", Tipo: " + getTipoDisco();
    }
}


