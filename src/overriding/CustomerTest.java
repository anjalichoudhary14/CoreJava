package overriding;

import java.util.concurrent.Callable;

public class CustomerTest {
    public static void main(String[] args){

        Customer customer1= new Customer(10, "anjali");
        Customer customer2=new Customer(11,"suhsma");
        int count =Customer.getCount();
        System.out.println("Count"+ " "+count);
        String str=customer1.toString();
        System.out.println(str);
        //System.out.println(customer1); //if we use println and pass object then it will print
        //internally call the tostring method
    }
}
