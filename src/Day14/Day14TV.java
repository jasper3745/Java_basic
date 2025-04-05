package Day14;

public class Day14TV extends Day14ElectronicDevice{

    public Day14TV(String name) {
        super(name);
    }

    @Override
    public void turnOn(){
        System.out.println(getName() + "이(가) 켜졌습니다.");
    }

    @Override
    public void turnOff(){
        System.out.println(getName() + "이(가) 꺼졌습니다.");
    }
}
