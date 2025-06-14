import java.awt.event.*;
import javax.swing.*;

public class MiFrame extends JFrame implements ActionListener {
    private JButton boton;

    public MiFrame(){
        this.boton= new JButton("Aceptar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(this.boton);
        boton.addActionListener(this);
        setSize(300,300);
    }
    public void cambiarTexto(){
        this.boton.setText("Listo!!!!");
    }
    public void cambiarTexto1(){
        this.boton.setText("Aceptar");
    }
    @Override
    public void actionPerformed(ActionEvent arg0){
       if(this.boton.getActionCommand().equals("Aceptar")){
            cambiarTexto();
            return;
        }     
        cambiarTexto1();   
    }

}
