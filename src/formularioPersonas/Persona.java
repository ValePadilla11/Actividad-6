package formularioPersonas;

public class Persona {

    private String nombre; 
    private String apellidos;
    private final String cedula;
    public Persona(String nombre, String apellido, String cedula) {
        this.nombre=nombre;
        this.apellidos = apellido;
        this.cedula = cedula;
    }
public String getNombre() {
    return nombre;}
public String getApellidos() {
    return apellidos;}
public String getCedula() {
    return cedula;}
    } 
   
