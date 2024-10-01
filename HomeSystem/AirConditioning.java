package HomeSystem;
//subsystem
public class AirConditioning implements HomeService {
    public void turnOn(){
        System.out.println("AirConditioner is On...");
    }
    public void turnOff(){
        System.out.println("AirConditioner is Off...");
    }
}
