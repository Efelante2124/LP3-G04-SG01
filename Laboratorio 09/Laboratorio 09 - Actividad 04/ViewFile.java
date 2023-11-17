import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ViewFile extends JFrame{
	private JTextArea areaTexto;

	public ViewFile(String s){
		super("Mostrando el contenido del archivo");
		areaTexto = new JTextArea(s,5,40);
		add(areaTexto);
	}
}