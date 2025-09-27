import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.offer(nums[i]);

        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
               pq.poll();
               pq.offer(nums[i]); 
            }
        }
        return pq.peek();
    }
}