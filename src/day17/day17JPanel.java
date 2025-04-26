package day17;

import javax.swing.*;
import java.awt.*;

public class day17JPanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Jpanel 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("CNN 폭파");
        JButton button = new JButton("펑");

        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
