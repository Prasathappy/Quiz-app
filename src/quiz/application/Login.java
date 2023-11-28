
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpeg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,500,400);
        Border border = BorderFactory.createLineBorder(Color.WHITE, 10);
        image.setBorder(border);
        add(image);
        
        JLabel heading = new JLabel("JAVA QUIZ");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Algerian",Font.BOLD,50));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Algerian",Font.BOLD,18));
        name.setForeground(Color.WHITE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.WHITE);
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
            
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == rules) {
            System.out.println("hai");
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if(ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
