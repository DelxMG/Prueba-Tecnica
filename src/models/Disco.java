package models;

import interfaces.PuedeGirar;

/**
 * Clase abstracta que representa un disco de almacenamiento.
 */

public abstract class Disco extends DispositivoAlmacenamiento implements PuedeGirar {

    private String nombre;
    protected TipoDisco tipoDisco;


    /**
     * Enum que representa los diferentes tipos de discos.
     */
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


    /**
     * Constructor de la clase Disco.
     *
     * @param capacidad   Capacidad del disco en GB.
     * @param nombre      Nombre del disco.
     * @param contenido   Contenido almacenado en el disco.
     * @param tipoDisco   Tipo de disco.
     */
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
    public void girar() {
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


