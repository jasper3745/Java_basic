package day16;

public class Day16Mage implements Day16Attackable,Day16Healable{
    @Override
    public void attack() {
        System.out.println("마법사가 공격합니다.");
    }
    @Override
    public void heal() {
        System.out.println("마법사가 치유합니다.");
    }
}
