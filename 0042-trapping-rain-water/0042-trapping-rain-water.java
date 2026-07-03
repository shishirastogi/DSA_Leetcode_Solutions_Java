class Solution {
    public int trap(int[] height) {
        int first = 0;
        int last = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int gapSum = 0;
        
        while (first < last) {
            if (height[first] < height[last]) {
                if (height[first] >= leftMax) {
                    leftMax = height[first];
                } else {
                    gapSum += leftMax - height[first];
                }
                first++;
            } else if (height[last] <= height[first]) {
                if (height[last] >= rightMax) {
                    rightMax = height[last];
                } else {
                    gapSum += rightMax - height[last];
                }
                last--;
            }
        }
        return gapSum;
    }
}