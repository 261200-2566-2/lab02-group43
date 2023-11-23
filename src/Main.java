// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        test01();
        test02();
        test03();
        AirPurifier b = new AirPurifier("001");
        AirPurifier c = new AirPurifier("002");
        AirPurifier d = new AirPurifier("003");
        AirPurifier e = new AirPurifier("004");
        AirPurifier f = new AirPurifier("005");
        AirPurifier g = new AirPurifier("006");
        AirPurifier h = new AirPurifier("007");
        System.out.println(AirPurifier.getCount());
    }
    public static void test01(){ // Change fan speed testing
        AirPurifier a = new AirPurifier("Pro","SN00000001");
        a.ShowScreen();
        a.turnOn(27,10);
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
        a.turnOn(33,30);
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
        AirPurifier a = new AirPurifier("Lite","SN00000001");
        a.ShowScreen();
        a.turnOn(30,2);
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