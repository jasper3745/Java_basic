package day12;

import java.util.Scanner;

public class Day12OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day12Calculator calc = new Day12Calculator();
        Day12Payment paym = new Day12Payment();
        Day12ShapeCalculator SC = new Day12ShapeCalculator();

//        // 두 정수를 더하는 메서드 호출
//        System.out.println("두 정수의 합: " + calc.add(3,5));
//        // 세 정수를 더하는 메서드 호출
//        System.out.println("세 정수의 합: " + calc.add(3,5,7));
//        // 두 실수를 더하는 메서드 호출
//        System.out.println("두 실수의 합: " + calc.add(3.5,5.2));

        System.out.println("두 상품의 총액: " + paym.calculate(sc.nextInt(), sc.nextInt()));
        System.out.println("세 상품의 총액: " + paym.calculate(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        System.out.println("두 상품의 총액(실수): " + paym.calculate(sc.nextDouble(), sc.nextDouble()));
        System.out.println("연필(1500원) 몇 개를 구매할까요? ");
        System.out.println("연필 총액: " + paym.calculate(sc.nextInt()) + "원 입니다");

        System.out.println("정사각형 면적: " + SC.side(sc.nextInt()));
        System.out.println("직사각형 면적: " + SC.side(sc.nextInt(),sc.nextInt()));
        System.out.println("원의 면적: " + SC.radius(sc.nextInt()));
    }
}
