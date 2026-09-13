class Solution {
    public boolean check(int[] nums) {
        int right = nums.length;
        int sortcount = 0;
        for (int i = 0; i < right; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                sortcount++; 
            }
        }
        return sortcount <= 1;
    }
}