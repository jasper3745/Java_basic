package day15;

public class Day15EnglishTeacher extends Day15Teacher{
    public Day15EnglishTeacher(String name) {
        super(name);
    }

    @Override
    public void teacherSubject() {
        System.out.println("영어");
    }
}
