class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        while (start <= end) {
            middle = start + (end - start) / 2;
             if (target == nums[middle]) {
                return middle;
            }
            if (nums[start] <= nums[middle]) {
                if (nums[start] <= target && target <= nums[middle]){
                    end = middle - 1;
                } else { start = middle + 1; }
            }
            else if (nums[middle] < target && target <= nums[end] ) {
                start = middle + 1;
            } else { end = middle - 1; }
        }
        return -1;
    }
}