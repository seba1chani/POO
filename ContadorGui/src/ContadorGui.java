
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class ContadorGui extends JFrame {
    private Integer cont;
    private JTextField txtNum;
    private JButton btnMas,btnMenos;
    private JPanel panelbotones,panelContador;

    public ContadorGui(){
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cont=0;
        setLayout(new GridLayout(2,1));
        armarPanelContador();
        armarPanelBtns();
        getContentPane().add(panelContador);
        getContentPane().add(panelbotones);
    }
    private void armarPanelBtns(){
        btnMas= new JButton("+");
        btnMenos= new JButton("-");
        panelbotones= new JPanel();
        Oyente oyente= new Oyente();
        btnMas.addActionListener(oyente);
        btnMenos.addActionListener(oyente);
        panelbotones.add(btnMas);
        panelbotones.add(btnMenos);
    }
    private void armarPanelContador(){
        panelContador= new JPanel();
        txtNum= new JTextField(2);
        txtNum.setText(String.valueOf(cont));
        txtNum.disable();
        panelContador.add(txtNum);
    }
    private class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String valor=(String)evento.getActionCommand();
            if(valor.equals("+")){
                cont++;
                txtNum.setText(String.valueOf(cont));
            }else if(valor.equals("-")){
                cont--;
                txtNum.setText(String.valueOf(cont));
            }
        }
    }




}
