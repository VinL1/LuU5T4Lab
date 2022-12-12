import java.util.Scanner;

public class ActivityTrackerRunner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();

        // create an ActivityTracker object
        ActivityTracker tracker = new ActivityTracker (goal);

        // repeatedly ask user to enter an activity session's number of minutes
        // and enter -1 when done entering
        int input = 0;
        while (!(input == -1)) {
            System.out.println ("Enter the number of minutes for your activity session, -1 to end: ");
            input = scan.nextInt();
            if (input != -1) {
                tracker.logMinutes (input);
            }
        }

        // log the number of minutes associated with each activity session

        // when the user is done entering numbers, end the loop and
        // tell the user their stats:
        // - total sessions logged
        // - total minutes logged
        // - max minutes logged
        // - did they reach their goal?

        System.out.println ("Good job being active! Let's look at your stats: ");
        System.out.println ("Number of sessions: " + tracker.getSessions());
        System.out.println ("Total number of minutes: " + tracker.getTotalMinutes());
        System.out.println ("Longest session logged (max minutes): " + tracker.getMaxMinutes());
        System.out.print ("You reached your goal: " + tracker.goalAchieved());
    }
}
