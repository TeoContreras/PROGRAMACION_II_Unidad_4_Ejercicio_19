package SUBclases;

import SUPERclases.MetodoEnvio;

public class EnvioEcologico extends MetodoEnvio {
    public EnvioEcologico(String nombre, double tarifaBase){
        super(nombre, tarifaBase);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        // Descuento del 10% por ser un envío sin emisiones
        double costo = getTarifaBase() + pesoKg * distanciaKm * 0.03;
        return costo - costo * 0.10;
    }
}
