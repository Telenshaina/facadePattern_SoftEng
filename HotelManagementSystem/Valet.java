package HotelManagementSystem;
//subsystem
public class Valet implements HotelService {
    
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void run() {
        System.out.println("Valet service: Picking up vehicle with plate number: " + plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet service: Vehicle with plate number " + plateNumber + " is picked up.");
    }

}
