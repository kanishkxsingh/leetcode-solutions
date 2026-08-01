class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;  //setting the 2 pointers at proper position
        int j=numbers.length-1; //array is always indexed 0, jus that question assumes and checks against 1 indexed array

        while(numbers[i]+numbers[j]!=target)  //loop runs till we get our answer
        {
            if(numbers[i]+numbers[j]>target) //if sum exceeds target, it means target is smaller than 1st+last element hence j--
            {
                j--;
            }
            else // vice versa of above
            {
                i++;
            }
        }
        return new int[] {i+1,j+1};  //return an array on answer indices
    }
}