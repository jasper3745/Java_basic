package day15;

public abstract class Day15Employee {
    private String name;
    private String role;

    public Day15Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    public void StartWork(){
        System.out.println(name + " (" + role + ")이(가) 일을 시작합니다.");
    }
    public abstract void performDuties();

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

}
