






package quiz2.application;                    
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;

    Login() {
        setLayout(null);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        getContentPane().setBackground(new Color(173, 216, 230));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizz/3996944.jpg"));
        Image i2 = i1.getImage().getScaledInstance(2000, 1200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel backgroundImageLabel = new JLabel(i3);
        backgroundImageLabel.setBounds(0, 0, 2000, 1200);
        add(backgroundImageLabel);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(610, 250, 500, 200);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 60));
        name.setForeground(new Color(148, 0, 211));
        backgroundImageLabel.add(name);

        tfname = new JTextField();
        tfname.setBounds(670, 400, 300, 40);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        backgroundImageLabel.add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(1200, 400, 120, 25);
        rules.setBackground(new Color(148, 0, 211));
        rules.setForeground(new Color(255, 255, 255));
        rules.addActionListener(this);
        backgroundImageLabel.add(rules);

        back = new JButton("Back");
        back.setBounds(1200, 440, 120, 25);
        back.setBackground(new Color(148, 0, 211));
        back.setForeground(new Color(255, 255, 255));
        back.addActionListener(this);
        backgroundImageLabel.add(back);

        setSize(2000, 1700);
        setLocation(0, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
        } else if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
