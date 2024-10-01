package HomeSystem;
//facade
public class HomeInterface {
    private TV tV;
    private AirConditioning airConditioning;
    private Light light;

    public HomeInterface(TV tV, AirConditioning airConditioning, Light light) {
        this.tV = tV;
        this.airConditioning = airConditioning;
        this.light = light;
    }

    public void turnOnAll() {
        tV.turnOn();
        airConditioning.turnOn();
        light.turnOn();
    }

    public void turnOffAll() {
        tV.turnOff();
        airConditioning.turnOff();
        light.turnOff();
    }
}
