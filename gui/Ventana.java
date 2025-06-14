import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ventana extends JFrame {
	private JRadioButton radio1;
	private JRadioButton radio2;
	private ButtonGroup grupo;

	public Ventana() {
		super();
		initGui();
	}

	private void initGui() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		this.setPreferredSize(new Dimension(209, 103));
		// crea y agrega el primer radioButton
		radio1 = new JRadioButton();
		getContentPane().add(radio1);
		radio1.setText("Opci�n 1");
		radio1.setBounds(12, 10, 178, 18);
		// crea y agrega el segundo radioButton
		radio2 = new JRadioButton();
		getContentPane().add(radio2);
		radio2.setText("Opci�n 2");
		radio2.setBounds(12, 35, 178, 18);
		// crea un grupo para los radioButton
		
		grupo = new ButtonGroup();
		grupo.add(radio1);
		grupo.add(radio2);
		/*al agregar esas 3 lineas de codigo, solo nos permite seleccionar 1 de las 2 opciones
		 * y esta queda seleccionada siempre sin importar las pulsaciones sobre el mismo
		 */
		pack();
	}
}
