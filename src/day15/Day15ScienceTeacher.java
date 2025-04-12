package day15;

public class Day15ScienceTeacher extends Day15EnglishTeacher{
    public Day15ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public void teacherSubject() {
        System.out.println("과학");
    }
}
