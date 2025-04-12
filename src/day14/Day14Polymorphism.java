package day14;

import day13.Day13Lion;
import day13.Day13Penguin;

public class Day14Polymorphism {
    public static void main(String[] args) {
        Day13Lion lion = new Day13Lion("사자");
        lion.makeSound();

        Day13Penguin penguin = new Day13Penguin("펭귄");
        penguin.makeSound();
    }
}
