class Solution {
    public boolean isPalindrome(int x) {
        int oldx = x;
        int reversed = 0;
        while (x != 0 && x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        if (reversed == oldx) {
            return true;
        } else {
            return false;
        }
    }
}