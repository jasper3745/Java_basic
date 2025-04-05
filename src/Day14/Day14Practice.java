package Day14;

public class Day14Practice{
    public static void main(String[] args) {
        Day14ElectronicDevice electronicDevice = new Day14ElectronicDevice("모든 기기");
        Day14Smartphone smartphone = new Day14Smartphone("스마트폰");
        Day14Laptop laptop = new Day14Laptop("노트북");
        Day14TV tv = new Day14TV("Tv");

        Day14ElectronicDevice[] dvices = new Day14ElectronicDevice[4];
        dvices[0] = electronicDevice;
        dvices[1] = smartphone;
        dvices[2] = laptop;
        dvices[3] = tv;


        for(int i = 0; i < 4; i++){
            dvices[i].turnOn();
        }System.out.println();
        for (int i = 0; i < 4; i++){
            dvices[i].turnOff();
        }


    }
}
