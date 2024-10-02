package HotelManagementSystem;
//client main
public class HotelApp {

    public static void main(String[] args) {
        
        Cart cart = new Cart(null);
        Valet valet = new Valet(null);
        HouseKeeping houseKeeping = new HouseKeeping(null);

      
        FrontDesk facade = new FrontDesk(valet, houseKeeping, cart);
        
        String vehiclePlate = "XYZ1234";
        String roomNumber = "101";
        int numberOfCarts = 2;

        // Using facade to access all services
        facade.onAll(vehiclePlate, roomNumber, numberOfCarts);
    }
}
