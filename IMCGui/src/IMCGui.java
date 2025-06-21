import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class IMCGui extends  JFrame{
    private JTextField txtPeso,txtAltura,txtIMC;
    private JButton btnConversor;
    private JPanel panelTxtBox,panelBoton;
    private JLabel ePeso,eAltura,eImc;

    public IMCGui(){
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
        armarPanelControl();
        armarPanelBtn();
        getContentPane().add(panelTxtBox);
        getContentPane().add(panelBoton);

    }
    private void armarPanelControl(){
        txtPeso= new JTextField(8);
        txtAltura= new JTextField(8);
        txtIMC= new JTextField(8);
        txtIMC.disable();
        ePeso= new JLabel("Peso (kg)");
        eAltura= new JLabel("Altura (cm)");
        eImc= new JLabel("IMC");
        panelTxtBox= new JPanel();
        panelTxtBox.setLayout(new GridLayout(3,2));
        panelTxtBox.add(ePeso);
        panelTxtBox.add(txtPeso);
        panelTxtBox.add(eAltura);
        panelTxtBox.add(txtAltura);
        panelTxtBox.add(eImc);
        panelTxtBox.add(txtIMC);
    }
    private void armarPanelBtn(){
        this.btnConversor= new JButton("Calcular");
        panelBoton= new JPanel();
        Oyente oyente = new Oyente();
        btnConversor.addActionListener(oyente);
        panelBoton.add(btnConversor);
    }
    private class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            double peso=Double.parseDouble(txtPeso.getText());
            double altura= Double.parseDouble(txtAltura.getText())/100;
            double imc= peso/(altura*altura);
            txtIMC.setText(String.format("%2f",imc));
        }
    }
}
