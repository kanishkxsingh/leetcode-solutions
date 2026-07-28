class Solution {
    //step 1: create a reverse function for array
    public void reverse(int[] nums,int start,int end)
    {
        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        //step 2: handle k>nums.length
        if(k>nums.length)
        {
            k=k%nums.length;  //k is non negative, so no need to worry about handling negative k
        }
        //step 3: reverse the entire array
        reverse(nums,0,nums.length-1);
        //step 4: reverse 1st k elements
        reverse(nums,0,k-1);
        // step 5: reverse remaining elements
        reverse(nums,k,nums.length-1);
    }
}