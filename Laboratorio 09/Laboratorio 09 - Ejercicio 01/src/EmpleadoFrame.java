import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class EmpleadoFrame extends JFrame {
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JButton boton1;
    private JTable tabla1;

    public EmpleadoFrame() {
        super("Empleado");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // Añade márgenes a los lados

        etiqueta1 = new JLabel("Datos del empleado");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(etiqueta1, gbc);

        etiqueta2 = new JLabel("Número");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(etiqueta2, gbc);
        campoTexto1 = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        panel.add(campoTexto1, gbc);

        etiqueta3 = new JLabel("Nombre");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(etiqueta3, gbc);
        campoTexto2 = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        panel.add(campoTexto2, gbc);

        etiqueta4 = new JLabel("Sueldo");
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(etiqueta4, gbc);
        campoTexto3 = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        panel.add(campoTexto3, gbc);

        boton1 = new JButton("Agregar empleado");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(boton1, gbc);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("   ");
        modelo.addColumn("Numero");
        modelo.addColumn("Nombre");
        modelo.addColumn("Sueldo");
        tabla1 = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla1);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(scrollPane, gbc);

        add(panel);
    }
}

//etiqueta2 = new JLabel("Etiqueta con texto e icono", insecto,
//SwingConstants.LEFT);
//etiqueta2.setToolTipText("Esta es etiqueta2");
//add(etiqueta2);
