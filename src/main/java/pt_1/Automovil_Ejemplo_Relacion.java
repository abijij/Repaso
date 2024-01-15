package pt_1;

public class Automovil_Ejemplo_Relacion {
    public static void main(String[] args) {

        Rueda[] ruedasSubaru = new Rueda[5];

        for (int i = 0; i < ruedasSubaru.length; i++) {
            ruedasSubaru[i] = new Rueda("Yokohama", 16,7.5);
        }
        Persona conductorPersonaSubaru =  new Persona("Edgar", "Gutierrez Casanas",
                "edgar.abijij24@gmail.com", "Jardines de Guadalupe", "5583955413" );
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.PREMIUM));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setRuedas(ruedasSubaru);
        subaru.setConductor(conductorPersonaSubaru);
        subaru.setRuedas(ruedasSubaru);
        //subaru.setPuertas(puertasSubaru);

        Puerta[] puertasSubaru = new Puerta[4];
        for (int i = 0; i < puertasSubaru.length; i++ ) {
            subaru.addPuerta(new Puerta(2,true,TipoPuerta.MANUAL));
        }

        Rueda[] ruedasMazda = new Rueda[5];

        for (int i = 0; i < ruedasMazda.length; i++) {
            ruedasMazda[i] = new Rueda("Michelin", 18, 10.5);
        }

        Persona conductorPersonaMazda = new Persona("Gabriela", "Ponce Hernandez",
                "gavvpoce1824@gmail.com", "San Juan", "5574024445");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setMotor(new Motor(3.0, TipoMotor.MAGNA));
        mazda.setTanque(new Tanque(99));
        mazda.setConductor(conductorPersonaMazda);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setRuedas(ruedasMazda);
        //mazda.setPuertas(puertasMazda);
        Puerta[] puertasMazda = new Puerta[4];

        for (int i = 0; i < puertasMazda.length; i++) {
            mazda.addPuerta(new Puerta(4, false, TipoPuerta.MANUAL));
        }

        Rueda[] ruedasNissan = new Rueda[4];

        for (int i = 0; i < ruedasNissan.length; i++) {
            ruedasNissan[i] = new Rueda("Pirelli", 20,11.5);
        }

        Puerta[] puertasNissan = new Puerta[2];
        for (int i = 0; i < puertasNissan.length; i++) {
            puertasNissan[i] = new Puerta(2,true,TipoPuerta.AUTOMATICA);
        }
        Persona conductorPersonaNissan =  new Persona ("Edgar Antuan", "Gutierrez Ponce",
                "edgar.abijij27@gmail.com", "Chiautla","57125962");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(2.8, TipoMotor.PREMIUM),
                new Tanque(45),
                conductorPersonaNissan, ruedasNissan, puertasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Rueda[] ruedasNissan2 = new Rueda[5];
            for (int i = 0; i < ruedasNissan2.length; i++) {
                ruedasNissan2[i] = new Rueda("Pirelli",20, 11.5);
            }

            Puerta[] puertasNissan2 = new Puerta[4];
            for (int i = 0; i < puertasNissan2.length; i++) {
                puertasNissan2[i] = new Puerta(4,false,TipoPuerta.MANUAL);
            }


        Persona conductorPersonaNissan2 = new Persona("Karina", "Jaramillo Sandoval",
                "kjs@gmail.com","Providencia","5654545882");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AZUL,
                new Motor(2.2, TipoMotor.DIESEL),
                new Tanque(77),
                conductorPersonaNissan2,ruedasNissan2,puertasNissan2  );

        Automovil auto = new Automovil();

        Automovil.setColorPatente(Color.AMARILLO);

        System.out.println(nissan);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());


    }

}
