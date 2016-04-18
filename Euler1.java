import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        PrintStream stdout=new PrintStream(System.out);
     Scanner stdin=new Scanner(System.in);
      Long N=Long.parseUnsignedLong(stdin.next());
        long T;
        long c=0;
        for(int i=0;i<N;i++)
            {           
            T=Long.parseUnsignedLong(stdin.next());
            for(int j=2;j<T;j++)
                {
                if(j%3==0 || j%5==0)
                c=c+j;     
            }
                 stdout.println(c);
            c=0;
            }
        
    }
}
