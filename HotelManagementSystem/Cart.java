package HotelManagementSystem;
//subsystem
public class Cart implements HotelService  {
    
    
    private Integer numberOfCarts;

    public Cart(Integer numberOfCarts) {
        this.numberOfCarts =numberOfCarts;
    }
    public void run() {
        System.out.println("Cart service: Requesting number of carts: "+ numberOfCarts);
    }

    public void requestCart(Integer numberOfCarts) {
        System.out.println(numberOfCarts + " luggage cart/s requested");
    }

    
    
    
}


