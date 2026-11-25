package SUBclases;

import SUPERclases.MetodoEnvio;

public class EnvioAereo extends MetodoEnvio {
    public EnvioAereo(String nombre, double tarifaBase){
        super(nombre, tarifaBase);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        // Incluye un recargo fijo de combustible
        return getTarifaBase() + pesoKg * distanciaKm * 0.15 + 800;
    }
}
