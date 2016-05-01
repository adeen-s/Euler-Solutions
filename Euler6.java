public class Euler6
{
    public int sumOfSqr(int n)
    {
        return ((n*(n+1)*(2*n+1))/6);
    }
    public int sqrOfSum(int n)
    {
        return (int)(Math.pow((n*(n+1)/2),2));
    }
    public int solution()
    {
        return (sqrOfSum(100)-sumOfSqr(100));
    }
}
