package day9;

import java.util.Scanner;

public class Day9Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char st = '*';
        char sp = ' ';
        int h = sc.nextInt();
        for (int n = 1; n <= h; n++) {
            for(int i = 0; i < n-1; i++)
                System.out.print(sp);
            for (int i = 0; i < 2 * h - n ; i++) {
                System.out.print(st);
            }
            System.out.println();
        }
    }
}
