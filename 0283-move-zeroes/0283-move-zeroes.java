class Solution {
    public void moveZeroes(int[] nums) {
       int snowBallSize=0; //can use counter too lol
       for(int i=0;i<nums.length;i++)
       {
          if(nums[i]==0)
          {
            snowBallSize++;
          }
          else if(snowBallSize>0) //executes only when if() condition is false, i.e for >0 numbers only
          {
            int temp=nums[i];
            nums[i]=0;
            nums[i-snowBallSize]=temp;
          }
       } 
    }
}