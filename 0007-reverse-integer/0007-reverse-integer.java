class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);  //stored the absolute value of x in num
        int lastDigit=0; //stores lastdigit
        int revNum=0; //stores reverse of given number
        while(num!=0)
        {
            lastDigit=num%10;
            if(revNum>(Integer.MAX_VALUE-lastDigit)/10)  //checked prior itself whether revnum*10+lastdigit exceeds max int value
            {
                return 0;
            }
            revNum=revNum*10+lastDigit;
            num=num/10;
        }

        if(x<0)  //restoring the original sign
        {
            return -revNum;
        }
        else
        {
            return revNum;
        }
    }
}