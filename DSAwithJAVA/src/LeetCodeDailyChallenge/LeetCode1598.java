package LeetCodeDailyChallenge;

public class LeetCode1598 {
    public static int minOperations(String[] logs) {
        int level =0;
        for(String log : logs)
        {
            if(log.equals("../"))
            {
                if(level != 0)
                {
                    level --;
                }
            }
            else if(log.equals("./"))
            {
                continue;
            }
            else {
                level ++;
            }
        }
        return level;
    }
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        int ans = minOperations(logs);
        System.out.println("minimum operation to reach at parent directory is : "+ ans);
    }
}
