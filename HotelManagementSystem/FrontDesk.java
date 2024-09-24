package HotelManagementSystem;

public class FrontDesk {
    //facade
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk(Valet valet, HouseKeeping houseKeeping, Cart cart) {
        this.valet = valet;
        this.houseKeeping= houseKeeping;
        this.cart = cart;
    }

    public void onAll(String plateNumber, String roomNumber, int numberOfCarts) {
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        cart.requestCart(numberOfCarts);
    }

    

    
}
