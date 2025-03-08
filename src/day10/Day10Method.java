package day10;

public class Day10Method {
    public static void main(String[] args) {
        int result = add(1, 2);
        System.out.println("result = " + result);

        Day10Cat cat1 = new Day10Cat("wowns", 3);

        System.out.println(cat1.name);
        System.out.println(cat1.age);
    }

    public static int add(int a, int b) {
        return  a + b;
    }
}
