import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Botonera extends JFrame{
    private JPanel panelBotones;
    private JButton []botones;

    public Botonera(){
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panelBotones= new JPanel();
        botones= new JButton[5];
        armarBotonera();
        getContentPane().add(panelBotones);
    }

    private void armarBotonera(){
        Oyente oyente = new Oyente();
        for(int i=0;i<5;i++){
            botones[i]= new JButton();
            botones[i].setText(""+i);
            botones[i].setBackground(Color.white);
            botones[i].addActionListener(oyente);
            panelBotones.add(botones[i]);
        }
    }
    private class Oyente implements ActionListener{
    @Override
        public void actionPerformed(ActionEvent evento){
            JButton b = (JButton)evento.getSource();
            if (!b.getText().equals("ok")) {
                b.setBackground(Color.RED);
                b.setText("ok");
            } else {
                int i = 0;
                // Busca el índice del botón en el array
                while (i < botones.length && botones[i] != b) {
                    i++;
                }
                if (i < botones.length) {
                    b.setBackground(Color.WHITE);
                    b.setText("" + i);
                }
      
            }
       
        }
    
    }

}
