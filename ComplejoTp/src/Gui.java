import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JFrame {
    private JPanel panelEti,panelTxt,panelBtn,panelCentral;
    private JButton btnSumar,btnRestar,btnMultiplicar;
    private JLabel eNumCom1,eNumCom2,eNumResp,eImg;
    private JTextField realC1,realC2,imagC1,imagC2,resultado;

    public Gui(){
        setSize(150,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        armarPanelCentral();
        armarPanelBtn();
        getContentPane().add(panelCentral);
        getContentPane().add(panelBtn);
    }
    private void armarPanelCentral(){
    eNumCom1 = new JLabel("Número Complejo a=");
    eNumCom2 = new JLabel("Número Complejo b=");
    eNumResp = new JLabel("Resultado=");
    realC1 = new JTextField(4);
    imagC1 = new JTextField(4);
    realC2 = new JTextField(4);
    imagC2 = new JTextField(4);
    resultado = new JTextField(8);
    resultado.setEditable(false);

    panelCentral = new JPanel();
    panelCentral.setLayout(new GridLayout(3, 5, 2, 2));

    // Fila 1
    panelCentral.add(eNumCom1);
    panelCentral.add(realC1);
    panelCentral.add(imagC1);
    panelCentral.add(new JLabel("i"));
    panelCentral.add(new JLabel("")); // celda vacía

    // Fila 2
    panelCentral.add(eNumCom2);
    panelCentral.add(realC2);
    panelCentral.add(imagC2);
    panelCentral.add(new JLabel("i"));
    panelCentral.add(new JLabel("")); // celda vacía

    // Fila 3
    panelCentral.add(eNumResp);
    panelCentral.add(resultado);
    panelCentral.add(new JLabel("")); // celda vacía
    panelCentral.add(new JLabel("")); // celda vacía
    panelCentral.add(new JLabel("")); // celda vacía
    }
    private void armarPanelBtn(){
        btnSumar= new JButton("Sumar");
        btnRestar= new JButton("Restar");
        btnMultiplicar= new JButton("Multiplicar");
        panelBtn= new JPanel();
        panelBtn.setLayout(new FlowLayout());
        OyenteSum suma= new OyenteSum();
        //OyenteRes resta= new OyenteResta();
        //OyenteMult multi= new OyenteMult();
        btnSumar.addActionListener(suma);
        //btnRestar.addActionListener(resta);
        //btnMultiplicar.addActionListener(multi);
        panelBtn.add(btnSumar);
        panelBtn.add(btnRestar);
        panelBtn.add(btnMultiplicar);
    }
    private class OyenteSum implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            int r1= Integer.parseInt(realC1.getText());
            int i1= Integer.parseInt(imagC1.getText());
            int r2= Integer.parseInt(realC2.getText());
            int i2= Integer.parseInt(imagC2.getText());
            int r3=r1+r2;
            int i3= i1+i2;
            resultado.setText(r3+"+"+i3+"i");
        }
    }
}
