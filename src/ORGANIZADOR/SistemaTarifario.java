package ORGANIZADOR;

import SUPERclases.MetodoEnvio;

public class SistemaTarifario {

    public double presupuestar(MetodoEnvio metodo, double pesoKg, double distanciaKm){
        return metodo.calcularTarifa(pesoKg, distanciaKm);
    }
}
