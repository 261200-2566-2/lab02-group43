import java.util.Objects;

public class AirPurifier {
    String model;
    String SN;
    boolean power;
    int temp,den,FanSP;
    String Mode = "";

    void turnOn(int temp,int den){
        power = true;
        this.temp = temp;
        this.den = den;
        FanSP = 1;
        Mode = "Normal";
    }
    void turnOff(){
        power = false;
        temp = 0;
        den = 0;
        FanSP = 0;
        Mode = "";
    }
    void changeFanSpeed(){
        FanSP++;
        if(FanSP>3){
            FanSP=1;
        }
    }
    void changeMode(){
        if(Objects.equals(Mode, "Normal")){
            Mode = "Performance";
            FanSP = 3;
        }
        else if(Objects.equals(Mode, "Performance")){
            Mode = "Silence";
            FanSP = 1;
        }
        else if(Objects.equals(Mode, "Silence")){
            Mode = "Normal";
        }
    }
    void ShowScreen(){
        if(power) {
            System.out.println("Power: On");
        }
        else{
            System.out.println("Power: Off");
        }
        System.out.println("Temperature: "+temp+" °C");
        System.out.println("PM2.5 Density: "+den+" μg/m³");
        System.out.println("Fan Speed: "+FanSP);
        System.out.println("Mode: "+Mode);
        System.out.println("---------------");
    }

    AirPurifier(String SN){
        model = "Pro"; this.SN = SN;
        Count++;
    }
    AirPurifier(String model, String SN) {
        this.model = model; this.SN = SN;
        Count++;
    }

    static int Count;
    static int getCount(){
        return Count;
    }

}


