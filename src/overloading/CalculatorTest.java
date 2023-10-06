package overloading;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator calcy=new Calculator();
        int res1=calcy.add(2,3);
        int res2=calcy.add(3,4,5);
        String res3=calcy.add("anjali","choudhary");
        System.out.println(res1);
        System.out.println(res3);
    }
}
