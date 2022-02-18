import java.util.ArrayList;

class Persona {
    //atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private int dni;
    private String domicilio;
    private ArrayList<String> personas = new ArrayList<String>();

    //constructores
    //constructor vacio
    public Persona(){
        this.nombre = "Maria";
        this.edad = 25;
        personas.addAll(personas);
    }
    //contructor a rellenar
    public Persona(String nombre, String apellidos, int edad, int dni, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.domicilio = domicilio;
        personas.addAll(personas);
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    //metodos
    public void eliminar(String persona){
        if (personas.equals(persona)) {
            personas.remove(persona);
        }
    }
   
}
