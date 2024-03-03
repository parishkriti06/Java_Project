
package quiz2.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    
    
    Score(String name,int score) {
        
        
        setBounds(0, 0, 2000, 1200);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null); 
        setVisible(true);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizz/scorepage.jpg"));

        JLabel image = new JLabel(i1);
       
        image.setBounds(0, 30, 750, 900);
        add(image);

        
        JLabel qno = new JLabel("THANK YOU " + name + " FOR PLAYING");
        qno.setForeground(new Color(150,222,209));
        qno.setBounds(900, 200, 1200, 30);
        qno.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(qno);

        JLabel qno2 = new JLabel("YOUR SCORE IS: " + score);
        qno2.setForeground(new Color(150,222,209));
        qno2.setBounds(900, 250, 400, 30);
        qno2.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(qno2);

        JButton back = new JButton("Play Again");
       
        back.setBounds(1100, 600, 320, 40);
        back.setFont(new Font("Tahoma", Font.BOLD, 20));
        back.setBackground(new Color(153,50,204));
        back.setForeground(new Color(150,222,209));
        back.addActionListener(this);
        add(back);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
       new Score("user", 0);
      
       
       
       
    }
}
