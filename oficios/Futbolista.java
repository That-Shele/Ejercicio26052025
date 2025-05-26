package oficios;

public class Futbolista extends Oficio {
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        setDorsal(dorsal);
        setDemarcacion(demarcacion);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " se concentra para el partido.");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " viaja con el equipo para el partido.");
    }

    public void jugarPartido(){
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " está jugando un partido.");
    }

    public void entrenar() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " está entrenando.");
    }
}
