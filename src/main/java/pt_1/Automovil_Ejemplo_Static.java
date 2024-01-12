package pt_1;

import java.sql.SQLOutput;
import java.util.Date;

public class Automovil_Ejemplo_Static {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueStatic(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.PREMIUM));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setMotor(new Motor(3.0, TipoMotor.MAGNA));
        mazda.setTanque(new Tanque(99));
        mazda.setTipo(TipoAutomovil.PICKUP);


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(2.8, TipoMotor.PREMIUM),
                new Tanque(45));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AZUL,
                new Motor(2.2, TipoMotor.DIESEL),
                new Tanque(77));

        Automovil auto = new Automovil();

        Automovil.setColorPatente(Color.AMARILLO);

        System.out.println(nissan);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());

        System.out.println("Kilometros por litro: " + Automovil.calcularCpnsumoStatic(300, 60));

        System.out.println("Velocidad Maxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad Maxima ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        TipoAutomovil desSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Descripcion subaru: " + desSubaru.getDescripcion());

        System.out.println(mazda.calcularCpnsumo(300, 70));

    }

}
