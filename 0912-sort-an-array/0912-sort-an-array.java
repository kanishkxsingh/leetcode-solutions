class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
    }

    public static void MergeSort(int nums[],int start,int end)
    {
        if(start==end)
        {
            return;
        }
        int mid=start+(end-start)/2;
        MergeSort(nums,start,mid); //divides the left half of array
        MergeSort(nums,mid+1,end); //divides the right half of array

        merge(nums,start,mid,end);
    }

    public static void merge(int nums[],int start,int mid,int end)
    {
      int temp[]=new int[end-start+1];
      int i=start,j=mid+1,k=0;
      while(i<=mid && j<=end)
      {
        if(nums[i]<=nums[j])
        {
            temp[k]=nums[i];
            i++;
            k++;
        }
        else
        {
            temp[k]=nums[j];
            j++;
            k++;
        }
      }
        while(i<=mid)
        {
            temp[k]=nums[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            temp[k]=nums[j];
            j++;
            k++;
        }
        k=0;
        while(start<=end)
        {
            nums[start]=temp[k];
            start++;
            k++;
        }
    }
}