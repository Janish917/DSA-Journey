import java.util.Arrays;
class Solution {
    public int maxProductDifference(int[] nums) {
    Arrays.sort(nums);
    int min_product = nums[0]*nums[1];
    int max_product =   nums[nums.length-1]*nums[nums.length-2];
    return max_product-min_product; 
    }
}
