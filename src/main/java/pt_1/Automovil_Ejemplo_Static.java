package pt_1;

import java.sql.SQLOutput;
import java.util.Date;

public class Automovil_Ejemplo_Static {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueStatic(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);



        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setCilindrada(3.0);


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AZUL, 3.5, 50);

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



    }
}
