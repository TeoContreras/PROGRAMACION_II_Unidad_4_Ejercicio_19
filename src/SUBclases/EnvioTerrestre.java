package SUBclases;

import SUPERclases.MetodoEnvio;

public class EnvioTerrestre extends MetodoEnvio {
    public EnvioTerrestre(String nombre, double tarifaBase){
        super(nombre, tarifaBase);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        return getTarifaBase() + pesoKg * distanciaKm * 0.04;
    }
}
