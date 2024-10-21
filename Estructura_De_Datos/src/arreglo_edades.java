import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class arreglo_edades {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame ventana = new JFrame("Registro de Edades");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 300);
        ventana.setLayout(null);

        // Etiqueta y campo de texto para preguntar cuántas edades se van a ingresar
        JLabel etiquetaTamaño = new JLabel("¿Cuántas edades quieres registrar?");
        etiquetaTamaño.setBounds(10, 10, 300, 25);
        ventana.add(etiquetaTamaño);

        JTextField campoTamaño = new JTextField();
        campoTamaño.setBounds(10, 40, 50, 25);
        ventana.add(campoTamaño);

        // Botón para comenzar el registro de edades
        JButton botonTamaño = new JButton("Comenzar");
        botonTamaño.setBounds(70, 40, 100, 25);
        ventana.add(botonTamaño);

        // Área de texto para mostrar las edades ingresadas
        JTextArea areaEdades = new JTextArea();
        areaEdades.setBounds(10, 80, 300, 150);
        areaEdades.setEditable(false);
        ventana.add(areaEdades);

        // Acción del botón
        botonTamaño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tamaño = Integer.parseInt(campoTamaño.getText());
                int[] edades = new int[tamaño];

                for (int i = 0; i < tamaño; i++) {
                    String edadStr = JOptionPane.showInputDialog("Por favor, ingresa la edad #" + (i + 1) + ":");
                    edades[i] = Integer.parseInt(edadStr);
                }

                // Mostrar las edades ingresadas en el área de texto
                StringBuilder resultado = new StringBuilder("¡Gracias! Las edades que registraste son:\n");
                for (int edad : edades) {
                    resultado.append("- ").append(edad).append(" años\n");
                }
                areaEdades.setText(resultado.toString());
            }
        });

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}

