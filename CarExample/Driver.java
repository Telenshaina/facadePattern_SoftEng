public class Driver{
    public static void main(String[] args){
        Car car = new ConcreteCar();
        CarFacade facade = new CarFacade(car);

        facade.drive();
    }
}