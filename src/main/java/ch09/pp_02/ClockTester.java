package ch09.pp_02;

public class ClockTester {
    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock.getHours());
        System.out.println(clock.getMinutes());

        WorldClock worldClock = new WorldClock(3);
        System.out.println(worldClock.getTime());
    }
}
