public class Euler4
{
    public static void main(String args[])
    {
        int largest=0;
        for(int i=100;i<=999;i++)
        {
            for(int j=100;j<=999;j++)
            {
                if(isPalindrome(i*j) && (i*j)>largest)
                {
                    largest=i*j;
                }
            }
        }
        System.out.println(largest);
    }

    public static boolean isPalindrome(int n)
    {
        int dig=0,num=0,n2=n;
        while (n>0)
        {
            dig=n%10;
            num=num*10+dig;
            n/=10;
        }
        if(num==n2)
        return true;
        return false;
    }
}
