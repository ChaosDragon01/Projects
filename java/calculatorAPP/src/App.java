import javax.swing.JOptionPane;

public class App    {
    public static void main(String[] args) throws Exception {
       try
       {
        framework calc = new framework(); 
        calc.setSize(480, 240);
        calc.setVisible(true);
       }
         catch (Exception e)
       {
        JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }
}
