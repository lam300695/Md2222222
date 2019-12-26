import java.util.Date;

public class stopWatch {
    private long startTime = 0;
    private long endTime = 0;

    public stopWatch() {
    }

    public stopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long result = endTime - startTime;
        return result;
    }
}
