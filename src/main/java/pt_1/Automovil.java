
package pt_1;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.BLANCO;
    private Motor motor ;
    private  Tanque tanque ;

    private Persona conductor;

    private Rueda[] ruedas;
    private Puerta[] puertas;
    private static  int capacidadTanqueStatic = 30;
    private static Color colorPatente = Color.NARANJA ;
    private TipoAutomovil tipo;

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

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante,modelo,color,motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas, Puerta[] puertas) {
        this(fabricante,modelo,color,motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
        this.puertas = puertas;
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

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {

        if (tanque == null) {
            this.tanque = new Tanque();
        }

        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }


    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }

    public  String  detalle(){
        String verdetalle = "auto.id: "   + this.id +
                "\nauto.fabricante: " + this.getFabricante() +
                "\nauto.modelo: " + this.getModelo();
        if (this.getTipo() != null){
            verdetalle +="\nauto.tipo: " + this.getTipo().getDescripcion();
        }
            verdetalle += "\nauto.color: " + this.color +
                 "\nauto.patenteColor: " + colorPatente;
                        if (this.motor !=null){
                            verdetalle += "\nauto.cilindrada: " + this.motor.getCilindrada();
                        }

        return verdetalle;
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

        return km/(this.getTanque().getCapacidad()* porcentajeGasolina);

    }

    public float calcularCpnsumo ( int km, int porcentajeGasolina){

        return km/(tanque.getCapacidad()* (porcentajeGasolina/100f));

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
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadTanque=" + tanque.getCapacidad() +
                '}';
    }
}
