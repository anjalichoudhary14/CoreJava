package equalsdemo;

public class Customer {
    public int id;
    private String name;
    public Customer(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public  boolean equals(Object obj){
        if(this==obj) //the one who is calling the equals method is (this)
        {
            return true;
        }
//        if(obj == null){
//            return false;
//        }
        if(obj==null ||! (obj instanceof Customer)){
            return false;
        }
        Customer that=(Customer) obj;
        return this.id== that.id; //left id ->current object
        }


}
