import java.util.*;

public class Main {

    public static int solution(int[] coins, int sum) {
        int[] dp = new int[sum + 1];

        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 4;

        System.out.println(solution(coins, sum));
    }
} 
