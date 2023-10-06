package overriding;

public class Car extends Vehicle {
    public Car(String id){
        //super(id);
        setId(id);
    }
    @Override
    public void moves(){
        System.out.println(getId()+"car moves");
    }
}
