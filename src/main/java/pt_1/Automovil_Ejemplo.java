package pt_1;

import java.util.Date;

public class Automovil_Ejemplo {
    public static void main(String[] args) {


        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setCilindrada(3.0);


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil auto = new Automovil();

        Date fecha = new Date();


        System.out.println("Son iguales? : " + (nissan == nissan2) );

        System.out.println("Son iguales? : " + (nissan.equals(nissan2)) );

        System.out.println("Son iguales? : " + (auto.equals(nissan)) );

        System.out.println("Son iguales? : " + (auto.equals(fecha)) );

        System.out.println(nissan);

        System.out.println(nissan.toString());

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
