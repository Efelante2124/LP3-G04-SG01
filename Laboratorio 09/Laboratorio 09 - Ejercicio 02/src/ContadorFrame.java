import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContadorFrame extends JFrame{
	private JLabel etiqueta1;
	private final JTextField campoT;
	
	public ContadorFrame() {
		super("Detalles de archivo");
		setLayout(new FlowLayout());
		etiqueta1 = new JLabel("Ingrese la direccion del archivo: ");
		campoT = new JTextField(25);
		add(etiqueta1);
		add(campoT);
		ManejadorCampoTexto manejador = new ManejadorCampoTexto();
		campoT.addActionListener(manejador);
	}
	private class ManejadorCampoTexto implements ActionListener{
		FileReader fr =null;
		
		@Override
		public void actionPerformed(ActionEvent evento) {
			try {
				int numeroDeLineas=0;
				int numeroDeChars=0;
				int numeroDePalabras=0;
				fr = new FileReader(evento.getActionCommand());
				BufferedReader entrada = new BufferedReader(fr);
				File archivo = new File(evento.getActionCommand());
				String nombreArchivo = archivo.getName();
				String linea;
				while ((linea = entrada.readLine()) != null) {
				    numeroDeLineas++;
				    numeroDeChars += linea.length();
				    String[] palabras = linea.split("\\s+");
				    numeroDePalabras += palabras.length;
				}
				String inf = String.format("File: %s\nLines: %s\nWords: %s\nChars: %s",nombreArchivo, numeroDeLineas, numeroDePalabras, numeroDeChars);
				JOptionPane.showMessageDialog(null, inf);
			}
			catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch (IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			finally {
				try {
					if(fr!=null) {
						fr.close();
					}
				}
				catch(IOException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		}
	}
}
