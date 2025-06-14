import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ConversorGUI extends JFrame implements ActionListener{
    private JLabel metroEtiqueta, kilometroEtiqueta;
    private JTextField metroTxtBox, kMetroTxtBox;
    private JButton boton;
    private JPanel panelControl, panelBoton;

    public ConversorGUI(){
        setTitle("Conversor");
        setLayout(new FlowLayout());
        setSize(250,130);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        armarPanelControl();
        armarPanelBoton();

        getContentPane().add(panelControl);
        getContentPane().add(panelBoton);


        

    }

    public void armarPanelControl(){
        this.metroTxtBox= new JTextField(8);
        this.kMetroTxtBox= new JTextField(8);
        this.metroEtiqueta= new JLabel("Metros");
        this.kilometroEtiqueta= new JLabel("Kilometros");

        this.panelControl= new JPanel();
        panelControl.setLayout(new GridLayout(2,2));
        panelControl.add(metroEtiqueta);
        panelControl.add(metroTxtBox);
        panelControl.add(kilometroEtiqueta);
        panelControl.add(kMetroTxtBox);
    }

    private void armarPanelBoton(){
        panelBoton = new JPanel();
        boton= new JButton("Convertir");
        boton.addActionListener(this);
        panelBoton.setLayout(new FlowLayout());
        panelBoton.add(boton);
    }


public void actionPerformed(ActionEvent e) {
    // Si el campo de metros tiene valor, convierte a kilómetros
    if (!metroTxtBox.getText().isEmpty()) {
        try {
            double metros = Double.parseDouble(metroTxtBox.getText());
            double kilometros = metros / 1000.0;
            kMetroTxtBox.setText(Double.toString(kilometros));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en Metros.");
        }
    }
    // Si el campo de kilómetros tiene valor, convierte a metros
    else if (!kMetroTxtBox.getText().isEmpty()) {
        try {
            double kilometros = Double.parseDouble(kMetroTxtBox.getText());
            double metros = kilometros * 1000.0;
            metroTxtBox.setText(Double.toString(metros));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en Kilómetros.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Ingrese un valor para convertir.");
    }
}



}
