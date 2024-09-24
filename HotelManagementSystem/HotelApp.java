package HotelManagementSystem;

public class HotelApp {

    public static void main(String[] args) {
        
    

    Cart cart = new Cart();
    Valet valet = new Valet();
    HouseKeeping houseKeeping = new HouseKeeping();

    FrontDesk facade = new FrontDesk(cart, valet, houseKeeping);
    String vehiclePlate = "XYZ1234";
        String roomNumber = "101";
        int numberOfCarts = 2;

    facade.onAll(vehiclePlate, roomNumber, numberOfCarts);
    }
    
}
