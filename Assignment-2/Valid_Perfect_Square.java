class Solution {
    public boolean isPerfectSquare(int x) {
        if (x>=0){
            long sr = (long)Math.sqrt(x);
            return (sr*sr==x);
        }
        return false;
    }
}