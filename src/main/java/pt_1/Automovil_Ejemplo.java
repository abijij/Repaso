package pt_1;

public class Automovil_Ejemplo {
    public static void main(String[] args) {


        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");


        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());

        System.out.println(subaru.acelerar(200));
        System.out.println(mazda.acelerar(300));

        System.out.println( subaru.frenar());
        System.out.println( mazda.frenar());

        System.out.println(subaru.acelerarFrenar(200));
        System.out.println(mazda.acelerarFrenar(300));

        System.out.println("Kilometros por litro " + subaru.calcularCpnsumo(300, 0.75f));
        System.out.println("Kilometros por litro " + subaru.calcularCpnsumo(300, 75));
    }
}
