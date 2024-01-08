package pt_1;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.BLANCO;
    private double cilindrada;
    private  int capacidadTanque = 40 ;
    private static  int capacidadTanqueStatic = 30;
    private static Color colorPatente = Color.NARANJA ;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static  final int  VELOCIDAD_MAXIMA_CIUDAD = 60;
    public static  final String COLOR_ROJO = "Rojo";
    public static  final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    private  static int ultimoId;

    public Automovil() {
        this.id= ++ultimoId;
    }
    public Automovil(String fabricante, String modelo) {
         this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueStatic() {
        return capacidadTanqueStatic;
    }

    public static void setCapacidadTanqueStatic(int capacidadTanqueStatic) {
        Automovil.capacidadTanqueStatic = capacidadTanqueStatic;
    }

    public  String  detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.id = " + this.id);
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.patenteColor = " + Automovil.colorPatente.getColor() );
        sb.append("\nauto.cilindrada = " + this.cilindrada);

        return sb.toString();
    }

    public String acelerar (int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public  String frenar(){
        return this.fabricante + " " + this.modelo + " Freanado!";
    }

    public String acelerarFrenar (int rpm){
        String acelerar = this.acelerar(rpm);

        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularCpnsumo ( int km, float porcentajeGasolina){

        return km/(capacidadTanque* porcentajeGasolina);

    }

    public float calcularCpnsumo ( int km, int porcentajeGasolina){

        return km/(capacidadTanque* (porcentajeGasolina/100f));

    }

    public static float calcularCpnsumoStatic ( int km, int porcentajeGasolina){

        return km/(Automovil.capacidadTanqueStatic * (porcentajeGasolina/100f));

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil)obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()) );
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
