package oficios;

public class Entrenador extends Oficio {
    private int idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        setIdFederacion(idFederacion);
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " está ooncentrándose en la estrategia del equipo.");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " está viajando con el equipo para el próximo partido.");
    }

    public void dirigirPartido() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " está dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " está dirigiendo el entrenamiento del equipo.");
    }
}
