package simulacionProblemaParar;

//Implementación de un programa que se detiene inevitablemente
//Contador regresivo
public class InevitableHalt {
    public static void main(String[] args) {
        int numero = 10;
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }
}
