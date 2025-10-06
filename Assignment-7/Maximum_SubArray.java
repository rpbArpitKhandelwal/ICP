// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = nums[0];
//         int currsum = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             currsum = Math.max(nums[i], currsum + nums[i]);
//             sum = Math.max(sum, currsum);
//         }
//         return sum;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int maxSum = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }
}
