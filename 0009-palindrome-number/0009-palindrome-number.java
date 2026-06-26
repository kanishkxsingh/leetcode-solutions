class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int lastDigit=0;
        int revNum=0;
        while(num!=0)
        {
            lastDigit=num%10;
            revNum=revNum*10+lastDigit;
            num=num/10;
        }
        if(revNum==Math.abs(x))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}