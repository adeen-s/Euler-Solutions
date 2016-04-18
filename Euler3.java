import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        PrintStream stdout=new PrintStream(System.out);
        long c=0;        
        long t=stdin.nextLong();
        long n;
        for(int j=0;j<t;j++)
            {
            n=stdin.nextLong();
            c=0;
        for (long i = 2; i <= n; i++) 
        {  
             while (n % i == 0) 
                 {  
                 if(i>c)
                      c=i;  
                      n /= i;  
                 }
            
        }
            stdout.println(c);


    }
}
}
