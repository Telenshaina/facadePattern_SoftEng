package HomeSystem;

public class TV implements HomeService {
    public void turnOn(){
        System.out.println("TV is On...");
    }
    public void turnOff(){
        System.out.println("TV is Off...");
    }
}
