import java.time.LocalTime;

public class Task1
{

    public static void main(String[] args)
    {
        greetInTimeFrame("Alina");
    }


    public static void greetInTimeFrame(String name)
    {
        System.out.println("Greet person with name " + name);

        LocalTime lct = LocalTime.now();
        int timeNow = lct.getHour();

        int[] startTimes = {0, 5, 10, 17};
        int[] dueTimes = {5, 10, 17, 23};

        if (startTimes[0] < timeNow && timeNow < dueTimes[0]) {
            System.out.println("Good night, " + name + " !");
        } else if (startTimes[1] < timeNow && timeNow < dueTimes[1]) {
            System.out.println("Good morning, " + name + " !");
        } else if (startTimes[2] < timeNow && timeNow < dueTimes[2]) {
            System.out.println("Good afternoon, " + name + " !");
        } else if (startTimes[3] < timeNow && timeNow < dueTimes[3]) {
            System.out.println("Good evening, " + name + " !");
        }
    }

}
