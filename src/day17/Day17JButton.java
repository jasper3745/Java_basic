package day17;

import javax.swing.*;

public class Day17JButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton 예제");
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("클릭하세요!");
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
