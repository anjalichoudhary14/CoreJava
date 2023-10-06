package overriding;

import java.security.PublicKey;

public class Customer {
    private long id;
    private String name;
    private static  int count;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
         count++;
    }

//    public Customer(){
//        count++;
//    }

    public static int getCount(){ //the method need not be part of object
        return count;
    }
//    @Override
//    public String toString(){
//        return id+"\n"+"name";
//    }
    @Override
    public String toString(){
        return id+" "+count+"-"+name;
    }
}
