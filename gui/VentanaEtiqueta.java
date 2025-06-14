
import java.awt.*;
import javax.swing.*;

public class VentanaEtiqueta extends JFrame {
	// atributo de instancia
	JLabel etiqueta;

	// Constructor
	public VentanaEtiqueta(String tit) {
		super(tit);
		//setTitle("CAFE");
		setSize(400, 300);
		etiqueta = new JLabel();
		etiqueta.setText("cafe");
		etiqueta.setIcon(new ImageIcon(getClass().getResource("imagenes/cafe.gif")));
		getContentPane().setBackground(Color.GREEN);
		getContentPane().add(etiqueta);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}