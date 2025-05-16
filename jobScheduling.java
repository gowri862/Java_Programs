import java.util.Arrays;

class Job {
    char id;
    int deadline, profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    public static void scheduleJobs(Job[] jobs) {
        // Step 1: Sort jobs in descending order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // Step 3: Create time slots
        char[] schedule = new char[maxDeadline];
        boolean[] slotUsed = new boolean[maxDeadline];
        Arrays.fill(schedule, '-');

        int totalProfit = 0;

        // Step 4: Try placing each job
        for (Job job : jobs) {
            for (int j = job.deadline - 1; j >= 0; j--) {
                if (!slotUsed[j]) {
                    schedule[j] = job.id;
                    slotUsed[j] = true;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Output
        System.out.print("Job sequence: ");
        for (char c : schedule) {
            if (c != '-') System.out.print(c + " ");
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('a', 4, 20),
            new Job('b', 1, 10),
            new Job('c', 1, 40),
            new Job('d', 1, 30)
        };
        scheduleJobs(jobs);
    }
}
