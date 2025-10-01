import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int c=1;
        int e=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= e) {
                c++;
                e=intervals[i][1];
            }
        }
        return intervals.length-c;
    }
}
