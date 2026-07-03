class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size == 0) {
            return 0;
        }
        
        int unique_idx = 0;
        // int[] output = {};
        for (int explorer_idx = 1; explorer_idx <= nums.length - 1; explorer_idx++) {
            if (nums[explorer_idx] != nums[unique_idx]) {
                unique_idx++;
                nums[unique_idx] = nums[explorer_idx];   
            }
        }
        return unique_idx + 1;
    }
}