import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int head1 = 0;
        int tail1 = nums1.length - 1;
        int head2 = 0;
        int tail2 = nums2.length - 1;
        HashSet<Integer> output = new HashSet<>();
        for (head1 = 0; head1 <= tail1; head1++) {
            for (head2 = 0; head2 <= tail2; head2++) {
                if (nums1[head1] == nums2[head2]) {
                    output.add(nums1[head1]);
                }
            }
        }
        int[] result = new int[output.size()];
        int i = 0;
        for (int num : output) {
        result[i++] = num;
        }
        return result;
    }
}