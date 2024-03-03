
package quiz2.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Subjects extends JFrame implements ActionListener{
    
    JButton next, lifeline, submit;
    String username;
    
    Subjects(String name){
        
        
        setBounds(0, 0, 2000, 1200);
        getContentPane().setBackground(new Color(150,222,209));
        setLayout(null); 
        setVisible(true);
        username=name;
        next = new JButton("GK");
        next.setBounds(150, 520, 200, 40); 
        next.setFont(new Font("Tahona", Font.PLAIN, 22));
        next.setBackground(new Color(153,50,204));
        next.setForeground(new Color(150,222,209));
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("Statistics");
        lifeline.setBounds(620, 520, 200, 40); 
        lifeline.setFont(new Font("Tahona", Font.PLAIN, 22));
        lifeline.setBackground(new Color(153,50,204));
        lifeline.setForeground(new Color(150,222,209));
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Algebra");
        submit.setBounds(1090, 520, 200, 40); 
        submit.setFont(new Font("Tahona", Font.PLAIN, 22));
        submit.setBackground(new Color(153,50,204));
        submit.setForeground(new Color(150,222,209));
        submit.addActionListener(this);
        add(submit);
        
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizz/gg.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(80, 120, 300, 300); 
        add(image);
        
         ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("quizz/stat.png"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(580, 120, 300, 300); 
        add(image2);
        
         ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("quizz/algg.png"));
        JLabel image3 = new JLabel(i3);
        image3.setBounds(1080, 120, 300, 300); 
        add(image3);



}
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==next){
            setVisible(false);
            Qquiz quiz =new Qquiz(username);
            quiz.resetQuiz();
        }
        else if(ae.getSource()==submit){
            setVisible(false);
            Algebra algeb= new Algebra(username);
            algeb.resetQuiz();
        }
        else{
            setVisible(false);
            statistics stat= new statistics(username);
            stat.resetQuiz();
        }
    }
    
    public static void main(String[] args){
        new Subjects("username");
    }
    
}

