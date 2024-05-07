package comprobacionProblemaParar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Implementación de un método Reverser que comprueba si el programa se detiene o no haciendo uso de HaltChecker
public class Reverser extends JFrame implements ActionListener {
    private JButton checkButton;

   //Constructor de la calse con la configuración básica de la ventana
    public Reverser() {
        super("Reverser");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        checkButton = new JButton("Comprobar");
        checkButton.addActionListener(this);
        add(checkButton);

        setVisible(true);
    }

    //Método para manejar los eventos de acción
    public void actionPerformed(ActionEvent e) {
        try {
            String codigoPrograma = JOptionPane.showInputDialog(this, "Ingrese el código del programa (countDown o countUp): ");
            if (!codigoPrograma.equals("countDown") && !codigoPrograma.equals("countUp")) {
                throw new IllegalArgumentException("El código del programa debe ser 'countDown' o 'countUp'.");
            }

            String inputString = JOptionPane.showInputDialog(this, "Ingrese la entrada específica para el programa: ");
            int inputNumber = Integer.parseInt(inputString);

            if (inputNumber < 0) {
                throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
            }

            boolean halts = HaltChecker.checkHalt(codigoPrograma, String.valueOf(inputNumber));
            if (halts) {
                JOptionPane.showMessageDialog(this, "El programa se detiene, entramos en un bucle infinito.");
                while (true) {
                    // Bucle infinito
                }
            } else {
                JOptionPane.showMessageDialog(this, "El programa no se detiene, terminamos inmediatamente.");
                System.exit(0);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: La entrada debe ser un número válido.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    //Inicializar la aplicación con una instancia de la clase Reverser
    public static void main(String[] args) {
        new Reverser();
    }
}
