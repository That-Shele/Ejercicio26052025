package oficios;

public class Masajista extends Oficio {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        setTitulacion(titulacion);
        setAniosExperiencia(aniosExperiencia);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse(){
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " viaja con el equipo.");
    }

    public void darMasaje(){
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " da un masaje.");
    }
}
