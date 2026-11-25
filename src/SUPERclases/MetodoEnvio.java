package SUPERclases;

public abstract class MetodoEnvio {
    private String nombre;
    private double tarifaBase;

    public MetodoEnvio(String nombre, double tarifaBase){
        this.nombre = nombre;
        this.tarifaBase = tarifaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public abstract double calcularTarifa(double pesoKg, double distanciaKm);
}
