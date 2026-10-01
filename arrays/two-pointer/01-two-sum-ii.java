class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 1;
        int right = nums.length;
        int[] ans = new int[2];
        while(left<right){
            int  sum = nums[left-1]+ nums[right-1];
            if(sum<target){
                left++;
            } else if(sum>target){
                right--;
            } else{
                ans[0] = left;
                ans[1] = right;
                break;
            }
        }
return ans;
    }
}
