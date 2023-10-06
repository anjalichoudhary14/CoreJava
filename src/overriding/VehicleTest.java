package overriding;

public class VehicleTest {
    public static void main(String[] args){
        Vehicle vehicle=new Car("ka1234");
        vehicle.moves();
        Vehicle vehicle1= new bike("bi890");
        vehicle1.moves();
    }
}
