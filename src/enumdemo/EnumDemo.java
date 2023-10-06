package enumdemo;

import com.sun.security.jgss.GSSUtil;

public class EnumDemo {
    public static void main(String[] args) {
        EnumDemo demo = new EnumDemo();
        DayBreak morningBreak = DayBreak.MorningTeaBreak; //static variable
        DayBreak lunchBreak = DayBreak.LunchBreak;
        DayBreak eveningBreak = DayBreak.EveningTeaBreak;
        System.out.println("Lunchbreak=" + lunchBreak + " " + lunchBreak.ordinal());
        //if i wanna iterate over these
        DayBreak values[] = DayBreak.values();
        System.out.println("************Printing the values of daybreak can have***********");
        for (DayBreak iteratedBreak : values) {
            System.out.println(iteratedBreak + " " + "position=" + iteratedBreak.ordinal());
            System.out.println("Starttime=" + " " + iteratedBreak.getStartTime());
            System.out.println("Duration=" + " " + iteratedBreak.getDurationInMinutes());
            System.out.println("***********************************************************");

        }
        DayBreak morningBreak1 = DayBreak.MorningTeaBreak;
        DayBreak morningBreak2 = DayBreak.MorningTeaBreak;
        boolean isSameObj = morningBreak2 == morningBreak1;
        System.out.println(isSameObj);
        DayBreak foundLunchBreak = demo.getBreak("lunchbreak");
        System.out.println("Starts at=" + " " + foundLunchBreak.getStartTime() + " " + "duration" + foundLunchBreak);

    }

    DayBreak getBreak(String breakType) {
        for (DayBreak iteratedBreak :DayBreak.values()){

            if (iteratedBreak.name().toLowerCase().equals(breakType.toLowerCase())) {
                return iteratedBreak;

            }

        }
        return null;
    }
}
