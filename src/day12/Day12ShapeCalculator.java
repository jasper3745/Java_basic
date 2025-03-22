package day12;

public class Day12ShapeCalculator {
    double PI = 3.14;

    public int side(int a){
        return a * a;
    }
    public int side(int a,int b){
        return a * b;
    }
    public double radius(double a){
        return a * a * PI;
    }
}
