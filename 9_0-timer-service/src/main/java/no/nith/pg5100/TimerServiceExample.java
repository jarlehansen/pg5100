package no.nith.pg5100;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import java.util.Date;

@Stateless
public class TimerServiceExample {

    @Schedule(hour = "16", minute = "43")
    public void timerCallback() {
        System.out.println("timerCallback method called: " + new Date());
    }

    // Every 10 seconds within the minute, starting at second 30
    @Schedule(hour = "*", minute = "*", second = "*/10")
    public void timerCallback2() {
        System.out.println("timerCallback2 method called: " + new Date());
    }
}
