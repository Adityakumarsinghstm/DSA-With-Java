package LeetCodeDailyChallenge;

public class LeetCode1701 {
    public double averageWaitingTime(int[][] customers) {
        int idleTime = 1;
        long totalWaitingTime = 0;
        for(int [] customer :customers)
        {
            if(idleTime<=customer[0])
            {
                idleTime = customer[0]+customer[1];
            }
            else{
                idleTime = idleTime + customer[1];
            }
            totalWaitingTime += (idleTime - customer[0]);
        }
        double avg = (totalWaitingTime / (double)customers.length);
        return avg;

    }
    public static void main(String[] args) {

    }
}
