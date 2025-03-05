public class Main {

    public static void main(String[] args) {

        try {
            Cd miCd = new Cd(4.7, "Mi CD Favorito", "Música");
            DiscoDuro miDiscoDuro = new DiscoDuro(500, "SSD Kingston", "Sistema Operativo");

            System.out.println(miCd);
            miCd.girarDisco();
            miCd.leerDatos();
            miCd.escribirDatos();
            miCd.almacenarDatos();

            System.out.println();

            System.out.println(miDiscoDuro);
            miDiscoDuro.girarDisco();
            miDiscoDuro.leerDatos();
            miDiscoDuro.escribirDatos();
            miDiscoDuro.almacenarDatos();

        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
