package day13;

public class Day13Car extends Day13Vehicle{

    int fuel;

    public void refuel(){
        fuel += 10;
        System.out.println("자동차가 연로를 충전합니다. 남은 연료: " + fuel + "L");
    }
}

