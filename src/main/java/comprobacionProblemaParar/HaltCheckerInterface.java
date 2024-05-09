package comprobacionProblemaParar;

//Interfaz para aplicar el patrón chain of responsibility
public interface HaltCheckerInterface {
    boolean checkHalt(String codigoPrograma, String input);
}
