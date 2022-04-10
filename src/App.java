import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.formdev.flatlaf.FlatLightLaf;



public class App extends JFrame{

    private JPanel contentPane;


    public static void main(String[] args){
        FlatLightLaf.setup();
        SwingUtilities.invokeLater(new App()::renderUI);
    }   

    private void renderUI(){
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        

        setContentPane(contentPane);
        setBounds(0, 0, 1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}