class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  //sorting array for 2 sum of each i
        int difference=0; //to calculate current target and triplet difference
        int smallestDiff=Integer.MAX_VALUE; //to keep a track, update and compare the smallest difference
        // kept at max for 1st iteration as diff should be smaller than smallestDiff to update smallestDiff
        int sum=0; //sum of current triplet
        int closestSum=0; //to store the closest sum to target

        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;  //pointers
            
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                difference=target-sum;

                if(Math.abs(difference)<smallestDiff)  //closest sum to target would be having smallestDifference with the target
                {
                    smallestDiff=Math.abs(difference);
                    closestSum=sum;
                }
                if(sum==target)  //closest sum possible is sum=target for which difference =0.
                {
                    return sum;
                }
                else if(sum>target)  // pointer movement as per 2 sum
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }

        return closestSum;
    }
}