package overriding;

public class bike extends Vehicle{
    public bike(String id){
    setId(id);
    }
    @Override
    public void moves(){
        System.out.println(getId()+"bike moves");
    }
}
