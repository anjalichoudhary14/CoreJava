package interfacedemo;

public class DisplayCalculation {

    public static void main(String[] args){

        ScientificCalculator calculator=new CasioCalculator(); //code is always based on the LHS
        //int result=calculator.add(1,2);
        //System.out.println("result="+result);
        String resultString=calculator.add("Anjali","Choudhary");
        //int result=calculator.add(1,2);
        System.out.println(resultString);
        //System.out.println(result);


    }

}
