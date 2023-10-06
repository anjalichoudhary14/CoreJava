package interfacedemo;

public class SamsungCalculator implements Calculator{
   // @Override
    public int add(  int num1, int num2){

        return num1+num2;
    }

//    @Override
//    public int add(  int num1, int num2){
//
//        return num1+num2;
//    }
   @Override
    public String add(String str1, String str2){
       return str1+str2;
   }
}
