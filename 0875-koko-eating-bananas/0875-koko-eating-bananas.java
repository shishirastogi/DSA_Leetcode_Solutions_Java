class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int k = 0;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canEat(mid, piles, h) == true) {
                k = mid;
                right = mid  - 1;
            } else if (canEat(mid, piles, h) == false) {
                left = mid + 1;
            }
        }
        return k;
    }
    public boolean canEat(int speed, int[] piles, int h) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
        }
        return totalHours <= h;
    }
}