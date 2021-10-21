/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        https://leetcode.com/problems/two-sum/
        */



public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        loop:
        for (int i = 0; i < nums.length; i++) {
            for (int n = 0; n < nums.length; n++) {
                int sum = nums[i] + nums[n];
                if (sum == target && n != i) {
                    ans[0] = i;
                    ans[1] = n;
                    break loop;
                }
            }
        }
        return ans;

        
    }
}
