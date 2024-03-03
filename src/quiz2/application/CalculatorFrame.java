package quiz2.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    private JTextField display;
    private String currentInput = "";
    private double result = 0;
    private char lastOperator = ' ';

    public CalculatorFrame() {
        setTitle("Calculator");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "Backspace"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.matches("[0-9]")) {
                currentInput += buttonText;
            } else if (buttonText.matches("[/+\\-*]")) {
                performOperation();
                lastOperator = buttonText.charAt(0);
            } else if (buttonText.equals("=")) {
                performOperation();
                lastOperator = ' ';
            } else if (buttonText.equals(".")) {
                if (!currentInput.contains(".")) {
                    currentInput += buttonText;
                }
            } else if (buttonText.equals("C")) {
                currentInput = "";
                result = 0;
                lastOperator = ' ';
            } else if (buttonText.equals("Backspace")) {
                if (!currentInput.isEmpty()) {
                    currentInput = currentInput.substring(0, currentInput.length() - 1);
                }
            }

            display.setText(currentInput.isEmpty() ? String.valueOf(result) : currentInput);
        }

        private void performOperation() {
            if (!currentInput.isEmpty()) {
                double inputNumber = Double.parseDouble(currentInput);

                switch (lastOperator) {
                    case '+':
                        result += inputNumber;
                        break;
                    case '-':
                        result -= inputNumber;
                        break;
                    case '*':
                        result *= inputNumber;
                        break;
                    case '/':
                        if (inputNumber != 0) {
                            result /= inputNumber;
                        } else {
                            JOptionPane.showMessageDialog(CalculatorFrame.this, "Error: Cannot divide by zero.");
                        }
                        break;
                    default:
                        result = inputNumber;
                }

                currentInput = "";
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorFrame calculatorFrame = new CalculatorFrame();
            calculatorFrame.setVisible(true);
        });
    }
}
