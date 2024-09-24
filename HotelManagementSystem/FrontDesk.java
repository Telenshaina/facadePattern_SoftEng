package HotelManagementSystem;

public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService hotelService){
        this.hotelService = hotelService;
    }
    public void drive(){
        //hotelService.start();
        hotelService.accelerate();
        hotelService.brake();
        hotelService.stop();
    }
}
