package enumdemo;

import com.sun.security.jgss.GSSUtil;

public class EnumDemo {
    public static void main(String[] args) {
        DayBreak morningBreak=DayBreak.MorningTeaBreak; //static variable
        DayBreak lunchBreak=DayBreak.LunchBreak;
        DayBreak eveningBreak=DayBreak.EveningTeaBreak;
        System.out.println("Lunchbreak="+lunchBreak+" "+lunchBreak.ordinal());
        //if i wanna iterate over these
        DayBreak values[]=DayBreak.values();
        System.out.println("************Printing the values of daybreak can have***********");
        for (DayBreak iteratedBreak:values){
            System.out.println(iteratedBreak+" "+"position="+iteratedBreak.ordinal());
            System.out.println("Starttime="+" "+iteratedBreak.getStartTime());
            System.out.println("Duration="+" "+iteratedBreak.getDurationInMinutes());
            System.out.println("***********************************************************");

        }
        DayBreak morningBreak1=DayBreak.MorningTeaBreak;
        DayBreak morningBreak2=DayBreak.MorningTeaBreak;
        boolean isSameObj=morningBreak2==morningBreak1;
        System.out.println(isSameObj);
    }
}
