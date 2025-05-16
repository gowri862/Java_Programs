public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        int maxLen = 1;

        // Step 1: Initialize dp[] to 1
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }

        // Step 2: Build the dp[] array
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int lisLength = lengthOfLIS(arr);
        System.out.println("Length of LIS: " + lisLength);
    }
}
