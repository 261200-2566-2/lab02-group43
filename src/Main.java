// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        test01();
        test02();
        test03();
    }
    public static void test01(){ // Change fan speed testing
        AirPurifier a = new AirPurifier("Pro","SN00000001");
        a.ShowScreen();
        a.turnOn();
        a.ShowScreen();

        a.changeFanSpeed();
        a.ShowScreen();
        a.changeFanSpeed();
        a.ShowScreen();
        a.changeFanSpeed();
        a.ShowScreen();

        a.turnOff();
        a.ShowScreen();
    }

    public static void test02(){ // Change mode testing
        AirPurifier a = new AirPurifier("Pro","SN00000001");
        a.ShowScreen();
        a.turnOn();
        a.ShowScreen();

        a.changeMode();
        a.ShowScreen();
        a.changeMode();
        a.ShowScreen();
        a.changeMode();
        a.ShowScreen();

        a.turnOff();
        a.ShowScreen();
    }
    public static void test03(){ // Change mode testing
        AirPurifier a = new AirPurifier("SN00000001");
        a.ShowScreen();
        a.turnOn();
        a.ShowScreen();

        a.changeMode();
        a.ShowScreen();
        a.changeFanSpeed();
        a.ShowScreen();
        a.changeMode();
        a.ShowScreen();
        a.changeFanSpeed();
        a.ShowScreen();

        a.turnOff();
        a.ShowScreen();
    }

}