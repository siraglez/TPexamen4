package comprobacionProblemaParar;

//Interfaz del observador para aplicar el patrón Observer
public interface HaltCheckerInterface {
    boolean checkHalt(String codigoPrograma, String input);
}
