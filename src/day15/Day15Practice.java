package day15;

public class Day15Practice {
    public static void main(String[] args) {

        Day15MathTeacher mathTeacher = new Day15MathTeacher("수학 선생님");
        Day15EnglishTeacher englishTeacher = new Day15EnglishTeacher("영어 선생님");
        Day15ScienceTeacher scienceTeacher = new Day15ScienceTeacher("과학 선생님");

        Day15Teacher[] teachers = new Day15Teacher[3];
        teachers[0] = mathTeacher;
        teachers[1] = englishTeacher;
        teachers[2] = scienceTeacher;

        for(int i = 0; i < 3; i++){
            teachers[i].introduce();
            teachers[i].teacherSubject();
        }
    }



}
