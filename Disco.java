
public abstract class Disco {
    private double capacidad;
    private String nombre;
    private String contenido;
    protected String tipoDisco;


    public Disco(double capacidad, String nombre, String contenido) {

        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }

        this.capacidad = capacidad;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public void setCapacidad(double capacidad) {

        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }
        this.capacidad = capacidad;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Capacidad: " + capacidad + " GB, Contenido: " + contenido + " tipo de disco: " + tipoDisco;
    }

}
