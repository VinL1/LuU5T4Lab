public class ActivityTracker{
    private int totalTime;
    private int timesLogged;
    private int longest;
    private int goal;

    public ActivityTracker (int goal) {
        this.goal = goal;
    }

    public void logMinutes (int current) {
        totalTime += current;
        timesLogged ++;
        if (current > longest) {
            longest = current;
        }
    }

    public int getSessions () {
        return timesLogged;
    }

    public int getTotalMinutes () {
        return totalTime;
    }

    public int getMaxMinutes () {
        return longest;
    }

    public boolean goalAchieved () {
        return (totalTime == goal);
    }
}
