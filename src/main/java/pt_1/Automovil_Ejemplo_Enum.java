package pt_1;

public class Automovil_Ejemplo_Enum {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueStatic(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.MAGNA));
        subaru.setTanque(new Tanque(55));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Motor motorMazda = new Motor(3.0,TipoMotor.PREMIUM);
        Tanque tanqueMazda = new Tanque(100);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setMotor(motorMazda);
        mazda.setTanque(tanqueMazda);
        mazda.setTipo(TipoAutomovil.PICKUP);


        TipoAutomovil tipo = subaru.getTipo();
        TipoAutomovil desSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipo.getNombre());
        System.out.println("Descripcion subaru: " + desSubaru.getDescripcion());

        tipo =  mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automovil es  deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es automovil es pequeño de do puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es automovil utilitario de transporte de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediado compacto de aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil mas grande con cajuela grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + " , " +
                ta.getNombre() + " , " +
                    ta.getDescripcion() +" , " +
                        ta.getNumeroPuerta());
            System.out.println();
        }

    }
}
