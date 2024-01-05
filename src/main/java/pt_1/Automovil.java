package pt_1;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Rojo";
    private double cilindrada;
    private int capacidadTanque = 40 ;

    public Automovil() {
    }
    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public  String  detalle(){
        StringBuilder sb = new StringBuilder();

        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
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


}
