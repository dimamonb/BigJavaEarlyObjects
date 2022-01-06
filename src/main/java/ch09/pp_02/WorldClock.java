package ch09.pp_02;

public class WorldClock extends Clock{

    private int timeOffset;

    public WorldClock(int timeOffset) {
        this.timeOffset = timeOffset;
    }

    @Override
    public String getHours() {
        String hoursString = super.getHours();
        return Integer.parseInt(hoursString) + timeOffset + "";
    }
}
