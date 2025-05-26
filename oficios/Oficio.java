package oficios;

public class Oficio implements IAccionOficio {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Oficio() {

    }

    public Oficio(int id, String nombre, String apellidos, int edad) {
        setId(id);
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrándose en el oficio.");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando para realizar el oficio.");
    }
    
}
