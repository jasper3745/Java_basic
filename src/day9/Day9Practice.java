package day9;

public class Day9Practice {
    public static void main(String[] args) {
        Day9Jasper jasper1 = new Day9Jasper();
        jasper1.name = "박재준";
        jasper1.age = 15;
        jasper1.height = 169.8;
        jasper1.school = "중앙중학교";
        jasper1.gender = "남자";
        jasper1.country = "대한민국";
        jasper1.favoriteFood = "떡 볶 이";
        System.out.println("학교 = " + jasper1.school);
        jasper1.speaking();
        jasper1.eat();


    }


}
