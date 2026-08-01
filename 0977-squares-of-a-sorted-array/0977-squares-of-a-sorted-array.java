class Solution {

    void merge(int a[], int l, int m, int r)
    {

      	int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

      	for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

        void Mergesort(int a[], int l, int r)
    {
        if (l < r) {
          
            int m = (l + r) / 2;

            // Sort first and second halves
            Mergesort(a, l, m);
            Mergesort(a, m + 1, r);

            // Merge the sorted halves
            merge(a, l, m, r);
        }
    }

        public int[] sortedSquares(int[] nums) {
       //int answer []=new int[nums.length]; //new array created to store the answers

       for(int i=0;i<nums.length;i++) //squaring the elements of the array
       {
        nums[i]=nums[i]*nums[i];
       } 

       Mergesort(nums,0,nums.length-1);  //sorting the squared array

       return nums;

       // TC = O(NLOGN) + O(N)....BASICALLY OF SORTING AND SQUARING
       // SC = O(1).....NO EXTRA SPACE USED APART FROM QUESTION ARRAY
    }
}