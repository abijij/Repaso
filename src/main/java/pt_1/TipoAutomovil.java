package pt_1;

public enum TipoAutomovil {

    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto depoprtivo", 2),
    FURGON("Furgon", "Auto utilitqario", 3);

    private final String nombre;

    private final String descripcion;
    private final int numeroPuerta;


    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }
}
