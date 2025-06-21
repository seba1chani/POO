import java.awt.*;
import javax.swing.*;

public class Gui extends JFrame {
    private JPanel panelEti,panelTxt,panelBtn,panelCentral;
    private JButton btnSumar,btnRestar,btnMultiplicar;
    private JLabel eNumCom1,eNumCom2,eNumResp,eImg;

    public Gui(){
        setSize(150,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        armarPanelCentral();
        armarPanelBtn();
        getContentPane().add(panelCentral);
        getContentPane().add(panelBtn);
    }
    private void armarPanelCentral(){
        
    }
}
