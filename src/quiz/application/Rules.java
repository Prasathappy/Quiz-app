
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name = name;
         getContentPane().setBackground(Color.BLACK);
         setLayout(null);
         
         JLabel heading = new JLabel("Welcome  " + name);
         heading.setBounds(200,24,700,30);
         heading.setFont(new Font("Algerian",Font.BOLD,40));
         heading.setForeground(Color.WHITE);
         add(heading);
         
         JLabel rules = new JLabel();
         rules.setBounds(20,90,700,350);
         rules.setFont(new Font("Algerian",Font.BOLD, 17));
         rules.setForeground(Color.WHITE);
         rules.setText(
            "<html>"+
                "1. Attending All Questions is Compulsory "+"<br><br>"+
                "2. Looking at the Neighbouring System is strictly Prohibited "+"<br><br>"+
                "3. Avoid Distractions such as sleeping or sitting simply  "+"<br><br>"+
                "4. Crying is allowed but do it quitely"+"<br><br>"+
                "5. Review all your Answers before clicking the Submit Button "+"<br><br>"+
                "6. Strictly Follow All the Rules "+"<br><br>"+
            "<html>"
         );
         add(rules);
         
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(Color.WHITE);
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);
         
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
         
         
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start ){
            setVisible(false);
            new Quiz();
        }else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("user");
    }
    
    
}
