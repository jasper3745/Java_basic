package day9;

public class Day9Class {
    public static void main(String[] args) {
        Day9Dog dog1 = new Day9Dog();
        dog1.name = "김율";
        dog1.age = 2;
        dog1.smell = "";
        dog1.bark();
        dog1.eat();

        System.out.println("강아지 이름 = " + dog1.name);
        System.out.println("강아지 나이 = " + dog1.age);

        Day9Dog dog2 = new Day9Dog();
        dog2.name = "뽀삐";
        dog2.age = 4;
        dog2.smell = "";
        dog2.bark();
        dog2.eat();

        System.out.println("강아지 이름 = " + dog2.name);
        System.out.println("강아지 나이 = " + dog2.age);
    }
}
