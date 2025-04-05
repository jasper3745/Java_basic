package day13;

public class Day13Penguin extends Day13Animal {

    public Day13Penguin(String name) {
        super(name);
    }

    public void swim(){
        System.out.println(getName() + "이(가) 물속을 헤엄칩니다!");
    }

    @Override
    public void makeSound() {
        System.out.println("꽥꽥?");
    }
}
