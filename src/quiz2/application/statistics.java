
package quiz2.application;





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class statistics extends JFrame implements ActionListener {

    String questions[][] = new String[30][6];
    
    String useranswers[][] = new String[30][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3,opt4;
    ButtonGroup groupoptions;
    JButton next, submit, calculatorButton;

    public static int timer = 60;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String username;

    CalculatorFrame calculatorFrame;

    statistics(String username) {
        
        
        this.username = username;
        setBounds(0, 0, 1600, 900); 
        getContentPane().setBackground(new Color(148,97,212)); 
        setLayout(null);
        setVisible(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizz/STATS.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 500); 
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 520, 50, 30); 
        qno.setFont(new Font("Tahona", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 490, 1400, 70); 
        question.setFont(new Font("Tahona", Font.PLAIN, 24));

        add(question);

        
        

questions[0][0] = "The runs scored by a batsman in 5 ODIs are 31, 97, 112, 63, and 12. The standard deviation is";
questions[0][1] = "24.79";
questions[0][2] = "23.79";
questions[0][3] = "25.79";
questions[0][4] = "26.79";

questions[1][0] = "Find the mode of the call received on 7 consecutive day 11, 13, 13, 17, 19, 23, 25";
questions[1][1] = "11";
questions[1][2] = "13";
questions[1][3] = "17";
questions[1][4] = "23";

questions[2][0] = "Find the median of the call received on 7 consecutive days 11, 13, 17, 13, 23, 25, 19";
questions[2][1] = "13";
questions[2][2] = "23";
questions[2][3] = "25";
questions[2][4] = "17";

questions[3][0] = "Find the mode and median of the 9 consecutive number 12, 7, 8, 14, 21, 23, 27, 7, 11";
questions[3][1] = "7, 12";
questions[3][2] = "8, 9";
questions[3][3] = "7, 8";
questions[3][4] = "11, 9";

questions[4][0] = "When the Mean of a number is 18, what is the Mean of the sampling distribution?";
questions[4][1] = "21";
questions[4][2] = "18";
questions[4][3] = "27";
questions[4][4] = "23";

questions[5][0] = "If the probability of hitting an object is 0.8, find the variance";
questions[5][1] = "0.18";
questions[5][2] = "0.16";
questions[5][3] = "0.14";
questions[5][4] = "0.12";

questions[6][0] = "If the probability that an object dropped from a certain height will strike the ground is 80 percent and if 12 objects are dropped from the same place, find the mean and variance.";
questions[6][1] = "9.6, 1.92";
questions[6][2] = "8.6, 1.92";
questions[6][3] = "9.6, 1.82";
questions[6][4] = "8.6, 1.82";

questions[7][0] = "Find the mean of tossing 4 coins";
questions[7][1] = "1";
questions[7][2] = "2";
questions[7][3] = "3";
questions[7][4] = "4";

questions[8][0] = "Variance of a constant 'x' is";
questions[8][1] = "0";
questions[8][2] = "x/2";
questions[8][3] = "x";
questions[8][4] = "1";

questions[9][0] = "E(X) = λ is used for which distribution?";
questions[9][1] = "Binomial distribution";
questions[9][2] = "Poisson's distribution";
questions[9][3] = "Bernoulli's distribution";
questions[9][4] = "Laplace distribution";

questions[10][0] = "The Mean of a constant 'x' is";
questions[10][1] = "0";
questions[10][2] = "x/2";
questions[10][3] = "x";
questions[10][4] = "1";

questions[11][0] = "If P(x) = 0.8 and x = 3, then find the value of E(x)";
questions[11][1] = "2.4";
questions[11][2] = "2.6";
questions[11][3] = "2.2";
questions[11][4] = "2.8";

questions[12][0] = "If P (1) = P (2) in Poisson's distribution, find the value of mean";
questions[12][1] = "λ";
questions[12][2] = "2λ";
questions[12][3] = "3λ";
questions[12][4] = "4λ";

questions[13][0] = "If P (1) = λ P (5) in Poisson's distribution, find the value of mean";
questions[13][1] = "33.81";
questions[13][2] = "53.81";
questions[13][3] = "63.81";
questions[13][4] = "43.81";

questions[14][0] = "Find the expectation of random variable a?";
questions[14][1] = "4.71";
questions[14][2] = "5.71";
questions[14][3] = "6.71";
questions[14][4] = "8.71";

questions[15][0] = "If K is the Mean of Poisson distribution, then the variance is given by";
questions[15][1] = "K/2";
questions[15][2] = "K";
questions[15][3] = "K^2";
questions[15][4] = "K^(1/2)";

questions[16][0] = "If K is the Mean of Poisson distribution, then the standard deviation is given by";
questions[16][1] = "√K";
questions[16][2] = "K^2";
questions[16][3] = "K";
questions[16][4] = "K/2";

questions[17][0] = "Find the arithmetic mean of the set of data: 6,1,5,8, and 10";
questions[17][1] = "4";
questions[17][2] = "5";
questions[17][3] = "6";
questions[17][4] = "7";

questions[18][0] = "Calculate the geometric Mean of 1,3,9,3";
questions[18][1] = "2";
questions[18][2] = "3";
questions[18][3] = "4";
questions[18][4] = "1";

questions[19][0] = "Find the variance of the given data set: 3,9,5,6,7";
questions[19][1] = "4";
questions[19][2] = "3";
questions[19][3] = "2";
questions[19][4] = "1";

questions[20][0] = "Find the mean, mode, and median of the given sets of data: 5,8,12,17,12,14,6,8, 12, and 10";
questions[20][1] = "11,12,10";
questions[20][2] = "10,12,13";
questions[20][3] = "11,12,13";
questions[20][4] = "10,12,11";

questions[21][0] = "Find the mean, mode, and median of the messages received on 7 consecutive days 7,13,5,9,6,5,10";
questions[21][1] = "8,9,9";
questions[21][2] = "8,8,9";
questions[21][3] = "6,8,9";
questions[21][4] = "7,8,9";

questions[22][0] = "Calculate the range of the given sets of data 7,47,8,42,47,95,42,96,2";
questions[22][1] = "6";
questions[22][2] = "94";
questions[22][3] = "71";
questions[22][4] = "84";

questions[23][0] = "Find the mean deviation according to the Mean of the given data sets 7,47,8,42,47,95,42,96,3";
questions[23][1] = "111";
questions[23][2] = "112";
questions[23][3] = "113";
questions[23][4] = "114";

questions[24][0] = "Find the mean deviation according to median of the given data sets 7,47,8,42,47,95,42,96,3";
questions[24][1] = "99";
questions[24][2] = "100";
questions[24][3] = "101";
questions[24][4] = "102";

questions[25][0] = "Find the variance of the given data sets 7,47,8,42,47,95,42,96,3";
questions[25][1] = "1029.78";
questions[25][2] = "1019.78";
questions[25][3] = "1028.78";
questions[25][4] = "1018.78";

questions[26][0] = "Find the standard deviation of the given data sets 7,47,8,42,47,95,42,96,3";
questions[26][1] = "29.09";
questions[26][2] = "30.09";
questions[26][3] = "31.09";
questions[26][4] = "32.09";

questions[27][0] = "Find the coefficient of variation of the given data sets 7,47,8,42,47,95,42,96,3";
questions[27][1] = "72.64";
questions[27][2] = "74.62";
questions[27][3] = "30.39";
questions[27][4] = "78.58";

questions[28][0] = "Find the value of λ in Poisson's distribution if the probability of getting a tail in a biased coin toss is ¼ when 8 coins are tossed.";
questions[28][1] = "2";
questions[28][2] = "3";
questions[28][3] = "1";
questions[28][4] = "4";

questions[29][0] = "The Mean of a random variable K is given by equation";
questions[29][1] = "E(K)";
questions[29][2] = "(EK)^2";
questions[29][3] = "E^2 - K^2";
questions[29][4] = "None of these";



questions[0][5] = "25.79";
questions[1][5] = "13";
questions[2][5] = "17";
questions[3][5] = "7,12";
questions[4][5] = "18";
questions[5][5] = "0.16";
questions[6][5] = "9.6,1.92";
questions[7][5] = "2";
questions[8][5] = "0";
questions[9][5] = "Poisson's distribution";
questions[10][5] = "x";
questions[11][5] = "2.4";
questions[12][5] = "0";
questions[13][5] = "λ";
questions[14][5] = "43.81";
questions[15][5] = "4.71";
questions[16][5] = "√k";
questions[17][5] = "√k";
questions[18][5] = "6";
questions[19][5] = "3";
questions[20][5] = "4";
questions[21][5] = "10,12,11";
questions[22][5] = "8,9,9";
questions[23][5] = "94";
questions[24][5] = "111";
questions[25][5] = "101";
questions[26][5] = "1029.78";
questions[27][5] = "31.09";
questions[28][5] = "74.62";
questions[29][5] = "2";

        
        
        
        
      
        shuffleQuestions();

        selectRandomQuestions(10);
        
        opt1 = new JRadioButton();
        opt1.setBounds(100, 580, 1400, 30); 
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(100, 620, 1400, 30); 
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(100, 660, 1400, 30); 
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(100, 700, 1400, 30); 
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        

        next = new JButton("Next");
        next.setBounds(100, 740, 200, 40); 
        next.setFont(new Font("Tahona", Font.PLAIN, 22));
        next.setBackground(new Color(29,11,98));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        submit = new JButton("Submit");
        submit.setBounds(330, 740, 200, 40); 
        submit.setFont(new Font("Tahona", Font.PLAIN, 22));
        submit.setBackground(new Color(29,11,98));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        

        calculatorFrame = new CalculatorFrame();

        calculatorButton = new JButton("Calculator");
        calculatorButton.setBounds(1360, 50, 120, 30);
        calculatorButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        calculatorButton.addActionListener(this);
        add(calculatorButton);

        start(count);
    }
    
    
     private void shuffleQuestions() {
        List<String[]> questionsList = Arrays.asList(questions);
        Collections.shuffle(questionsList);
        questionsList.toArray(questions);
    }

    private void selectRandomQuestions(int numQuestions) {
        questions = Arrays.copyOf(questions, numQuestions);
    }
    
     private void calculateScore() {
    for (int i = 0; i < questions.length; i++) {
        if (useranswers[i][0].equalsIgnoreCase(questions[i][5])) {
            score= score+10;
        }
    }
}

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } 
           

            else if (ae.getSource() == submit) {
            if (count == 9) {
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                calculateScore();
                setVisible(false);
                new Score(username, score); 
            }
        }

        
        else if (ae.getSource() == calculatorButton) {
            calculatorFrame.setVisible(true); 
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time "
                + "Left : " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahona", Font.BOLD, 25));

        
            
            
            if (timer > 0) {
            g.drawString(time, 1200, 450); 
        } else {
            g.drawString("Time's up!!", 1200, 450); 
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                setVisible(false);
                calculateScore();
                new Score(username, score); // score
            } else {
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;

                if (count < questions.length) {
                    start(count);
                    timer = 60;
                } else {
                    submit.setEnabled(true);
                }
            }
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 60;
        }
    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ".");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }
    
   
    
    public void resetQuiz() {
    count = 0;
    start(count);
    timer = 60;
    score=0;
    submit.setEnabled(false);
}

    public static void main(String[] args) {
        new statistics("user");
    }
}

