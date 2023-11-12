import java.io.IOException;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args )throws IOException {
		DemoJFileChooser aplication = new DemoJFileChooser();
		aplication.setSize(400,400);
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplication.setVisible(true);
	}

}
