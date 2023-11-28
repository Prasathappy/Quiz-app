
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][1];
    String oans[] = {"int x","8","extends","implements","False","It declares the package to which the class belongs","Both B and C","True","Java Virtual Machine","Polymorphism"};
    JLabel qno, question;
    JRadioButton opt1,opt2,opt3,opt4;
    int i = 0;
    JButton next,Submit,back;
    ButtonGroup groupoptions;
    int points=0;
    String p[] = {"no","no","no","no","no","no","no","no","no","no"};
    JLabel finalscore;
    Quiz(){
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/question.jpeg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,1440,392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100,450,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        qno.setForeground(Color.WHITE);
        add(qno);
        
        question = new JLabel();
        question.setBounds(150,450,900,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        question.setForeground(Color.WHITE);
        add(question);
        
        questions[0][0] = "What is the correct way to declare a variable in Java?";
        questions[0][1] = "int x";
        questions[0][2] = "new x";
        questions[0][3] = "variable x";
        questions[0][4] = "str x";
        
        questions[1][0] = "How many types of Primitive data types are present in Java?";
        questions[1][1] = "7";
        questions[1][2] = "9";
        questions[1][3] = "6";
        questions[1][4] = "8";

        questions[2][0] = "Which keyword is used to Inherit one class to another Class?";
        questions[2][1] = "implements";
        questions[2][2] = "extends";
        questions[2][3] = "inherit";
        questions[2][4] = "None of the above";
        
        questions[3][0] = "Which keyword is used to inherit one interface to a Class?";
        questions[3][1] = "inherit";
        questions[3][2] = "extends";
        questions[3][3] = "implements";
        questions[3][4] = "Both A and B";
        
        questions[4][0] = "A Class can be inherited in an Interface";
        questions[4][1] = "True";
        questions[4][2] = "False";
        questions[4][3] = "Machine dependent";
        questions[4][4] = "Cannot be Said";
        
        questions[5][0] = "What is the purpose of the package statement in a Java class?";
        questions[5][1] = "It defines the name of the class";
        questions[5][2] = "It specifies the access modifier for the class";
        questions[5][3] = "It declares the package to which the class belongs";
        questions[5][4] = "It is optional and does not affect the class";        

        questions[6][0] = "What is the Way by which multithreading can be injected in our java code";
        questions[6][1] = "By Implementing the Thread Class";
        questions[6][2] = "By Extending the Thread Class";
        questions[6][3] = "By Implementing Runnable Interface";
        questions[6][4] = "Both B and C";        
        
        questions[7][0] = "A super Class Instance Variable can refer to a Sub Class Object?";
        questions[7][1] = "True";
        questions[7][2] = "False";
        questions[7][3] = "Machine Dependent";
        questions[7][4] = "None of the above";
        
        questions[8][0] = "What if a exception is not handled by the User, It will be Handled By?";
        questions[8][1] = "Java Engine";
        questions[8][2] = "Java Virtual Machine";
        questions[8][3] = "Java Developer Kit";
        questions[8][4] = "Java Compiler";        

        questions[9][0] = "The Characteristics of a Class of taking multiple Forms is called as?";
        questions[9][1] = "Method overriding";
        questions[9][2] = "Encapsulation";
        questions[9][3] = "Abstraction";
        questions[9][4] = "Polymorphism";

        opt1 = new JRadioButton();
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setForeground(Color.BLACK);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Tahome",Font.PLAIN,22));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);
        
        Submit = new JButton("Submit");
        Submit.setBounds(1100,630,200,40);
        Submit.setFont(new Font("Tahome",Font.PLAIN,22));
        Submit.setBackground(Color.WHITE);
        Submit.setForeground(Color.BLACK);
        Submit.setEnabled(false);
        Submit.addActionListener(this);
        add(Submit);
        
        back = new JButton("Back");
        back.setBounds(1100,710,200,40);
        back.setFont(new Font("Tahome",Font.PLAIN,22));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setEnabled(false);
        back.addActionListener(this);
        add(back);
        
        start(0);
        
        
        
        setVisible(true);
        
    }
    
    
    public void start(int count){
        if(count != 9){
        qno.setText("0"+ (count+ 1) + ". ");}
        else{
            qno.setText("10.");
        }
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[i][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[i][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[i][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[i][4]);
        
    }
    
    public void cal(){
        if(answers[i][0] == oans[i]){
            p[i] = "yes";
        }
        else{
            p[i] = "no";
        }
    }

    
    
    public void actionPerformed(ActionEvent ae) {
        if(i==8 && ae.getSource() == next){
            Submit.setEnabled(true);
            next.setEnabled(false);
                
        }
        
        if(i>0){
                back.setEnabled(true);
                
            }
        if(i==1 && ae.getSource() == back){
            back.setEnabled(false);
        }
        if(i==9 && ae.getSource() == back){
            next.setEnabled(true);
        }
        if(i==0 && ae.getSource() == next){
            back.setEnabled(true);
        }
        if(i==9 && ae.getSource() == back){
            Submit.setEnabled(false);
        }
        if(ae.getSource() == next) {
            if(groupoptions.getSelection()==null){
                answers[i][0] = "";
             
            }
            else{
                answers[i][0] = groupoptions.getSelection().getActionCommand();
                System.out.println(answers[i][0]);
                cal();
            }
            i++;
            start(i);
                
           }else if(ae.getSource() == back) {
               if(groupoptions.getSelection()==null){
                   answers[i][0] = "";
               }
               else{
                   answers[i][0] = groupoptions.getSelection().getActionCommand();
                   System.out.println(answers[i][0]);
                   cal();
               }
               i--;
               start(i);
               
        }
        else if(ae.getSource() == Submit){
              answers[i][0] = groupoptions.getSelection().getActionCommand();
              cal();
              for(int k=0;k<10;k++){
                  if(p[k]=="yes"){
                      points++;
                  }
              }
              setVisible(false);
              new finalpage(points);
              
        }
    }
    
    
    
    public static void main(String[] args){
        new Quiz();
    }
}
