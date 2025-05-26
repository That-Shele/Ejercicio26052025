import java.util.Scanner;

import oficios.Entrenador;
import oficios.Futbolista;
import oficios.Masajista;


public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Entrenador entrenador = new Entrenador();
        Futbolista futbolista = new Futbolista();
        Masajista masajista = new Masajista();

        System.out.println("Ingrese el id del entrenador:");
        entrenador.setId(consola.nextInt());
        consola.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Ingrese el nombre del entrenador:");
        entrenador.setNombre(consola.nextLine());
        System.out.println("Ingrese el apellido del entrenador:");
        entrenador.setApellidos(consola.nextLine());
        System.out.println("Ingrese la edad del entrenador:");
        entrenador.setEdad(consola.nextInt());
        System.out.println("Ingrese el ID de federación del entrenador:");
        entrenador.setIdFederacion(consola.nextInt());
        consola.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el id del futbolista:");
        futbolista.setId(consola.nextInt());
        consola.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Ingrese el nombre del futbolista:");
        futbolista.setNombre(consola.nextLine());
        System.out.println("Ingrese el apellido del futbolista:");
        futbolista.setApellidos(consola.nextLine());
        System.out.println("Ingrese la edad del futbolista:");
        futbolista.setEdad(consola.nextInt());
        System.out.println("Ingrese el dorsal(entero) del futbolista:");
        futbolista.setDorsal(consola.nextInt());
        consola.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Ingrese la demarcación del futbolista:");
        futbolista.setDemarcacion(consola.nextLine());

        System.out.println("Ingrese el id del masajista:");
        masajista.setId(consola.nextInt());
        consola.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Ingrese el nombre del masajista:");
        masajista.setNombre(consola.nextLine());
        System.out.println("Ingrese el apellido del masajista:");
        masajista.setApellidos(consola.nextLine());
        System.out.println("Ingrese la edad del masajista:");
        masajista.setEdad(consola.nextInt());
        consola.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Ingrese la titulación del masajista:");
        masajista.setTitulacion(consola.nextLine());
        System.out.println("Ingrese los años de experiencia del masajista:");
        masajista.setAniosExperiencia(consola.nextInt());
        consola.close();

        // Mostrar información de cada oficio
        System.out.println("\nInformación del Entrenador:");
        System.out.println("ID: " + entrenador.getId());
        System.out.println("Nombre: " + entrenador.getNombre());
        System.out.println("Apellidos: " + entrenador.getApellidos());
        System.out.println("Edad: " + entrenador.getEdad());
        System.out.println("ID de Federación: " + entrenador.getIdFederacion());
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.dirigirPartido();
        entrenador.dirigirEntrenamiento();

        System.out.println("\nInformación del Futbolista:");
        System.out.println("ID: " + futbolista.getId());
        System.out.println("Nombre: " + futbolista.getNombre());
        System.out.println("Apellidos: " + futbolista.getApellidos());
        System.out.println("Edad: " + futbolista.getEdad());
        System.out.println("Dorsal: " + futbolista.getDorsal());
        System.out.println("Demarcación: " + futbolista.getDemarcacion());
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.jugarPartido();
        futbolista.entrenar();

        System.out.println("\nInformación del Masajista:");
        System.out.println("ID: " + masajista.getId());
        System.out.println("Nombre: " + masajista.getNombre());
        System.out.println("Apellidos: " + masajista.getApellidos());
        System.out.println("Edad: " + masajista.getEdad());
        System.out.println("Titulación: " + masajista.getTitulacion());
        System.out.println("Años de experiencia: " + masajista.getAniosExperiencia());
        masajista.concentrarse();
        masajista.viajar();
        masajista.darMasaje();
        
    }
}
