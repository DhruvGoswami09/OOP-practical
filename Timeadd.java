import java.util.*;

class Time {
    int hr;
    int min;

    void settime(int h, int m) {
        hr = h;
        min = m;
    }

    void display() {
        System.out.println(hr + " hr " + min + " min");
    }

    void addTime(Time t1, Time t2) {
        int total_minutes = t1.min + t2.min;
        int total_hours = t1.hr + t2.hr;

        if (total_minutes >= 60) {
            total_hours += total_minutes / 60;
            total_minutes = total_minutes % 60;
        }

        hr = total_hours;
        min = total_minutes;
    }
}

public class Timeadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        System.out.println("Enter hours for time T1 : ");
        int h1 = sc.nextInt();
        System.out.println("Enter minute for time T1 : ");
        int m1 = sc.nextInt();
        t1.settime(h1, m1);

        System.out.println("Enter hours for time T2 : ");
        int h2 = sc.nextInt();
        System.out.println("Enter minute for time T2 : ");
        int m2 = sc.nextInt();
        t2.settime(h2, m2);

        t3.addTime(t1, t2);

        System.out.println("Time t1 : ");
        t1.display();
        System.out.println("Time t2 : ");
        t2.display();
        System.out.println("Time t3 : ");
        t3.display();
    }
}