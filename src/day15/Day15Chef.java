package day15;

public class Day15Chef extends Day15Employee{
    public Day15Chef(String name) {
        super(name, "요리사");
    }

    @Override
    public void performDuties(){
        System.out.println(getName() + "이(가) 코드를 작성합니다.");
    }
}
