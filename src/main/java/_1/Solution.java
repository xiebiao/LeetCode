package _1;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[j] + nums[k] == target) {
                    return new int[]{j, k};
                }
            }
        }
        return null;
    }
}
