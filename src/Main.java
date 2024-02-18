import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        // Creacion de variables
        double capacidadBus = 0;
        double estudiantesGordos = 0;
        double estudiantesFlacos = 0;
        int cantBuses = 0;

        // Metodo para la lectura de las cantidades
        Scanner lectura =  new Scanner(System.in);

        //Captura de la capacidad del bus
        System.out.println("Ingrese la capacidad del bus: ");
        capacidadBus = Double.parseDouble(lectura.next());

        //Captura de los estudiantes gordos
        System.out.println("Ingrese la cantidad de los estudiantes gordos: ");
        estudiantesGordos = Double.parseDouble(lectura.next());

        // Captura de los estudiantes flacos
        System.out.println("Ingrese la cantidad de los estudiantes flacos");
        estudiantesFlacos = Double.parseDouble(lectura.next());

        // Evaluacion de la formula
        cantBuses = (int)Math.ceil(((estudiantesGordos*2)+estudiantesFlacos)/capacidadBus);

        // Presentacion del resultado
        System.out.println("Se requieren de "+cantBuses+" buses para el paseo");
    }

}
