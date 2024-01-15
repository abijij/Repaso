package pt_1;

import java.util.Arrays;

public class AutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorPersonaSubaru =  new Persona("Edgar", "Gutierrez Casanas",
                "edgar.abijij24@gmail.com", "Jardines de Guadalupe", "5583955413" );
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.PREMIUM));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorPersonaSubaru);



        Persona conductorPersonaMazda = new Persona("Gabriela", "Ponce Hernandez",
                "gavvpoce1824@gmail.com", "San Juan", "5574024445");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setMotor(new Motor(3.0, TipoMotor.MAGNA));
        mazda.setTanque(new Tanque(99));
        mazda.setConductor(conductorPersonaMazda);
        mazda.setTipo(TipoAutomovil.PICKUP);



        Persona conductorPersonaNissan =  new Persona ("Edgar Antuan", "Gutierrez Ponce",
                "edgar.abijij27@gmail.com", "Chiautla","57125962");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(2.8, TipoMotor.PREMIUM),
                new Tanque(45));
         nissan.setConductor(conductorPersonaNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);



        Persona conductorPersonaNissan2 = new Persona("Karina", "Jaramillo Sandoval",
                "kjs@gmail.com","Providencia","5654545882");
        Automovil susuki = new Automovil("Susuki", "Vitara", Color.AZUL,
                new Motor(1.6, TipoMotor.DIESEL),
                new Tanque(50));
        susuki.setConductor(conductorPersonaNissan2);
        susuki.setTipo(TipoAutomovil.SUV);



        Persona conductorPersonaAudi = new Persona("Norma Angelica", "Pedraza  Ortega",
                 "napo@gmial.com","Neza","558913547");

        Automovil audi = new Automovil("Audi", "A3", Color.BLANCO,
        new Motor(8.0, TipoMotor.PREMIUM),
        new Tanque(99));
        audi.setConductor(conductorPersonaAudi);

        Automovil[] autos = new Automovil[5];

        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = susuki;
        autos[4] = audi;


        Arrays.sort(autos);


        for (Automovil auto : autos) {
            System.out.println(auto);
        }



    }

}
