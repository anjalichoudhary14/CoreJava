package overriding;

public abstract class Vehicle {
    private String id;
// constructor not needed as it an abstract class but we are not creating any object
    //so no use of constructor
//    public Vehicle(String id) {
//       this.id = id;
//   }
    public abstract void moves();
public String getId(){
        return id;
}
public void setId(String id){
    this.id=id;
}
}
