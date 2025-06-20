import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MascotasBotones extends JFrame {
    private JLabel etiqueta;
    private JButton[] botones;
    private JPanel panelControl,panelImagen;
    public MascotasBotones(){
        setLayout(new BorderLayout());
        setSize(700,320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        armarPanelBotones();
        armarPanelControl();
        getContentPane().add(panelImagen,BorderLayout.CENTER);
        getContentPane().add(panelControl,BorderLayout.SOUTH);
    }
    private void armarPanelBotones(){
        String[] mascota={"Perro","Gato","Conejo","Pato","Cerdo"};
        botones= new JButton[5];
        Oyente oyente= new Oyente();
        panelControl= new JPanel();
        for (int i = 0; i < 5; i++) {
            botones[i]= new JButton(mascota[i]);
            botones[i].setPreferredSize(new Dimension(100,30));
            botones[i].setBorder(new TitledBorder(new LineBorder(Color.BLACK,4,true),""));
            botones[i].addActionListener(oyente);
            panelControl.add(botones[i]);
        }
    }

    private void armarPanelControl(){
        panelImagen= new JPanel();
        etiqueta= new JLabel();
        etiqueta.setIcon(new ImageIcon("imagenes/perro.jpg"));
        panelImagen.add(etiqueta);
    }
    
    private class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String valor= (String)evento.getActionCommand();
            etiqueta.setIcon(new ImageIcon("imagenes/"+valor.toLowerCase()+".jpg"));
        }
    }

}
