package HomeSystem;
//subsystem
public class Light implements HomeService  {
    public void turnOn(){
        System.out.println("Lights are On...");
    }
    public void turnOff(){
        System.out.println("Lights are Off...");
    }
}
