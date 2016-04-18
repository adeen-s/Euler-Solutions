import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner stdin=new Scanner(System.in);
        PrintStream stdout=new PrintStream(System.out);
      long i=1,j=2;
        long c=3,N=stdin.nextLong();
        long lim=stdin.nextLong();
        long sum=2;
        for(int k=1;k<=N;k++)
            {
            while(c<lim)
                {
                c=i+j;
                i=j;
                j=c;
                if(c>lim)
                    break;
                if(c%2==0)
                    sum+=c;
                
            }
            stdout.println(sum);
            sum=2;
             i=1;j=2;c=3;
            lim=stdin.nextLong();
        }
    }
}
