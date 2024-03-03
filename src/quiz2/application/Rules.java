
package quiz2.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;

        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        getContentPane().setBackground(new Color(19,6,50)); 
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading = new JLabel("Welcome " + name + "! ");
        heading.setFont(new Font("Tahona", Font.BOLD, 40));
        heading.setForeground(new Color(153,50,204)); 
        heading.setHorizontalAlignment(JLabel.CENTER);
        add(heading, BorderLayout.NORTH);

        JTextArea rulesTextArea = new JTextArea();
        rulesTextArea.setText(
                "\n\t    \bSOME RULES TO FOLLOW\b\n\n"+
                "\n1. Answer questions truthfully without external assistance.\n\n" +
                "2.Complete the quiz within the specified time frame.\n\n" +
                "3. Only one attempt allowed per participant.\n\n" + 
                "4. Do not collaborate with others or use outside help.\n\n"  +
                "5. Answer questions in the order presented, without skipping.\n\n"+
                "6. Points awarded for correct answers; no penalties for incorrect ones.\n\n"  +
                        "7. Click \"next\" to save your answer.\n\n"+
                "8. Click \"submit\" after completing all questions.\n\n" + 
                "9. Maintain fairness and integrity throughout the quiz.\n\n" 
               
            

        );
        
        
        rulesTextArea.setFont(new Font("Tahona", Font.BOLD, 18));
        rulesTextArea.setEditable(false);
        rulesTextArea.setForeground(new Color(19,6,50));
        rulesTextArea.setBackground(new Color(150,222,209)); 
        rulesTextArea.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 128), 2)); 

        JScrollPane scrollPane = new JScrollPane(rulesTextArea);
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(new Color(19,6,50)); 
        centerPanel.add(scrollPane);

        add(centerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buttonPanel.setBackground(new Color( 19,6,50));
        
        
        start = new JButton("Start");
        start.setBackground(new Color(153,50,204)); 
        start.setForeground(new Color(150,222,209));
        start.setFont(new Font("Tahona", Font.BOLD, 18));
        start.addActionListener(this);
        buttonPanel.add(start);

        back = new JButton("Back");
        back.setBackground(new Color(153,50,204)); 
        back.setForeground(new Color(150,222,209));
        back.setFont(new Font("Tahona", Font.BOLD, 18));
        back.addActionListener(this);
        buttonPanel.add(back);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            
            new Subjects(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
