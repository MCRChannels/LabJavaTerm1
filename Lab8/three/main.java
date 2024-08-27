package three;

import java.awt.BorderLayout;

import javax.swing.*;


public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(250,300);
        frame.setVisible(true);
        frame.setEnabled(true);

        JButton b1 = new JButton("click");
        JPanel center = new JPanel();
        center.add(b1);
        frame.getContentPane().add(center, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
