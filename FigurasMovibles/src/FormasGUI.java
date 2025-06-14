
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class FormasGUI extends JFrame {
    private JPanel panelFiguras, panelBotones;
    private JButton botonCirculo,botonRectangulo;
    private JLabel eFigura;
    private CirculoMovible circulo;
    private RectanguloMovible rectangulo;

    public FormasGUI(String tit){
        super(tit);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        circulo= new CirculoMovible(0, 0, 1, 1, 20);
        rectangulo= new RectanguloMovible(50, 50, 150, 120, 1, 1);

        armarPanelFiguras();
        armarPanelBotones();

        setLayout(new BorderLayout());
        getContentPane().add(panelFiguras,BorderLayout.CENTER);
        getContentPane().add(panelBotones,BorderLayout.SOUTH);
    }

    private void armarPanelFiguras(){
        eFigura= new JLabel();
        panelFiguras= new JPanel();
        panelFiguras.setLayout(new FlowLayout());
        panelFiguras.add(eFigura);
    }

    private void armarPanelBotones(){
        botonCirculo= new JButton("Circulo");
        botonRectangulo= new JButton("Rectangulo");
        panelBotones= new JPanel();
        ActionListener oyenteCirculo= new OyenteCirculo();
        ActionListener oyenteRectangulo= new OyenteRectangulo();
        botonCirculo.addActionListener(oyenteCirculo);
        botonRectangulo.addActionListener(oyenteRectangulo);
        panelBotones.setLayout(new GridLayout(1,2));
        panelBotones.add(botonCirculo);
        panelBotones.add(botonRectangulo);
    }
   private Icon crearIconoCiruculo(int x, int y, int diametro){
        int ancho = Math.max(x + diametro, 1);
        int alto = Math.max(y + diametro, 1);
        BufferedImage img = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setColor(Color.BLACK);
        g2.fillOval(x, y, diametro, diametro);
        g2.dispose();
        return new ImageIcon(img);
    }   

    private Icon crearIconoRectangulo(int x, int y, int ancho, int alto){
        int imgAncho = Math.max(x + ancho, 1);
        int imgAlto = Math.max(y + alto, 1);
        BufferedImage img = new BufferedImage(imgAncho, imgAlto, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setColor(Color.BLUE);
        g2.fillRect(x, y, ancho, alto);
        g2.dispose();
        return new ImageIcon(img);
    }
    
    private class OyenteCirculo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            eFigura.setIcon(crearIconoCiruculo(circulo.getX(), circulo.getY(), circulo.getDiametro()));
        }
    }

    private class OyenteRectangulo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            eFigura.setIcon(crearIconoRectangulo(rectangulo.getX(), rectangulo.getY(), 
                rectangulo.getAncho(), rectangulo.getAlto()));
        }
    }



}
