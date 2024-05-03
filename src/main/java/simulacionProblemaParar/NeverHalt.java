package simulacionProblemaParar;

//Implementación de un programa que nunca se detiene
//Contador infinito
public class NeverHalt {
    public static void main(String[] args) {
        int numero = 0;
        while (true) {
            System.out.println(numero);
            numero++;
        }
    }
}
