class Solution {
    public void sortColors(int[] nums) {
        int low=0;  //0 se leke low-1 tak sirf 0s honge
        int mid=0;//low se mid-1 tak sirf 1s honge.....mid se high tak unkown region hai
        int high=nums.length-1; //high+1 se n-1 tak 2s hai
        //hume basically unknown region ko shrink krte jana hai by expanding 0s and 2s region jab tk unkown region extincts

        while(mid<=high) //<= bcoz != means <high matlab arr[mid==high] check nhi ho payega
        {
           if(nums[mid]==0)
           {
            int temp=nums[low];  //swap krke 0 ko low region mein lake low++ krdenge taki 0 low-1 mein rahe
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;  //0s region ko extend krdiya since low-1 is 0s and mid badhaya bcoz 0 is checked and in right place
           }
           else if(nums[mid]==1)
           {
            mid++; //low ko nhi badhaya bcoz aage 0 encounter ho skta hai jisse swap krna pad jayega
           }
           else //ab bacha sirf 2
           {
             int temp=nums[mid];
             nums[mid]=nums[high]; //swap taki 2 high region jo ki high+1 se leke n-1 tk hai waha jaye aur wahaka unknown element unknown region mein aaye
             nums[high]=temp; //high +1 mein rahe isliye high-- krdete hai
             high--;

             //mid++ nhi kiya bcoz unknown element jo aya hai kuch bhi ho skta hai, toh usse compare toh krna padega na
           }
        }
    }
}

//TIME COMPLEXITY = O(N)........ITS A SINGLE PASS ARRAY SOLUTION
//SPACE COMPLEXITY = O(1)........NO EXTRA SPACE USED 