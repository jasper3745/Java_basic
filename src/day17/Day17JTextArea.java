package day17;

import javax.swing.*;
import java.awt.*;

public class Day17JTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);
        frame.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea(10,30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton button = new JButton("확인");

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(button,BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
