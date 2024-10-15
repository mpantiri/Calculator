import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator1 {
    private JPanel Calculator;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JTextField textField1;
    private JButton plusButton;
    private JButton ResultButton;
    private JButton a0Button;
    private JButton AcButton;
    private JButton MultiButton;
    private JButton DivButton;
    private JButton BackButton;

    double a, b, result;
    String op;

    public Calculator1() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a2Button.getText());
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                op = "+";
                textField1.setText(textField1.getText() + " + ");
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a5Button.getText());
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a0Button.getText());
            }
        });

        AcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        MultiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                op = "x";
                textField1.setText(textField1.getText() + " x ");
            }
        });
        DivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                op = "/";
                textField1.setText(textField1.getText() + " / ");
            }
        });
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace=null;
                if (textField1.getText().length()>0)
                {
                    StringBuilder strB=new StringBuilder(textField1.getText());
                    strB.deleteCharAt(textField1.getText().length()-1);
                    backspace=String.valueOf(strB);
                    textField1.setText(backspace);
                }
            }
        });

        ResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] parts = textField1.getText().split(" ");
                b = Double.parseDouble(parts[2]);

                if (op.equals("+")) {
                    result = a + b;
                } else if (op.equals("x")) {
                    result = a * b;
                } else if (op.equals("/")) {
                    if (b == 0) {
                        textField1.setText("Can't divide with 0");
                        return;
                    }
                    result = a / b;
                }

                textField1.setText(a + " " + op + " " + b + " = " + result);

            }
        });







    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator1");
        frame.setContentPane(new Calculator1().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
