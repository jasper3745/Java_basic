package day3;

import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        double n1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        double n2 = sc.nextInt();
        System.out.println("세 번째 숫자를 입력하세요: ");
        double n3 = sc.nextInt();

        double num1 = (n1 + n2 + n3)/3.0;
        int num2 = (int) num1;

        System.out.println("average = " + num1);
        System.out.println("average = " + num2);

        double average4 = Math.round(num1);
        System.out.println("average4 = " + average4);

        int num = 3;
        String sNum = "" + num;
        System.out.println(sNum);
    }
}
