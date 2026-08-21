class Solution {
    public int romanToInt(String s) {
        int end = s.length() - 1;
        int sum = 0;
        int prevalue = 0;
        for (int i = end; i >= 0; i--) {
            char getcharacter = s.charAt(i);
            int value = 0;
            switch (getcharacter) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
            }
            if (value < prevalue) {
                sum -= value;
            } else {
                sum += value;
            }
            prevalue = value;
        }
        return sum;
    }
}