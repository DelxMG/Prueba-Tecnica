package main;

import impl.discos.*;
import impl.others.Frisbee;
import impl.others.Rueda;

/**
 * Clase principal que ejecuta pruebas sobre dispositivos de almacenamiento.
 */
public class Main {
    public static void main(String[] args) {

        try {
            // Crear un CD (puede leer y escribir)
            Cd miCd = new Cd(0.7, "CD de Música", "Canciones de los 80");

            // Crear un Blu-ray (solo lectura o reescribible)
            BlueRay miBluRay = new BlueRay(25, "Película Blu-ray", "Interstellar", false);
            BlueRay miBluRayRW = new BlueRay(50, "Blu-ray Reescribible", "Datos Backup", true);

            // Crear un LP (solo lectura, analógico)
            Lp miLp = new Lp(1, "Vinilo Clásico", "Beethoven Symphony");

            // Crear un Disco Duro (puede leer, escribir y almacenar)
            DiscoDuro miDiscoDuro = new DiscoDuro(500, "SSD Kingston", "Sistema Operativo");

            // Crear un frisbee y una rueda (pueden girar)
            Rueda rueda = new Rueda();
            Frisbee frisbee = new Frisbee();


            // CD
            System.out.println("\nProbando CD:");
            miCd.girar();
            miCd.almacenarDatos();
            miCd.leerDatos();
            miCd.escribirDatos();
            System.out.println(miCd);

            // Blu-ray (solo lectura)
            System.out.println("\nProbando Blu-ray:");
            miBluRay.girar();
            miBluRay.almacenarDatos();
            miBluRay.leerDatos();
            miBluRay.escribirDatos(); // Debería dar error porque no es reescribible.
            System.out.println(miBluRay);

            // Blu-ray Reescribible
            System.out.println("\nProbando Blu-ray Reescribible:");
            miBluRayRW.girar();
            miBluRayRW.almacenarDatos();
            miBluRayRW.leerDatos();
            miBluRayRW.escribirDatos(); // Este sí puede escribir.
            System.out.println(miBluRayRW);

            // LP
            System.out.println("\nProbando Vinilo:");
            miLp.girar();
            miLp.almacenarDatos();
            miLp.leerDatos();
            System.out.println(miLp);

            // Disco Duro
            System.out.println("\nProbando Disco Duro:");
            miDiscoDuro.girar();
            miDiscoDuro.almacenarDatos();
            miDiscoDuro.leerDatos();
            miDiscoDuro.escribirDatos();
            System.out.println(miDiscoDuro);

            // Frisbee
            System.out.println("\nProbando frisbee: ");
            frisbee.girar();
            // Rueda
            System.out.println("\nProbando rueda: ");
            rueda.girar();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}