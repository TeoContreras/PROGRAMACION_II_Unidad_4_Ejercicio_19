import ORGANIZADOR.SistemaTarifario;
import SUBclases.EnvioAereo;
import SUBclases.EnvioEcologico;
import SUBclases.EnvioTerrestre;
import SUPERclases.MetodoEnvio;

import java.util.ArrayList;
import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        List<MetodoEnvio> opciones = new ArrayList<>();
        opciones.add(new EnvioTerrestre("Terrestre urbano", 300));
        opciones.add(new EnvioAereo("Aéreo nacional", 1500));
        opciones.add(new EnvioEcologico("Bicicleta ecológica", 200));

        SistemaTarifario sistema = new SistemaTarifario();

        double pesoKg = 5;
        double distanciaKm = 120;

        System.out.println("Paquete de " + pesoKg + " kg a " + distanciaKm + " km");
        System.out.println("----------------------------");
        for (MetodoEnvio m : opciones) {
            double presupuesto = sistema.presupuestar(m, pesoKg, distanciaKm);
            System.out.println(m.getNombre() + ": $" + String.format("%.2f", presupuesto));
        }
    }
}
