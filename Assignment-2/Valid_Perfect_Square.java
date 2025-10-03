class Solution {

    public boolean isPerfectSquare(int x) {
        if (x < 0)
            return false;
        if (x == 0 || x == 1)
            return true;
        long left = 1, right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return true;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
