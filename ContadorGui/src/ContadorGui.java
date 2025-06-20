
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class ContadorGui extends JFrame {
    private Integer cont;
    private JLabel etiquetaNumero;
    private JButton btnMas,btnMenos;
    private JPanel panelbotones;

    public ContadorGui(){
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cont=0;
        setLayout(new BorderLayout());
        etiquetaNumero= new JLabel(String.valueOf(cont));
        getContentPane().add(etiquetaNumero,BorderLayout.CENTER);
        armarPanelBtns();
        getContentPane().add(panelbotones,BorderLayout.SOUTH);
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
    private class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String valor=(String)evento.getActionCommand();
            if(valor.equals("+")){
                cont++;
                etiquetaNumero.setText(String.valueOf(cont));
            }else if(valor.equals("-")){
                cont--;
                etiquetaNumero.setText(String.valueOf(cont));
            }
        }
    }




}
