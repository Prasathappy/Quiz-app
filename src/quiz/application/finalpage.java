
package quiz.application;

import javax.swing.*;
import java.awt.*;

public class finalpage extends JFrame {
    JLabel s;
    finalpage(int score){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        s = new JLabel("Your Final Score is: "+ " "+score);
        s.setBounds(400,0,800,800);
        s.setFont(new Font("Algerian",Font.PLAIN,50));
        s.setForeground(Color.WHITE);
        add(s);
        
       setBounds(50,0,1440,850);
       getContentPane().setBackground(Color.BLACK);
       setLayout(null);
       setVisible(true);
        
    }
    
    public static void main(String[] args){
        new finalpage(0);
    }
    
}
