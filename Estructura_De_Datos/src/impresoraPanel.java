import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class impresoraPanel extends JFrame {

    private Queue<String> colaImpresion = new LinkedList<>();
    private JTextArea areaTexto;
    private JTextField campoCantidad, campoArchivo;
    private JButton botonAgregar, botonImprimir;
    private int cantidadArchivos;
    private int archivosIngresados = 0;

    public impresoraPanel() {
        // Configuración de la ventana
        setTitle("Simulador de Impresora");
        setSize(500, 400); // Ajustamos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana
        setLayout(new GridBagLayout()); // Usamos GridBagLayout para una mejor distribución

        // Configurar restricciones para el layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL; // Expandir horizontalmente

        // Etiqueta y campo para la cantidad de archivos
        JLabel etiquetaCantidad = new JLabel("Cantidad de archivos a imprimir: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaciado
        add(etiquetaCantidad, gbc);

        campoCantidad = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(campoCantidad, gbc);

        // Etiqueta y campo para el nombre del archivo
        JLabel etiquetaArchivo = new JLabel("Nombre del archivo: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(etiquetaArchivo, gbc);

        campoArchivo = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(campoArchivo, gbc);

        // Botón para agregar archivo
        botonAgregar = new JButton("Agregar archivo");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(botonAgregar, gbc);

        // Botón para iniciar impresión
        botonImprimir = new JButton("Imprimir");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(botonImprimir, gbc);

        // Área de texto para mostrar la cola y estado de impresión
        areaTexto = new JTextArea(10, 30); // Más espacio en el área de texto
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true); // Ajustar el texto para no cortar palabras
        JScrollPane scrollPane = new JScrollPane(areaTexto); // Añadir scroll en caso de sobrepasar el área
        gbc.gridwidth = 2; // Ocupa dos columnas
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH; // Expandir en ambas direcciones
        add(scrollPane, gbc);

        // Acción del botón "Agregar archivo"
        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarArchivo();
            }
        });

        // Acción del botón "Imprimir"
        botonImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imprimirArchivos();
            }
        });
    }

    private void agregarArchivo() {
        try {
            if (archivosIngresados == 0) {
                cantidadArchivos = Integer.parseInt(campoCantidad.getText());
                areaTexto.append("Cantidad de archivos a imprimir: " + cantidadArchivos + "\n");
            }

            if (archivosIngresados < cantidadArchivos) {
                String nombreArchivo = campoArchivo.getText();
                if (!nombreArchivo.isEmpty()) {
                    colaImpresion.add(nombreArchivo);
                    archivosIngresados++;
                    areaTexto.append("Archivo agregado: " + nombreArchivo + "\n");
                    campoArchivo.setText(""); // Limpiar el campo de texto
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese un nombre de archivo válido.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ya se han ingresado todos los archivos.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.");
        }
    }

    private void imprimirArchivos() {
        if (colaImpresion.isEmpty()) {
            areaTexto.append("No hay archivos en la cola de impresión.\n");
            return;
        }

        new Thread(() -> {
            while (!colaImpresion.isEmpty()) {
                try {
                    String archivoActual = colaImpresion.peek();
                    areaTexto.append("Imprimiendo archivo: " + archivoActual + "\n");
                    Thread.sleep(2000);  // Simular 2 segundos de impresión
                    colaImpresion.remove();  // Eliminar archivo impreso
                } catch (InterruptedException e) {
                    areaTexto.append("Error en la impresión.\n");
                }
            }
            areaTexto.append("Todos los archivos han sido impresos.\n");
        }).start();
    }

    public static void main(String[] args) {
        // Mostrar la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new impresoraPanel().setVisible(true);
            }
        });
    }
}
