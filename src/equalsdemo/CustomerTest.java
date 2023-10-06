package equalsdemo;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Anjali");
        Customer customer2 = new Customer(1, "Anjali");

  //Customer customer2 = customer1; //here return true
//        if (customer1 == customer2) {
//            System.out.println("hello"); //return false
//        }
        boolean isSame=customer1==customer2;
        System.out.println("is same="+isSame);
        boolean isEquals=customer1.equals(customer2);
        System.out.println("is equals="+isEquals);
    }
}
