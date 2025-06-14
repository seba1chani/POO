import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class GUI_Dos_Bebidas extends JFrame {
    private JPanel panelSuperior, panelInferior,panelCentro;
    private JButton botonCafe,botonJugo;
    private JLabel etiquetaCafe,etiquetaJugo,eContadorCafe,eContadorJugo;
    private int contCafe,contJugo;

    public GUI_Dos_Bebidas(String tit){
        super(tit);
        contCafe=0;
        contJugo=0;
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        armarPanelSuperior();
        armarPanelCentro();
        armarPanelInferior();

        setLayout(new BorderLayout());
        getContentPane().add(this.panelSuperior, BorderLayout.NORTH);
        getContentPane().add(this.panelInferior, BorderLayout.SOUTH);
        getContentPane().add(this.panelCentro,BorderLayout.CENTER);

    }

    private void armarPanelSuperior(){
        etiquetaCafe= new JLabel();
        etiquetaJugo= new JLabel();
        panelSuperior= new JPanel();
        panelSuperior.setLayout(new GridLayout(1,2));
        panelSuperior.add(etiquetaCafe);
        panelSuperior.add(etiquetaJugo);
    }
    private void armarPanelInferior(){
        botonCafe= new JButton("Cafe");
        botonJugo= new JButton("Jugo");
        ActionListener oyenteCafe= new OyenteCafe();
        ActionListener oyenteJugo= new OyenteJugo();
        botonCafe.addActionListener(oyenteCafe);
        botonJugo.addActionListener(oyenteJugo);
        panelInferior= new JPanel();
        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(botonCafe);
        panelInferior.add(botonJugo);

    }
    private void armarPanelCentro(){
        eContadorCafe= new JLabel(String.valueOf(contCafe));
        eContadorJugo= new JLabel(String.valueOf(contJugo));
        panelCentro= new JPanel();
        panelCentro.setLayout(new GridLayout(1,2));
        panelCentro.add(eContadorCafe);
        panelCentro.add(eContadorJugo);


    }
    
    private Icon crearIconoCirculoBlanco(int diametro) {
        BufferedImage img = new BufferedImage(diametro, diametro, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setColor(Color.WHITE);
        g2.fillOval(0, 0, diametro, diametro);
        g2.dispose();
        return new ImageIcon(img);
    }

    private class OyenteCafe implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            contCafe++;
            etiquetaCafe.setIcon(new ImageIcon(getClass().getResource("imagenes/cafe.gif")));
            etiquetaJugo.setIcon(crearIconoCirculoBlanco(80));
            eContadorCafe.setText(String.valueOf(contCafe));
            
        }
    }
    private class OyenteJugo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            contJugo++;
            etiquetaJugo.setIcon(new ImageIcon(getClass().getResource("imagenes/jugo.gif")));
            etiquetaCafe.setIcon(crearIconoCirculoBlanco(80));
            eContadorJugo.setText(String.valueOf(contJugo));
        }
    }

}
