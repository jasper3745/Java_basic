package day13;

public class Day13Vehicle {
    int speed;

    public void move(){
        System.out.println("교통수단이 움직입니다. 속도: " + speed + "km/h");
    }
    public int getspeed(){
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
