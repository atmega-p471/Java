public class Time {
    public int seconds;
    public Time(int seconds) {
        this.seconds = seconds % 86400; //24*60*60
    }

    public String toString() {
        int hours = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int sec = seconds % 60;

        return String.format("%d:%d:%d", hours, min, sec);
    }
}
