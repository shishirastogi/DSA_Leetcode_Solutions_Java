class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 1;
        int right = nums.length - 1;
        int currentSum = 0;
        int bestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;;
            while (left < right) {
                currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - currentSum) < Math.abs(target - bestSum) ) {
                    bestSum = currentSum;
                }
                if (currentSum == target) {
                    return currentSum;
                } else if (currentSum < target) {
                    left++;
                } else right--;
            }   
        }
        return bestSum;
    }
}