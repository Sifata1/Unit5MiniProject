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
        int h = hour;
        int m = min;
        int s = seconds;
        int total = (h * 3600) + (m * 60) + s;
        for (int i = 1; i != total; i++) {
            tick();
        }
    }

    public String toString() {

    }
}
