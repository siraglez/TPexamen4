package comprobacionProblemaParar;

//Implementación de un método que comprueba si el programa se detiene o no
public class HaltChecker {
    public static boolean checkHalt(String codigoPrograma, String input) {
        //Implementación simulada del HaltChecker
        //En este ejemplo, se verifica si el programa cuenta hacia abajo desde un número específico
        //Si la entrada es 10, asumimos que el programa se detendrá
        if (codigoPrograma.equals("countDown") && input.equals("10")) {
            return true;
        }
        //De lo contrario, asumimos que el programa no se detiene
        return false;
    }
}
