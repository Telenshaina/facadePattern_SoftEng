package HotelManagementSystem;
//subsystem
public class HouseKeeping implements HotelService {
    String roomNumber;

    public HouseKeeping (String roomNumber){
        this.roomNumber = roomNumber;
    }

    public void run(){
        System.out.println("Requesting to Clean Room :" + roomNumber);
    }
    public void cleanRoom(String roomNumber){
        System.out.println("Cleaning Room: " + roomNumber);
    }
}
