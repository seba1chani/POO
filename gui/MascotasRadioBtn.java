import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MascotasRadioBtn extends JFrame{
    private JLabel etiqueta;
    private ButtonGroup grupo;
    private JRadioButton[] botones;
    private JPanel panelControl,panelImagen;
    public MascotasRadioBtn(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        armarPanelImagen();
        armarPanelControl();
        getContentPane().add(panelImagen,BorderLayout.WEST);
        getContentPane().add(panelControl,BorderLayout.EAST);
    }

    private void armarPanelControl(){
        String[]mascotas={"Perro","Gato","Conejo","Pato","Cerdo"};
        Oyente oyente = new Oyente();
        grupo= new ButtonGroup();
        botones= new JRadioButton[5];
        panelControl= new JPanel();
        panelControl.setLayout(new GridLayout(5,1));
        for (int i = 0; i < 5; i++) {
            botones[i]= new JRadioButton(mascotas[i]);
            botones[i].setPreferredSize(new Dimension(100,30));
            botones[i].addItemListener(oyente);
            grupo.add(botones[i]);
            panelControl.add(botones[i]);
        }
        botones[0].setSelected(true);
    }
    private void armarPanelImagen(){
        etiqueta= new JLabel();
        panelImagen= new JPanel();
        etiqueta.setIcon(new ImageIcon(("imagenes/perro.jpg")));
        panelImagen.add(etiqueta);
    }
    private class Oyente implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent evento){
            JRadioButton radio= (JRadioButton)evento.getSource();
            String valor= radio.getText();
            System.out.println(valor);
            etiqueta.setIcon(new ImageIcon(("imagenes/"+valor.toLowerCase()+".jpg")));
        }
    }

}

