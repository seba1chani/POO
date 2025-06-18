
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class FormasGUI extends JFrame {
    private JPanel panelFiguras, panelBotones,panelBtnFig,panelBtnMov,paneltxt;
    private JButton btnCirculo,btnRectangulo,btnArriba,btnAbajo,btnIzq,btnDer;
    private JLabel eFigura,eX,eY,eDiametro,eX2,eY2;
    private JTextField xTxtBox,yTxtBox,DiamTxtBox,x2TxtBox,y2TxtBox;
    private CirculoMovible circulo;
    private RectanguloMovible rectangulo;
    private enum FiguraActiva { CIRCULO, RECTANGULO }
    private FiguraActiva figuraActiva = FiguraActiva.CIRCULO;

    public FormasGUI(String tit){
        super(tit);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

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
        this.xTxtBox= new JTextField(8);
        this.yTxtBox= new JTextField(8);
        this.x2TxtBox= new JTextField(8);
        this.y2TxtBox= new JTextField(8);
        this.DiamTxtBox= new JTextField(8);
        this.eX= new JLabel("X");
        this.eY= new JLabel("Y");
        this.eX2= new JLabel("X2");
        this.eY2= new JLabel("Y2");
        this.eDiametro= new JLabel("Diametro");
        this.paneltxt.setLayout(new GridLayout(5, 2));
        paneltxt.add(eX);
        paneltxt.add(xTxtBox);
        paneltxt.add(eY);
        paneltxt.add(this.yTxtBox);
        paneltxt.add(eX2);
        paneltxt.add(this.x2TxtBox);
        paneltxt.add(eY2);
        paneltxt.add(this.y2TxtBox);
        paneltxt.add(eDiametro);
        paneltxt.add(this.DiamTxtBox);
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
            try {
                int x= Integer.parseInt(xTxtBox.getText());
                int y= Integer.parseInt(yTxtBox.getText());
                int diametro= Integer.parseInt(DiamTxtBox.getText());
                int radio= diametro/2;
                circulo= new CirculoMovible(x, y,1 , 1, radio);
                 figuraActiva= figuraActiva.CIRCULO;
                eFigura.setIcon(crearIconoCiruculo(circulo.getX(), circulo.getY(), circulo.getDiametro()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(FormasGUI.this, "Ingrese valores numericos validos");
            }
            
        }
    }

    private class OyenteRectangulo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            try {
                int x= Integer.parseInt(xTxtBox.getText());
                int y= Integer.parseInt(yTxtBox.getText());
                int x2= Integer.parseInt(x2TxtBox.getText());
                int y2= Integer.parseInt(y2TxtBox.getText());
                rectangulo= new RectanguloMovible(x, y, x2, y2, 1, 1);
                figuraActiva= figuraActiva.RECTANGULO;
                eFigura.setIcon(crearIconoRectangulo(rectangulo.getX(), rectangulo.getY(), 
                rectangulo.getAncho(), rectangulo.getAlto()));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(FormasGUI.this, "Ingrese valores numericos validos");
            }
            
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
