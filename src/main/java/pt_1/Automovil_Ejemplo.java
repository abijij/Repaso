package pt_1;

import java.util.Date;

public class Automovil_Ejemplo {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.DIESEL);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque(60));
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.MAGNA);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setMotor(motorMazda);
        mazda.setTanque(new Tanque(45));


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL) ,new Tanque(80));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.0, TipoMotor.PREMIUM) , new Tanque(99));

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
