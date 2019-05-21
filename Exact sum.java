import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            int s=in.nextInt();
            int d=a[0];
            int l=0,p=0;
            Arrays.sort(a);
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]+a[j]==s)
                    {
                        l=a[i];
                        p=a[j];
                    }
                }
            }
            System.out.println("Peter should buy books whose prices are "+l+" and "+p+".\n");
            
        }
    }
}
