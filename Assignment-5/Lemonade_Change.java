class Solution {
    public boolean lemonadeChange(int[] bills) {
        int b5 = 0, b10 = 0;
        for (int bill : bills) {
            if (bill == 5) {
                b5++;
            } 
            else if (bill == 10) {
                if (b5 == 0) return false;
                b5--;
                b10++;
            } 
            else {
                if (b10 > 0 && b5 > 0) {
                    b10--;
                    b5--;
                } 
                else if (b5 >= 3) {
                    b5 -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
