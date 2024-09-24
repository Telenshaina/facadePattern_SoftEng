public class CarFacade{
    private Car car;

    public CarFacade(Car car){
        this.car = car;
    }
    public void drive(){
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    }
}