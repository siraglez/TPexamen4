package comprobacionProblemaParar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Implementación de un método Reverser que comprueba si el programa se detiene o no haciendo uso de HaltChecker
public class Reverser extends JFrame implements ActionListener {
    private JButton checkButton;

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

    public void actionPerformed(ActionEvent e) {
        String codigoPrograma = JOptionPane.showInputDialog(this, "Ingrese el código del programa (countDown o countUp): ");
        String input = JOptionPane.showInputDialog(this, "Ingrese la entrada específica para el programa: ");

        boolean halts = HaltChecker.checkHalt(codigoPrograma, input);
        if (halts) {
            JOptionPane.showMessageDialog(this, "El programa se detiene, entramos en un bucle infinito.");
            while (true) {
                //Bucle infinito
            }
        } else {
            JOptionPane.showMessageDialog(this, "El programa no se detiene, terminamos inmediatamente.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Reverser();
    }
}
