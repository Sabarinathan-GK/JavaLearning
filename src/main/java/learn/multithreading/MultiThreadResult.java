package learn.multithreading;

public class MultiThreadResult {
    private String name;
    private String timeStamp;

    public MultiThreadResult(String name, String timeStamp) {
        this.name = name;
        this.timeStamp = timeStamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return name +" - "+timeStamp;
    }
}
