package comprobacionProblemaParar;

import java.util.Scanner;


//Implementación de un método Reverser que comprueba si el programa se detiene o no haciendo uso de HaltChecker
public class Reverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar el código del programa
        System.out.println("Ingrese el código del programa (countDown o countUp): ");
        String codigoPrograma = scanner.nextLine();

        //Solicitar la entrada específica para el programa
        System.out.println("Ingrese la entrada específica para el programa: ");
        String input = scanner.nextLine();

        scanner.close();

        boolean halts = HaltChecker.checkHalt(codigoPrograma, input);
        if (halts) {
            //Si el programa se detiene, entramos en un bucle infinito
            System.out.println("El programa se detiene, entramos en un bucle infinito.");
            while (true) {
                //Bucle infinito
            }
        } else {
            //Si el programa no se detiene, terminamos inmediatamente
            System.out.println("El programa no se detiene, terminamos inmediatamente.");
            System.exit(0);
        }
    }
}
