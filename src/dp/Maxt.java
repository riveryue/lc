package dp;

public class Maxt {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(1);
        System.out.println(System.currentTimeMillis());
        System.out.println(numTrees(3));
    }
    private static int numTrees(int n) {
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
