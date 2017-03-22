public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid]){
                high=mid;
                low++;
            }else{
                low=mid;
                high--;
            }
        }
        return mid;
    }
}
