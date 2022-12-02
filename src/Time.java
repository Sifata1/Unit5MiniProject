public class Time {
    private int hour;
    private int min;
    private int seconds;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.min = minute;
        this.seconds = second;
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            min++;
        }
        if (min == 60) {
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
    }

    public void add(String time) {
        int h = Integer.parseInt(time.substring(0,1));
        int m = Integer.parseInt(time.substring)
    }

    public String toString() {

    }
}
