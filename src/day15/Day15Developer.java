package day15;

public class Day15Developer extends Day15Employee{

    public Day15Developer(String name) {
        super(name, "환자");
    }

    @Override
    public void performDuties(){
        System.out.println(getName() + "이(가) 코드를 작성합니다.");
    }
}
