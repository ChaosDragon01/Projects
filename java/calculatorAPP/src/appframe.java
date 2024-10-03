import javax.swing.JFrame;


public class appframe extends JFrame
{
    appframe(){
        JFrame appFrame = new JFrame();
        
        appFrame.setTitle("Calculator");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setResizable(false);
        appFrame.setSize(720,640);
        appFrame.setVisible(true); 
    
    }
}
