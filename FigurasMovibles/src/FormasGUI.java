
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class FormasGUI extends JFrame {
    private JPanel panelFiguras, panelBotones,panelBtnFig,panelBtnMov,paneltxt;
    private JButton btnCirculo,btnRectangulo,btnArriba,btnAbajo,btnIzq,btnDer;
    private JLabel eFigura,eX,eY,eDiametro;
    private JTextField cirXTxtBox,cirYTxtBox,cirDiamTxtBox;
    private CirculoMovible circulo;
    private RectanguloMovible rectangulo;
    private enum FiguraActiva { CIRCULO, RECTANGULO }
    private FiguraActiva figuraActiva = FiguraActiva.CIRCULO;

    public FormasGUI(String tit){
        super(tit);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

       circulo= new CirculoMovible(0, 0, 1, 1, 40);
       rectangulo= new RectanguloMovible(50, 50, 150, 120, 1, 1);

        armarPanelFiguras();
        armarPanelBotones();
        armarPanelTxt();

        setLayout(new BorderLayout());
        getContentPane().add(panelFiguras,BorderLayout.CENTER);
        getContentPane().add(panelBotones,BorderLayout.SOUTH);
        getContentPane().add(paneltxt,BorderLayout.EAST);
    }
    private void armarPanelTxt(){
        this.paneltxt= new JPanel();
        this.cirXTxtBox= new JTextField(8);
        this.cirYTxtBox= new JTextField(8);
        this.cirDiamTxtBox= new JTextField(8);
        this.eX= new JLabel("X");
        this.eY= new JLabel("Y");
        this.eDiametro= new JLabel("Diametro");
        this.paneltxt.setLayout(new GridLayout(3, 3));
        paneltxt.add(eX);
        paneltxt.add(cirXTxtBox);
        paneltxt.add(eY);
        paneltxt.add(this.cirYTxtBox);
        paneltxt.add(eDiametro);
        paneltxt.add(this.cirDiamTxtBox);
    }

    private void armarPanelFiguras(){
        eFigura= new JLabel();
        panelFiguras= new JPanel();
        panelFiguras.setLayout(new FlowLayout());
        panelFiguras.add(eFigura);
    }

    private void armarPanelBotones(){
        panelBotones= new JPanel();
        crearPanelBotonesFiguras();
        crearPanelBotonesMovimientos();
        panelBotones.setLayout(new GridLayout(1,2));
        panelBotones.add(panelBtnFig);
        panelBotones.add(panelBtnMov);
    }
    private void crearPanelBotonesFiguras(){
        this.panelBtnFig= new JPanel();
        btnCirculo= new JButton("Circulo");
        btnRectangulo= new JButton("Rectangulo");
        ActionListener oyenteCirculo= new OyenteCirculo();
        ActionListener oyenteRectangulo= new OyenteRectangulo();
        btnCirculo.addActionListener(oyenteCirculo);
        btnRectangulo.addActionListener(oyenteRectangulo);
        panelBtnFig.setLayout(new FlowLayout());
        panelBtnFig.add(btnCirculo);
        panelBtnFig.add(btnRectangulo);
    }
    private void crearPanelBotonesMovimientos(){
        panelBtnMov = new JPanel();
        btnArriba= new JButton("Arriba");
        btnAbajo= new JButton("Abajo");
        btnIzq= new JButton("Izquierda");
        btnDer= new JButton("Derecha");
        ActionListener eventoMoverArriba= new EventoMoverArriba();
        ActionListener eventoMoverAbajo= new EventMoverAbajo();
        ActionListener eventoMoverIzq= new EventoMoverIzq();
        ActionListener eventoMoverDecha= new EventoMoverDerecha();
        btnArriba.addActionListener(eventoMoverArriba);
        btnAbajo.addActionListener(eventoMoverAbajo);
        btnIzq.addActionListener(eventoMoverIzq);
        btnDer.addActionListener(eventoMoverDecha);
        panelBtnMov.setLayout(new BorderLayout());
        panelBtnMov.add(btnArriba,BorderLayout.NORTH);
        panelBtnMov.add(btnAbajo,BorderLayout.SOUTH);
        panelBtnMov.add(btnDer,BorderLayout.EAST);
        panelBtnMov.add(btnIzq,BorderLayout.WEST);
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
            figuraActiva= figuraActiva.CIRCULO;
            eFigura.setIcon(crearIconoCiruculo(circulo.getX(), circulo.getY(), circulo.getDiametro()));
        }
    }

    private class OyenteRectangulo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            figuraActiva= figuraActiva.RECTANGULO;
            eFigura.setIcon(crearIconoRectangulo(rectangulo.getX(), rectangulo.getY(), 
                rectangulo.getAncho(), rectangulo.getAlto()));
        }
    }
    private class EventoMoverArriba implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(figuraActiva== figuraActiva.CIRCULO){
                circulo.moverArriba();
                eFigura.setIcon(crearIconoCiruculo(circulo.getX(), -circulo.getY(), circulo.getDiametro()));
                //en todo los SG crecen hacia abajo//

            }else{
                rectangulo.moverArriba();
                eFigura.setIcon(crearIconoRectangulo(rectangulo.getX(), -rectangulo.getY(),
                 rectangulo.getAncho(), rectangulo.getAlto()));
            }
        }
    }
    private class EventMoverAbajo implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            if(figuraActiva== figuraActiva.CIRCULO){
                circulo.moverAbajo();
                eFigura.setIcon(crearIconoCiruculo(circulo.getX(), circulo.getY(), circulo.getDiametro()));
            }else{
                rectangulo.moverAbajo();
                eFigura.setIcon(crearIconoRectangulo(rectangulo.getX(),rectangulo.getY(),
                 rectangulo.getAncho(), rectangulo.getAlto()));
            }
        }
    }
    private class EventoMoverIzq implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            if(figuraActiva== figuraActiva.CIRCULO){
                circulo.moverIzquierda();
                eFigura.setIcon(crearIconoCiruculo(circulo.getX(), circulo.getY(), circulo.getDiametro()));
            }else{
                rectangulo.moverIzquierda();
                eFigura.setIcon(crearIconoRectangulo(rectangulo.getX(),rectangulo.getY(),
                rectangulo.getAncho(), rectangulo.getAlto()));
            }
        }
    }
    private class EventoMoverDerecha implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(figuraActiva==figuraActiva.CIRCULO){
                circulo.moverDerecha();
                eFigura.setIcon(crearIconoCiruculo(circulo.getX(), circulo.getY(), circulo.getDiametro()));
            }else{
                rectangulo.moverDerecha();
                eFigura.setIcon(crearIconoRectangulo(rectangulo.getX(), rectangulo.getY(),
                rectangulo.getAncho(),rectangulo.getAlto()));
            }
        }
    }



}
