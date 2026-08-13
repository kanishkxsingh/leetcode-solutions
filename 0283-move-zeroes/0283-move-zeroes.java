class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++) //j tracks and stops at 0 to be replaced and i checks every element to replace j 0 with i non 0
        {
            if(nums[i]!=0) //j moves only when the element is non zero...i moves every step
            {
               int temp=nums[i];
               nums[i]=0;
               nums[j]=temp;
               j++;
            }
            //even when if condition not true, no loss i increases and j remains at 0 waiting to be replaced and increemented
        }
    }
}

//classic 2 pointer approach jaha har ek 0 ko uske agle non 0 element se swap krna hai aur isme j ko 0 par rukake ensure krte hai
//consecutive 0 sequence mein 1st 0 of sequence hi replace ho...
//tc is o(n) and space is o(1)