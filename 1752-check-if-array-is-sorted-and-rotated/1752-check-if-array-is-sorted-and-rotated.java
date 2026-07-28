class Solution {
    public boolean check(int[] nums) {
        int breaks=0;
        if(nums[nums.length-1]>nums[0])
        {
            breaks++;
        }
        for(int i=0;i<=nums.length-2;i++)
        {
            if(nums[i]>nums[i+1])
            {
                breaks++;
            }
        }
        if(breaks>1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}