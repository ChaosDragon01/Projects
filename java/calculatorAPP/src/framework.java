import java.awt.event.*;
import java.awt.*;
import javax.swing.*; 
import java.lang.Exception; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class framework extends JFrame implements ActionListener, KeyListener {

    JButton Button1;
    JButton Button2;
    JButton Button3; 
    JButton Button4;
    JButton Button5; 
    JButton Button6;
    JButton Button7;
    JButton Button8;
    JButton Button9;
    JButton Button0;
    JButton Buttonaddition;
    JButton ButtonSubtraction;
    JButton ButtonDivision;
    JButton ButtonMultiplication; 
    JTextField TextFieldnumber;
    JPanel newPanel;
  
    framework(){
        TextFieldnumber = new JTextField(5);
        Button1 = new JButton("1");
        Button2 = new JButton("2");
        Button3 = new JButton("3");
        Button4 = new JButton("4"); 
        Button5 = new JButton("5");
        Button6 = new JButton("6");
        Button7 = new JButton("7");
        Button8 = new JButton("8");
        Button9 = new JButton("9");
        Button0 = new JButton("0"); 
        Buttonaddition = new JButton("+");
        ButtonSubtraction = new JButton("-");
        ButtonDivision = new JButton("/"); 
        ButtonMultiplication = new JButton("x");
        
        newPanel = new JPanel(new GridLayout(5,1));

        newPanel.add(TextFieldnumber);
        newPanel.add(Button1);
        newPanel.add(Button2);
        newPanel.add(Button3);
        newPanel.add(Button4);
        newPanel.add(Button5);
        newPanel.add(Button6);
        newPanel.add(Button7);
        newPanel.add(Button8);
        newPanel.add(Button9);
        newPanel.add(Button0);
        newPanel.add(ButtonDivision);
        newPanel.add(ButtonMultiplication);
        newPanel.add(ButtonSubtraction);
        newPanel.add(Buttonaddition);

        add(newPanel, BorderLayout.CENTER);
        Button1.addActionListener((ActionListener)this);
        Button2.addActionListener((ActionListener)this);
        Button3.addActionListener((ActionListener)this);
        Button4.addActionListener((ActionListener)this);
        Button5.addActionListener((ActionListener)this);
        Button6.addActionListener((ActionListener)this);
        Button7.addActionListener((ActionListener)this);
        Button8.addActionListener((ActionListener)this);
        Button9.addActionListener((ActionListener)this);
        Button0.addActionListener((ActionListener)this);
        Buttonaddition.addActionListener((ActionListener)this);
        ButtonDivision.addActionListener((ActionListener)this);
        ButtonMultiplication.addActionListener((ActionListener)this);
        ButtonSubtraction.addActionListener((ActionListener)this);


    }


    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub


        // New comment         

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


}


  
