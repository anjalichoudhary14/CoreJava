package exceptiondemos;

public class ExDemo1 {
    public static void main(String[] args) {
        ExDemo1 demo=new ExDemo1();
        String input="";

        String result= demo.getBlockLetterString(input);
        //System.out.println();
//        String upperCased=substring.toUpperCase();
        System.out.println("input "+input);
System.out.println("result="+" "+result);
        //String employees[]={"kushal","santosh","rachna"};
    }

    //get substring starting from s and ending at n
    //get substring from 3 ending 6

    public String getBlockLetterString(String input){
//        String found=null;
//        for(int i =0;i<input.length();i++)
//        {
//            char startchar=input.charAt(i);
//
//        }
       try {
           char firstChar = input.charAt(0);
           char capitalCase = Character.toUpperCase(firstChar);
           String desired = capitalCase + input.substring(1);
           return desired;
           //String input.substring(3,6);
      }
       catch (NullPointerException e){
           System.out.println("input is null");
           return null;
       }
       catch (StringIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
           return null;
       }
       catch (Exception e){
           System.out.println("something went wrong");
           return null;
       }

    }
}
