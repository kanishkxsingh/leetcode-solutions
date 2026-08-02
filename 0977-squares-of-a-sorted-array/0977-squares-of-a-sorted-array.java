class Solution {
        public int[] sortedSquares(int[] nums) {
            int answer[]=new int[nums.length];  // new array created for answer
            int i=0;
            int j=nums.length-1;  //dont use for loop bcoz we want conditional increement of the pointers(negative numbers can be there)
                                  // however not guaranteed that every array would have them...so input array can be positive too
            int k=answer.length-1; //pointer for answer array storing
            while(i<=j)
            {
                if(nums[i]*nums[i]>nums[j]*nums[j])
                {
                    answer[k--]=nums[i]*nums[i];
                    i++;  //i increases only if that elements value stored in answer
                }
                else
                {
                    answer[k--]=nums[j]*nums[j];
                    j--;  //j decreases only if that elements value is stored in answer
                }

                // above also handles equal values on both sides since pointer moves conditionally and not simultaneously
            } 

            return answer;  //return the final answer array                     
    }                             
}