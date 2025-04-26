package day17;

import javax.swing.*;
import java.awt.*;

public class Day17JTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jpanel 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        JButton button = new JButton("확인");

        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}
