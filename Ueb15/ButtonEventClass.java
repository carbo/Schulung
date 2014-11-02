package Ueb15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEventClass extends JFrame {
    
private JButton button;
    
    public ButtonEventClass(){
        button = new JButton("click mich!");
        button.addActionListener(new ButtonLauscher());
        
        this.getContentPane().add(button);
    }
    
    
    
    public static void main(String[] args){
        ButtonEventClass bec = new ButtonEventClass();
        bec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bec.setSize(200, 200);
        bec.setVisible(true);
    }
}

class ButtonLauscher implements ActionListener {
    public void actionPerformed(ActionEvent e) {
            System.out.println("Button '" + ((JButton)e.getSource()).getText() + "' geklickt.");
    }

} 

