class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = (m*n)-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int a = matrix[mid/n][mid%n];
            if(a==target) return true;
            else if(a>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;

    }
}
//TC = O(log(m*n))
// SC= O(1)

