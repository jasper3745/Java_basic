package day15;

public class Day15Artist extends Day15Employee{
    public Day15Artist(String name) {
        super(name,"예술가");
    }
    @Override
    public void performDuties(){
        System.out.println(getName() + "이(가) 그림을 그립니다.");
    }
}
