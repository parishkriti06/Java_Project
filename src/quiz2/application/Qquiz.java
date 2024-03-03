


package quiz2.application;





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Qquiz extends JFrame implements ActionListener {

    String questions[][] = new String[20][6];
    String useranswers[][] = new String[20][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3,opt4;
    ButtonGroup groupoptions;
    JButton next,  submit, calculatorButton;
    

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String username;

    CalculatorFrame calculatorFrame;

    Qquiz(String username) {
        
        
        this.username = username;
        setBounds(0, 0, 1600, 900); 
        getContentPane().setBackground(new Color(148,97,212)); 
        setLayout(null);
        setVisible(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizz/know.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 500); 
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 520, 50, 30); 
        qno.setFont(new Font("Tahona", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 520, 1400, 30); 
        question.setFont(new Font("Tahona", Font.PLAIN, 24));
        add(question);
        
        
      
questions[0][0] = "India’s longest sea bridge, recently making headlines, connects which two locations?";
questions[0][1] = "[A] Bandra and Worli";
questions[0][2] = "[B] Sewri and Chirle";
questions[0][3] = "[C] Thane and Virar";
questions[0][4] = "[D] Vallarpadam and Kochi";
questions[0][5] = "[B] Sewri and Chirle";


questions[1][0] = "Who is the author of the recently released book titled 'Why Bharat Matters'?";
questions[1][1] = "[A] Amit Shah";
questions[1][2] = "[B] Nirmala Sitharaman";
questions[1][3] = "[C] S. Jaishankar";
questions[1][4] = "[D] Rajnath Singh";
questions[1][5] = "[C] S. Jaishankar";


questions[2][0] = "Which organizations were involved in the development of the humanoid robot ALOHA?";
questions[2][1] = "[A] NASA and MIT";
questions[2][2] = "[B] Google DeepMind and Stanford University";
questions[2][3] = "[C] Boston Dynamics and Harvard University";
questions[2][4] = "[D] SpaceX and Caltec";
questions[2][5] = "[B] Google DeepMind and Stanford University";

questions[3][0] = "Which is the first Indian documentary to win an Oscar award?";
questions[3][1] = "[A] Stranger at the Gate";
questions[3][2] = "[B] How do you Measure a Year?";
questions[3][3] = "[C] The Elephant Whisperers";
questions[3][4] = "[D] All that Breathes";
questions[3][5] = "[C] The Elephant Whisperers";

questions[4][0] = "Who was recently crowned as 'Miss India 2023'?";
questions[4][1] = "[A] Nandini Gupta";
questions[4][2] = "[B] Megan Edward";
questions[4][3] = "[C] Shreya Poonja";
questions[4][4] = "[D] Strela Luwang";
questions[4][5] = "[A] Nandini Gupta";

questions[5][0] = "Generic Name of Aspirin is";
questions[5][1] = "a) Acetaminophen";
questions[5][2] = "b) Acetyl salicylic acid";
questions[5][3] = "c) Oil of eintergreen";
questions[5][4] = "d) Sodium bi carbonate";
questions[5][5] = "b) Acetyl salicylic acid";

questions[6][0] = "The second law of motion gives us a measure of which of the following physical quantities?";
questions[6][1] = "[A] Acceleration";
questions[6][2] = "[B] Force";
questions[6][3] = "[C] Power";
questions[6][4] = "[D] Work done";
questions[6][5] = "[B] Force";


questions[7][0] = "Who created BITCOIN?";
questions[7][1] = "A) Satoshi Nakamoto";
questions[7][2] = "B) Elon Musk";
questions[7][3] = "C) Sam Altman";
questions[7][4] = "D) Satya Nadella";
questions[7][5] = "A) Satoshi Nakamoto";


questions[8][0] = "In which of the following states of matter is the Interatomic or intermolecular distance fixed?";
questions[8][1] = "[A] Solids";
questions[8][2] = "[B] Liquids";
questions[8][3] = "[C] Gases";
questions[8][4] = "[D] Both a and b";
questions[8][5] = "[A] Solids";


questions[9][0] = "Which gas is produced when Calcium carbide is treated with water?";
questions[9][1] = "[A] Methane";
questions[9][2] = "[B] Ethyne";
questions[9][3] = "[C] Ethene";
questions[9][4] = "[D] LPG";
questions[9][5] = "[B] Ethyne";

questions[10][0] = "Who founded the search engine “Google”?";
questions[10][1] = "a) Larry Page & Sergey Brin";
questions[10][2] = "b) Sundar Pichai";
questions[10][3] = "c) Bill Gates";
questions[10][4] = "d) Steve Jobs, Steve Wozniak & Ronald Wayne";
questions[10][5] = "a) Larry Page & Sergey Brin";


questions[11][0] = "Where is Salim Ali National Park Located?";
questions[11][1] = "a) Kota, Rajasthan";
questions[11][2] = "b) Srinagar, Jammu & Kashmir";
questions[11][3] = "c) Bengaluru, Karnataka";
questions[11][4] = "d) Varanasi, Uttar Pradesh";
questions[11][5] = "b) Srinagar, Jammu & Kashmir";

questions[12][0] = "Currency of Bangladesh";
questions[12][1] = "a) Bangladeshi Dollar";
questions[12][2] = "b) Rupaya";
questions[12][3] = "c) Bangladeshi Rupee";
questions[12][4] = "d) Bangladeshi Taka";
questions[12][5] = "d) Bangladeshi Taka";

questions[13][0] = "Which Mughal ruler is associated with 'Bibi Ka Makbara'?";
questions[13][1] = "a) Akbar";
questions[13][2] = "b) Shah Jahan";
questions[13][3] = "c) Jehangir";
questions[13][4] = "d) Aurangazeb";
questions[13][5] = "d) Aurangazeb";


questions[14][0] = "Name a country which is present in both Asia & Europe";
questions[14][1] = "a) Russia";
questions[14][2] = "b) Kazakstan";
questions[14][3] = "c) Turkiye";
questions[14][4] = "d) Iran";
questions[14][5] = "d) Iran";

questions[15][0] = "Strait Located between India & Sri Lanka";
questions[15][1] = "a) Palk Strait";
questions[15][2] = "b) Malacca Strait";
questions[15][3] = "c) Sunda Strait";
questions[15][4] = "d) Yucatan Strait";
questions[15][5] = "a) Palk Strait";

questions[16][0] = "Which portal will have details of all registered doctors in India?";
questions[16][1] = "[A] National Medical Register";
questions[16][2] = "[B] National Unique Register";
questions[16][3] = "[C] Medical Practitioners Register";
questions[16][4] = "[D] Bharat Ayush Register";
questions[16][5] = "[A] National Medical Register";

questions[17][0] = "Which company has launched a skill development program for quantum computing in India?";
questions[17][1] = "[A] Microsoft";
questions[17][2] = "[B] AWS";
questions[17][3] = "[C] Google";
questions[17][4] = "[D] Apple";
questions[17][5] = "[B] AWS";

questions[18][0] = "Emaar, the first overseas company to invest in Kashmir, is based in which country?";
questions[18][1] = "[A] UAE";
questions[18][2] = "[B] Saudi Arabia";
questions[18][3] = "[C] Russia";
questions[18][4] = "[D] USA";
questions[18][5] = "[A] UAE";

questions[19][0] = "Who is the author of the book 'The God of Small Things'?";
questions[19][1] = "a) Ruskin Bond";
questions[19][2] = "b) Sudha Murthy";
questions[19][3] = "c) Arundhati Roy";
questions[19][4] = "d) Robert Frost";
questions[19][5] = "c) Arundhati Roy";



        
       
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
        //answers = Arrays.copyOf(answers, numQuestions);
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

        String time = "time left : " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahona", Font.BOLD, 25));

        
            
            
            if (timer > 0) {
            g.drawString(time, 1200, 450); 
        } else {
            g.drawString("Time's up!!", 1250, 450); 
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
                new Score(username, score); 
            } else {
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;

                if (count < questions.length) {
                    start(count);
                    timer = 15;
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
            timer = 15;
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
    timer = 15;
    score=0;
    submit.setEnabled(false);
}

    public static void main(String[] args) {
        new Qquiz("user");
    }
}

