class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> result=new ArrayList<>(); // a list which contains all triplet lists as specified by the return type of funcn

         Arrays.sort(nums); //built in java function to sort the array....sorted so that we can perform 2 sum for every i in the array

         for(int i=0; i<nums.length-2;i++)
         {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;  //skips the i and goes next i for same/duplicate i....and works since array is sorted
            }

            int j=i+1;
            int k=nums.length-1; // placed our indexes
            int target=0; // addition of triplets should be 0

            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]>target)
            {
               k--;
            }
            else if(nums[i]+nums[j]+nums[k]<target)
            {
                j++;
            }
            else
            {
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;  // after one triplet found, we still have to find other pairs(,) for that i....

                //now duplicates are skipped only if first set of triplets are obtained, else not.

            while(j<k && nums[j]==nums[j-1])  // handling duplicate j's
            {
                j++; //j pointer moves forward untill duplicates are there
            }

             while(k>j && nums[k]==nums[k+1])  // handling duplicate k's......here we check k with k-1 because k starts at last position
            {                                  // so index bound of array error for k+1 if k at last position
                k--; //k pointer moves backwards untill duplicates are there
            }
            }
            }
         }

         return result;
    }
}

// you had forgot the while loop btw....bruhh without while loop it doesnt check all pairs for every i

// you had used while(j!=k)....instead of (j<k)....its wrong because...
/*Why j != k is dangerous here
Case 1: They meet, then you move both Suppose at some point you have:

java

j = 4, k = 5
Loop condition: j != k → true, so you enter. Inside, say sum == 0, so you do:

java

j++; // j becomes 5
k--; // k becomes 4
Now you have:

java

j = 5, k = 4  → j > k
Next iteration:

Condition: j != k → 5 != 4 → true → loop continues.*/