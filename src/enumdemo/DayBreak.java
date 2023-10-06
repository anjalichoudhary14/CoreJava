package enumdemo;

public enum DayBreak {
    MorningTeaBreak(15,"11:30am"),
    //static everything variable and method will start with capital letters
    LunchBreak(60,"1:30pm"),
    EveningTeaBreak(15,"4:30pm");
    //private int duration;
    private String startTime;
    private int durationInMinutes;
    DayBreak(int durationInMinutes, String startTime){
        this.durationInMinutes=durationInMinutes;
        this.startTime=startTime;
    }
    public int getDurationInMinutes(){
        return durationInMinutes;
    }
    public String getStartTime(){
        return startTime;
    }
}
