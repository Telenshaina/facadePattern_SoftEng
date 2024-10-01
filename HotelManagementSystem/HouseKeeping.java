package HotelManagementSystem;
//subsystem
public class HouseKeeping implements HotelService {
    public void cleanRoom(String roomNumber){
        System.out.println("Cleaning Room:" + roomNumber);
    }
}
