package day13;

public class Day13Inheritance {
    public static void main(String[] args) {

        //animal
        Day13Animal animal = new Day13Animal("일반 동물");
        animal.makeSound();

        Day13Tiger tiger = new Day13Tiger("호랭이");
        tiger.makeSound();
        tiger.hunt();

        Day13Lion lion = new Day13Lion("사자");
        lion.eat();
        lion.roar();

        Day13Penguin penguin = new Day13Penguin("펭귄");
        penguin.eat();
        penguin.swim();

//        //vehicle
//        Day13Vehicle vehicle = new Day13Vehicle();
//        vehicle.setSpeed(50);
//        vehicle.move();
//
//
//        Day13Car car = new Day13Car();
//        car.setSpeed(80);
//        car.move();
//        car.refuel();
//        car.refuel();
//        car.refuel();
//        car.refuel();
//        car.refuel();
//        car.refuel();
//
//        Day13Bicycle bicycle = new Day13Bicycle();
//        bicycle.setSpeed(20);
//        bicycle.move();
//        bicycle.pedal();

    }
}
