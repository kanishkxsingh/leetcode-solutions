class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0; //pointer i set at 0
        for(int j=1;j<nums.length;j++)   //pointer j starts from index 1
        {
            if(nums[i]!=nums[j])  //as soon as unique element found, OVERWRITE duplicate element at i+1 
            {
                nums[i+1]=nums[j];
                i=i+1; //update i pointer
            }
        }
        return i+1;
    } //always remember the array is already sorted, we jus have to bring the unique elements at start of the array one by one and return
    // the number of unique elements present in the array
}