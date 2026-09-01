import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int Product1 = nums[n-1]*nums[n-2]*nums[n-3];
        int Product2 = nums[1]*nums[0]*nums[n-1];
        return Math.max(Product1 , Product2);
        
        
    }
}