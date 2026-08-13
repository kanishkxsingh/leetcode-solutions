class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int []arr=new int[nums.length]; //space o(n)

        for(int i=0;i<arr.length;i++) //time o(n)
        {
            arr[i]=nums[i];
        }

        Arrays.sort(arr); //time o(nLogn)
        int i=0;
        int j=nums.length-1;
        while(i<j&&nums[i]==arr[i]) //time o(n)
        {
            i++;
        }
        while(i<j&&nums[j]==arr[j]) //time o(n)
        {
            j--;
        } //atp both loops have run and i and j are at their respective points where comparison fails
        //else i=j for single element array and i is at i>j(hence 2nd loop doesnt run at all) for sorted array

        if(i>=j) //to handle sorted and single element edge case
        {
            return 0;
        }
        else
        {
            return j-i+1;
        }
    }
}