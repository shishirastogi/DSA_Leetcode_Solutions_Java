class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length - 1;
        if (nums.length == 0) {
            return 0;
        }
        int unique = 0;
        for (int i = 1; i <= size; i++) {
            if (nums[i] != nums[unique]) {
                unique++;
                nums[unique] = nums[i];   
            }
        }
        return unique + 1;
    }
}