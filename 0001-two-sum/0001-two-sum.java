class Solution {
    public int[] twoSum(int[] nums, int target) {
        // jus sort the array, and then use 2 pointer logic... tc would be o(nlogn)+o(n) and sc would be o(1)....
        //for now les jus solve it in o(n^2)...
        int answer[]=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)  //j=i+1 ensures same i element is not checked for addition with self as we want 2 distinct number sums and 2 distinct indices.....
            {
                if(nums[i]+nums[j]==target)
                {
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }

        return answer;
    }
}