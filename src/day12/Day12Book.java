package day12;

public class Day12Book {

    String title;
    String author;
    boolean isRented = false;

    public Day12Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void introduce(){
        System.out.println("제목: " + title + ", 대여 상태: " + isRented);
    }

    public void rentBook(){
        if(!isRented){
            isRented = true;
            System.out.println(title + "이(가) 대여되었습니다.");
        }
        else{
            System.out.println(title + "은(는) 이미 대여 중입니다.");
        }
    }
}
