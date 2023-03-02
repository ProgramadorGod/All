import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        // Crear un nuevo marco
        JFrame frame = new JFrame("Ejemplo de interfaz gráfica de usuario (GUI) muy compleja");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear un menú "Archivo" con opciones "Abrir" y "Cerrar"
        JMenu fileMenu = new JMenu("Archivo");
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem closeItem = new JMenuItem("Cerrar");
        fileMenu.add(openItem);
        fileMenu.add(closeItem);
        menuBar.add(fileMenu);

        // Crear un menú "Editar" con opciones "Copiar" y "Pegar"
        JMenu editMenu = new JMenu("Editar");
        JMenuItem copyItem = new JMenuItem("Copiar");
        JMenuItem pasteItem = new JMenuItem("Pegar");
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        menuBar.add(editMenu);

        // Crear un menú "Ayuda" con una opción "Acerca de"
        JMenu helpMenu = new JMenu("Ayuda");
        JMenuItem aboutItem = new JMenuItem("Acerca de");
        helpMenu.add(aboutItem);
        menuBar.add(helpMenu);

        // Agregar la barra de menú al marco
        frame.setJMenuBar(menuBar);

        // Crear un nuevo panel principal con un BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        // Crear un nuevo JTabbedPane con varias pestañas
        JTabbedPane tabbedPane = new JTabbedPane();
        panel.add(tabbedPane, BorderLayout.CENTER);

        // Crear una nueva pestaña "Tabla"
        JPanel tablePanel = new JPanel(new BorderLayout());
        tabbedPane.addTab("Tabla", tablePanel);

        // Crear un nuevo DefaultTableModel para la JTable
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Edad");

        // Crear una nueva JTable con el DefaultTableModel y agregarla al tablePanel
        JTable table = new JTable(tableModel);
        tablePanel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Crear una nueva pestaña "Gráfico"
        JPanel graphPanel = new JPanel(new BorderLayout());
        tabbedPane.addTab("Gráfico", graphPanel);

        // Crear un nuevo gráfico con datos aleatorios
        int[] data = new int[10];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        // Crear una nueva pestaña "Barra de progreso"
        JPanel progressPanel = new JPanel(new BorderLayout());
        tabbedPane.addTab("Barra de progreso", progressPanel);

        // Crear una nueva barra de progreso y agregarla al progressPanel
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressPanel.add(progressBar, BorderLayout.CENTER);

        // Crear un nuevo panel de formulario para la pestaña "Formulario"
        JPanel formPanel = new JPanel();
        // Mostrar el marco
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
