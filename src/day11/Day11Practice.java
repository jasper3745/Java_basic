package day11;

import java.util.Scanner;

public class Day11Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day11User example = new Day11User();

        System.out.println("아이디를 입력하세요.");
        example.setId(sc.next());
        System.out.println("비밀번호를 입력하세요");
        example.setPassword(sc.next());
        System.out.println("당신의 아이디: " + example.getId());
        System.out.println("당신의 비밀번호: " + example.getPassword());
        System.out.println("으로 가입이 완료되었습니다.");
        System.out.println("\n비밀번호 변경을 시작 합니다.\n로그인 후 진행 됩니다.");
        System.out.println("아이디를 입력하세요.");
        String i = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String p = sc.next();
        if(i.equals(example.getId()) && p.equals(example.getPassword())) {
            System.out.println("로그인 성공!");
            System.out.println("새로운 비밀번호를 입력하세요: ");
            String newp = sc.next();
            example.setPassword(newp);
            System.out.println("[변경 성공] 비밀번호 변경에 성공했습니다!");
        }
    }
}
