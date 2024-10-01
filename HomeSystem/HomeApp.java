package HomeSystem;

public class HomeApp {
    // client main
    public static void main(String[] args) {
        
        TV tV = new TV();
        Light light = new Light();
        AirConditioning airConditioning = new AirConditioning();
        HomeInterface facade = new HomeInterface(tV, airConditioning, light);

        facade.turnOnAll();
        System.out.println();
        facade.turnOffAll();

        
    }
}
