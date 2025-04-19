package day16;

import java.lang.reflect.AnnotatedType;

public class Day16Warrior implements Day16Attackable {
    @Override
    public void attack() {
        System.out.println("전사가 공격합니다.");
    }
}
