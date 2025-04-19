package day16;

public class Day16Interface {
    public static void main(String[] args) {
        Day16Flyable bird = new Day16Bird();
        Day16Swimmable fish = new Day16Fish();
        Day16Duck duck  = new Day16Duck();

        bird.fly();
        fish.swim();
        duck.fly();
        duck.swim();

        Day16Attackable warrior = new Day16Warrior();
        Day16Healable priest = new Day16Priest();
        Day16Mage mage = new Day16Mage();

        warrior.attack();
        priest.heal();
        mage.attack();
        mage.heal();
    }
}
