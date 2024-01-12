package pt_1;

public class Puerta {

    private int total;
    private boolean automatica;
    private TipoPuerta tipo;

    public Puerta(int total, boolean automatica, TipoPuerta tipo) {
        this.total = total;
        this.automatica = automatica;
        this.tipo = tipo;
    }

    public int getTotal() {
        return total;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public TipoPuerta getTipo() {
        return tipo;
    }
}
