package Exercise_10_01;

public class Exercise_10_01 {
    public static void main (String[] args){
        Time The_Time = new Time(555550000);
        Time The_Time02 = new Time();

        System.out.printf("%d:%d:%d%n%n", The_Time02.getHour(), The_Time02.getMinute(), The_Time02.getSecond());

         System.out.printf("%d:%d:%d%n%n", The_Time.getHour(), The_Time.getMinute(), The_Time.getSecond());


         The_Time02.setTime(2432423534L);
          System.out.printf("%d:%d:%d%n%n", The_Time02.getHour(), The_Time02.getMinute(), The_Time02.getSecond());
    }
}

class Time {
    private long mex_time;


    public Time(){mex_time = System.currentTimeMillis();}

    public Time(long The_Time) {mex_time = The_Time;}


public void setTime(long elapsedTime){mex_time = elapsedTime;}
public int getHour() {return (int)(mex_time/ (1000 *60 * 60)) % 24;}
public int getMinute() {return (int)(mex_time/ (1000 * 60)) % 60;}
public int getSecond() {return (int)(mex_time / (1000) % 60);}

}