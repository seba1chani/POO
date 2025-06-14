
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI_Bebidas extends JFrame implements ActionListener{
    private JLabel eImagen;
    private JButton botonCafe,botonJugo;
    private JPanel panelControl, panelBotones;

    public GUI_Bebidas(String tit){
        super(tit);
        setSize(300,300);
        //eImagen= new JLabel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        armarPanelControl();
        armarPanelBotones();
        setLayout(new BorderLayout());
        getContentPane().add(this.panelControl,BorderLayout.CENTER);
        getContentPane().add(this.panelBotones,BorderLayout.SOUTH);
    }
    private void armarPanelControl(){
        this.eImagen= new JLabel();
        this.panelControl= new JPanel();
        panelControl.setLayout(new FlowLayout());
        panelControl.setBackground(Color.WHITE);
        panelControl.add(eImagen);
        
    }
    private void armarPanelBotones(){
        this.panelBotones= new JPanel();
        this.botonCafe= new JButton("Cafe");
        this.botonJugo= new JButton("Jugo");
        botonCafe.addActionListener(this);
        botonJugo.addActionListener(this);
        panelBotones.setLayout(new GridLayout(1,2));
        panelBotones.add(botonCafe);
        panelBotones.add(botonJugo);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== botonCafe){
            eImagen.setIcon(new ImageIcon(getClass().getResource("imagenes/cafe.gif")));
            panelControl.setBackground(Color.BLACK);
            panelControl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,2),"cafe"));
        }else if(e.getSource()== botonJugo){
            eImagen.setIcon(new ImageIcon(getClass().getResource("imagenes/jugo.gif")));
            panelControl.setBackground(Color.ORANGE);
            panelControl.setBorder(BorderFactory.createLineBorder(Color.RED,2));
        }
    }



}
