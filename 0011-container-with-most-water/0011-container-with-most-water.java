
class Solution {
    public int maxArea(int[] height) {
        int tail = height.length - 1;
        int head = 0;
        int max_area = 0;
        while (head < tail) {
            int current_area = (tail - head) * Math.min(height[head], height[tail]);
            max_area = Math.max(max_area, current_area);
            if (height[head] < height[tail]) {
                head++;
            } else {
                tail--;
            }
        }
        return max_area;
    }
}