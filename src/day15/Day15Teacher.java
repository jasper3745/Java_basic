package day15;


public abstract class Day15Teacher{
    private String name;

    public Day15Teacher(String name) {
        this.name = name;
    }

    public void introduce(){
        System.out.println(name);
    }
    public abstract void teacherSubject();


}
