import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame implements ActionListener {

    private JTextField t1;
    private String operator = "";
    private double num1 = 0;
    private double num2 = 0;
    private boolean start = true;

    public Calc(){
        JFrame frame = new JFrame("Calculator");
        Container container = frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        container.add(panel, BorderLayout.CENTER);

        t1 = new JTextField("0");
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setFont(new Font("Consolas", Font.PLAIN, 30));
        container.add(t1, BorderLayout.NORTH);
        t1.setPreferredSize(new Dimension(280, 50));

        JButton b1 = new JButton("C");
        JButton b2 = new JButton("CE");
        JButton b3 = new JButton("/");
        JButton b4 = new JButton("*");
        JButton b5 = new JButton("1");
        JButton b6 = new JButton("2");
        JButton b7 = new JButton("3");
        JButton b8 = new JButton("+");
        JButton b9 = new JButton("4");
        JButton b10 = new JButton("5");
        JButton b11 = new JButton("6");
        JButton b12 = new JButton("-");
        JButton b13 = new JButton("7");
        JButton b14 = new JButton("8");
        JButton b15 = new JButton("9");
        JButton b16 = new JButton("=");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            if (start) {
                t1.setText(command);
                start = false;
            } else {
                t1.setText(t1.getText() + command);
            }
        } else if (command.equals("C")) {
            t1.setText("0");
            operator = "";
            num1 = num2 = 0;
            start = true;
        } else if (command.equals("CE")) {
            t1.setText("0");
            start = true;
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            operator = command;
            num1 = Double.parseDouble(t1.getText());
            start = true;
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(t1.getText());
            double result = 0;
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }
            t1.setText(String.valueOf(result));
            operator = "";
            start = true;
        }
    }

    public static void main(String[] args) {
        new Calc();
    }
}
