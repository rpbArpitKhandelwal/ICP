class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        // int[] res = new int[2];
        // if(nums.length==0 || nums.length==1 && nums[0]!=target){
        //     res[0] = -1;
        //     res[1] = -1;
        // }
        // return res;
        int low = BinarySearch(nums, target, true);
        int high = BinarySearch(nums, target, false);
        res[0] = low;
        res[1] = high;
        return res;
    }
    public static int BinarySearch(int[] nums, int target, boolean flag){
        int low=0;
        int high =nums.length-1;
        int i = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid +1;
            }
            else{
                i = mid;
                if(flag){
                    high = mid-1;

                }
                else{
                    low = mid+1;
                }
            }
        }
        return i;
    }

}