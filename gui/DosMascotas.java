import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DosMascotas extends JFrame {
   private JLabel eImagen;
    private JButton botonPerro,botonGato;
    private JPanel panelImagen, panelBotones;

    public DosMascotas(String tit){
        super(tit);
        setSize(300,300);
        //eImagen= new JLabel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        armarPanelImagen();
        armarPanelBotones();
        setLayout(new BorderLayout());
        getContentPane().add(this.panelImagen,BorderLayout.CENTER);
        getContentPane().add(this.panelBotones,BorderLayout.SOUTH);
    }
    private void armarPanelImagen(){
        this.eImagen= new JLabel();
        this.panelImagen= new JPanel();
        eImagen.setIcon(new ImageIcon("imagenes/perro.jpg"));
        panelImagen.add(eImagen);
        
    }
    private void armarPanelBotones(){
        this.panelBotones= new JPanel();
        this.botonPerro= new JButton("Perro");
        this.botonGato= new JButton("Gato");
        Oyente oyente= new Oyente();
        botonPerro.addActionListener(oyente);
        botonGato.addActionListener(oyente);
        panelBotones.add(botonPerro);
        panelBotones.add(botonGato);

    }
    public class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String valor= (String)evento.getActionCommand();
            eImagen.setIcon(new ImageIcon("imagenes/"+valor.toLowerCase()+".jpg"));
        }
}


}
