package pt_1;

public class Persona {

    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String apellido, String correo, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return
                "\nnombre: " + nombre + '\n' +
                "apellido: " + apellido + '\n' +
                "correo: " + correo + '\n' +
                "direccion: " + direccion + '\n' +
                "telefono: " + telefono + '\n' +
                '}';
    }
}
