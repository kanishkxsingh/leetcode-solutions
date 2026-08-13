class Solution {
    public int findUnsortedSubarray(int[] nums) {
        //pehle hum single element and already sorted array ke edge case ko handle krte hai...
        if(nums.length==1)
        {
            return 0;
        }
        int left=-1; //default values taki l-r+1=0 return ho agar array already sorted hai
        int right=-2;
        //ab hum dono tarafse jaha sorted sequence tutta hai, woh boundaries mark krlenge
        for(int i=0;i<nums.length-1;i++) //O(n) time
        {
           if(nums[i]>nums[i+1]) //left boundary marked at very 1st violation
           {
            left=i;
            break; //taki aage ke violation par left na mark ho jaye
           }
        }

        if(left==-1) //even after looping if such is the case, then means array already sorted (sorted array edge case handled)
        {
           return 0;
        }

        for(int i=nums.length-1;i>0;i--) //O(n) time
        {
           if(nums[i]<nums[i-1]) //right boundary marked at very 1st violation
           {
            right=i;
            break; //taki aage ke violation par left na mark ho jaye
           }
        }

        //Ab hume problematic region mil gya hai....BUTT...uss region ke bahar either sides still ek aisa element 
        //ho skta hai jo ki problematic ho....kyuki humne sirf local neighbours se compare kiya every element
        //globally each element ko all rest individual array elements se compare nhi kiya
        //in short uss problematic region ko sort krke bhi kuch cases mein poora array sort nhi ho skta kyuki
        //sorted problematic array ka smallest yani ki 1st element overall array ke 1st element se still CHOTA ho skta hai
        //and vice versa...iss problem ko solve krne ke liye expand the boundaries with help of min and max of probmatic subarray

        //lets find min and max 
        int min=Integer.MAX_VALUE;  
        int max=Integer.MIN_VALUE;
        for(int i=left;i<=right;i++) //O(n) time
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }

        //now lets update subArray boundaries
        int i=left;
        while(i>=0) //left boundary updated    //O(n) time
        {
            if(nums[i]>min)
            {
                left=i;
            }
            i--;
        }
        int j=right;
        while(j<=nums.length-1) //right boundary updated     //O(n) time
        {
            if(nums[j]<max)
            {
                right=j;
            }
            j++;
        }

        return right-left+1;
    }
}

//TC=O(5N)
//SC=O(1)

//focus on handling sorted array case else array outta bound since later i=left( which is i=-1 in case of sorted array since left nd right do not update).
//can optimise while loops using :
/*
// Left boundary update
while (left > 0 && nums[left - 1] > min) {
    left--;
}

// Right boundary update
while (right < nums.length - 1 && nums[right + 1] < max) {
    right++;
}
*/