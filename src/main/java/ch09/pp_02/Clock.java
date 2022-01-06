package ch09.pp_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Clock {

    public Clock() {
    }

    public String getHours(){
        String time = LocalTime.now().toString();
        return time.split(":")[0];
    }

    public String getMinutes(){
        String time = LocalTime.now().toString();
        return time.split(":")[1];
    }

    public String getTime() {
        return getHours() + ":" + getMinutes();
    }


}
