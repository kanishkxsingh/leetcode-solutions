class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l1=new ArrayList<>();  //to return the ans lists
        Arrays.sort(nums); //to perform 3 sum for every element

        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) //to prevent i duplicates
            {
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) //to prevent j duplicates
                {
                    continue;
                }

                int left=j+1;
                int right=nums.length-1;  //2 pointers for remaining 2 numbers
                while(left<right)
                {
                    long sum= (long) nums[i]+nums[j]+nums[left]+nums[right];  // ineteger overflow happens for array with 4 1X10^9 elements......can happen in 3 sum too tho
                    if(sum==target)
                    {
                        l1.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;

                    while(left<right && nums[left]==nums[left-1]) //to avoid left duplicates
                    {
                        left++;
                    }

                    while(left<right && nums[right]==nums[right+1]) //to avoid right duplicates
                    {
                        right--;
                    }
                    }
                    else if(sum<target)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
        }
        return l1;  //returning final answer list
    }
}