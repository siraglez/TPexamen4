package comprobacionProblemaParar;

//Implementación de un método que comprueba si el programa se detiene o no
public class HaltChecker {
    public static boolean checkHalt(String codigoPrograma, String input) {
        //Simulación del HaltChecker
        //Verifica si el programa cuenta hacia abajo desde un número específico
        //Si la entrada es mayor que 0, asumimos que el programa se detendrá
        int inputNumber = Integer.parseInt(input);
        if (codigoPrograma.equals("countDown") && inputNumber > 0) {
            return true;
        }
        //De lo contrario, asumimos que el programa no se detiene
        return false;
    }
}
