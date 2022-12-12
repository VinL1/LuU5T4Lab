public class ActivityTrackerRunner {
    public static void main(String[] args) {

        // target goal of 120 minutes of activity
        ActivityTracker tracker = new ActivityTracker(120);

        int total = tracker.getTotalMinutes();
        System.out.println(total);

        int sessions = tracker.getSessions();
        System.out.println(sessions);

        int maxMinTracked = tracker.getMaxMinutes();
        System.out.println(maxMinTracked);

        boolean goalMet = tracker.goalAchieved();
        System.out.println(goalMet);
        System.out.println(); // blank line

        tracker.logMinutes(35);
        System.out.println(tracker.getTotalMinutes());
        System.out.println(tracker.getSessions());
        System.out.println(tracker.getMaxMinutes());
        System.out.println(tracker.goalAchieved());
        System.out.println(); // blank line

        tracker.logMinutes(30);
        System.out.println(tracker.getTotalMinutes());
        System.out.println(tracker.getSessions());
        System.out.println(tracker.getMaxMinutes());
        System.out.println(tracker.goalAchieved());
        System.out.println(); // blank line

        tracker.logMinutes(45);
        System.out.println(tracker.getTotalMinutes());
        System.out.println(tracker.getSessions());
        System.out.println(tracker.getMaxMinutes());
        System.out.println(tracker.goalAchieved());
        System.out.println(); // blank line

        tracker.logMinutes(15);
        System.out.println(tracker.getTotalMinutes());
        System.out.println(tracker.getSessions());
        System.out.println(tracker.getMaxMinutes());
        System.out.println(tracker.goalAchieved());
    }
}
