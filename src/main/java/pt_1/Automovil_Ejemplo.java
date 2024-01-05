package pt_1;

public class Automovil_Ejemplo {
    public static void main(String[] args) {


        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");


        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo");
        mazda.setCilindrada(3.0);


        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);


        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println(subaru.acelerar(200));
        System.out.println(mazda.acelerar(300));
        System.out.println(nissan.acelerar(400));

        System.out.println( subaru.frenar());
        System.out.println( mazda.frenar());
        System.out.println(nissan.frenar());

        System.out.println(subaru.acelerarFrenar(200));
        System.out.println(mazda.acelerarFrenar(300));
        System.out.println(nissan.acelerarFrenar(400));

        System.out.println("Kilometros por litro " + subaru.calcularCpnsumo(300, 0.75f));
        System.out.println("Kilometros por litro " + subaru.calcularCpnsumo(300, 75));
        System.out.println("Kilometros por litro " + nissan.calcularCpnsumo(300, 60));

    }
}
